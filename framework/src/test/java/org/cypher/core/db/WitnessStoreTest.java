package org.tron.core.db;

import com.google.protobuf.ByteString;
import java.io.File;
import lombok.extern.slf4j.Slf4j;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tron.common.application.CypherApplicationContext;
import org.tron.common.utils.FileUtil;
import org.tron.core.Constant;
import org.tron.core.capsule.WitnessCapsule;
import org.tron.core.config.DefaultConfig;
import org.tron.core.config.args.Args;
import org.tron.core.store.WitnessStore;

@Slf4j
public class WitnessStoreTest {

  private static final String dbPath = "output-witnessStore-test";
  private static CypherApplicationContext context;

  static {
    Args.setParam(new String[]{"-d", dbPath}, Constant.TEST_CONF);
    context = new CypherApplicationContext(DefaultConfig.class);
  }

  WitnessStore witnessStore;

  @AfterClass
  public static void destroy() {
    Args.clearParam();
    context.destroy();
    FileUtil.deleteDir(new File(dbPath));
  }

  @Before
  public void initDb() {
    this.witnessStore = context.getBean(WitnessStore.class);
  }

  @Test
  public void putAndGetWitness() {
    WitnessCapsule witnessCapsule = new WitnessCapsule(ByteString.copyFromUtf8("100000000x"), 100L,
        "");

    this.witnessStore.put(witnessCapsule.getAddress().toByteArray(), witnessCapsule);
    WitnessCapsule witnessSource = this.witnessStore
        .get(ByteString.copyFromUtf8("100000000x").toByteArray());
    Assert.assertEquals(witnessCapsule.getAddress(), witnessSource.getAddress());
    Assert.assertEquals(witnessCapsule.getVoteCount(), witnessSource.getVoteCount());

    Assert.assertEquals(ByteString.copyFromUtf8("100000000x"), witnessSource.getAddress());
    Assert.assertEquals(100L, witnessSource.getVoteCount());

    witnessCapsule = new WitnessCapsule(ByteString.copyFromUtf8(""), 100L, "");

    this.witnessStore.put(witnessCapsule.getAddress().toByteArray(), witnessCapsule);
    witnessSource = this.witnessStore.get(ByteString.copyFromUtf8("").toByteArray());
    Assert.assertEquals(witnessCapsule.getAddress(), witnessSource.getAddress());
    Assert.assertEquals(witnessCapsule.getVoteCount(), witnessSource.getVoteCount());

    Assert.assertEquals(ByteString.copyFromUtf8(""), witnessSource.getAddress());
    Assert.assertEquals(100L, witnessSource.getVoteCount());
  }


}