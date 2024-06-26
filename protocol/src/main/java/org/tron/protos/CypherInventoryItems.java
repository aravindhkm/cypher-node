// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/CypherInventoryItems.proto

package org.tron.protos;

public final class CypherInventoryItems {
  private CypherInventoryItems() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InventoryItemsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protocol.InventoryItems)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 type = 1;</code>
     */
    int getType();

    /**
     * <code>repeated bytes items = 2;</code>
     */
    java.util.List<com.google.protobuf.ByteString> getItemsList();
    /**
     * <code>repeated bytes items = 2;</code>
     */
    int getItemsCount();
    /**
     * <code>repeated bytes items = 2;</code>
     */
    com.google.protobuf.ByteString getItems(int index);
  }
  /**
   * Protobuf type {@code protocol.InventoryItems}
   */
  public  static final class InventoryItems extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protocol.InventoryItems)
      InventoryItemsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InventoryItems.newBuilder() to construct.
    private InventoryItems(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InventoryItems() {
      type_ = 0;
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InventoryItems(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              type_ = input.readInt32();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                items_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
                mutable_bitField0_ |= 0x00000002;
              }
              items_.add(input.readBytes());
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = java.util.Collections.unmodifiableList(items_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tron.protos.CypherInventoryItems.internal_static_protocol_InventoryItems_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tron.protos.CypherInventoryItems.internal_static_protocol_InventoryItems_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tron.protos.CypherInventoryItems.InventoryItems.class, org.tron.protos.CypherInventoryItems.InventoryItems.Builder.class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>int32 type = 1;</code>
     */
    public int getType() {
      return type_;
    }

    public static final int ITEMS_FIELD_NUMBER = 2;
    private java.util.List<com.google.protobuf.ByteString> items_;
    /**
     * <code>repeated bytes items = 2;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getItemsList() {
      return items_;
    }
    /**
     * <code>repeated bytes items = 2;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     * <code>repeated bytes items = 2;</code>
     */
    public com.google.protobuf.ByteString getItems(int index) {
      return items_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (type_ != 0) {
        output.writeInt32(1, type_);
      }
      for (int i = 0; i < items_.size(); i++) {
        output.writeBytes(2, items_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, type_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < items_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(items_.get(i));
        }
        size += dataSize;
        size += 1 * getItemsList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.tron.protos.CypherInventoryItems.InventoryItems)) {
        return super.equals(obj);
      }
      org.tron.protos.CypherInventoryItems.InventoryItems other = (org.tron.protos.CypherInventoryItems.InventoryItems) obj;

      boolean result = true;
      result = result && (getType()
          == other.getType());
      result = result && getItemsList()
          .equals(other.getItemsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.tron.protos.CypherInventoryItems.InventoryItems parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tron.protos.CypherInventoryItems.InventoryItems parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tron.protos.CypherInventoryItems.InventoryItems parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tron.protos.CypherInventoryItems.InventoryItems parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tron.protos.CypherInventoryItems.InventoryItems parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tron.protos.CypherInventoryItems.InventoryItems parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tron.protos.CypherInventoryItems.InventoryItems parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tron.protos.CypherInventoryItems.InventoryItems parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tron.protos.CypherInventoryItems.InventoryItems parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.tron.protos.CypherInventoryItems.InventoryItems parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tron.protos.CypherInventoryItems.InventoryItems parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tron.protos.CypherInventoryItems.InventoryItems parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.tron.protos.CypherInventoryItems.InventoryItems prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.InventoryItems}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protocol.InventoryItems)
        org.tron.protos.CypherInventoryItems.InventoryItemsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tron.protos.CypherInventoryItems.internal_static_protocol_InventoryItems_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tron.protos.CypherInventoryItems.internal_static_protocol_InventoryItems_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tron.protos.CypherInventoryItems.InventoryItems.class, org.tron.protos.CypherInventoryItems.InventoryItems.Builder.class);
      }

      // Construct using org.tron.protos.CypherInventoryItems.InventoryItems.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        type_ = 0;

        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tron.protos.CypherInventoryItems.internal_static_protocol_InventoryItems_descriptor;
      }

      public org.tron.protos.CypherInventoryItems.InventoryItems getDefaultInstanceForType() {
        return org.tron.protos.CypherInventoryItems.InventoryItems.getDefaultInstance();
      }

      public org.tron.protos.CypherInventoryItems.InventoryItems build() {
        org.tron.protos.CypherInventoryItems.InventoryItems result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.tron.protos.CypherInventoryItems.InventoryItems buildPartial() {
        org.tron.protos.CypherInventoryItems.InventoryItems result = new org.tron.protos.CypherInventoryItems.InventoryItems(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.type_ = type_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.items_ = items_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.tron.protos.CypherInventoryItems.InventoryItems) {
          return mergeFrom((org.tron.protos.CypherInventoryItems.InventoryItems)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tron.protos.CypherInventoryItems.InventoryItems other) {
        if (other == org.tron.protos.CypherInventoryItems.InventoryItems.getDefaultInstance()) return this;
        if (other.getType() != 0) {
          setType(other.getType());
        }
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.tron.protos.CypherInventoryItems.InventoryItems parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.tron.protos.CypherInventoryItems.InventoryItems) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int type_ ;
      /**
       * <code>int32 type = 1;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>int32 type = 1;</code>
       */
      public Builder setType(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 type = 1;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<com.google.protobuf.ByteString> items_ = java.util.Collections.emptyList();
      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = new java.util.ArrayList<com.google.protobuf.ByteString>(items_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated bytes items = 2;</code>
       */
      public java.util.List<com.google.protobuf.ByteString>
          getItemsList() {
        return java.util.Collections.unmodifiableList(items_);
      }
      /**
       * <code>repeated bytes items = 2;</code>
       */
      public int getItemsCount() {
        return items_.size();
      }
      /**
       * <code>repeated bytes items = 2;</code>
       */
      public com.google.protobuf.ByteString getItems(int index) {
        return items_.get(index);
      }
      /**
       * <code>repeated bytes items = 2;</code>
       */
      public Builder setItems(
          int index, com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes items = 2;</code>
       */
      public Builder addItems(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureItemsIsMutable();
        items_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes items = 2;</code>
       */
      public Builder addAllItems(
          java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, items_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes items = 2;</code>
       */
      public Builder clearItems() {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:protocol.InventoryItems)
    }

    // @@protoc_insertion_point(class_scope:protocol.InventoryItems)
    private static final org.tron.protos.CypherInventoryItems.InventoryItems DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tron.protos.CypherInventoryItems.InventoryItems();
    }

    public static org.tron.protos.CypherInventoryItems.InventoryItems getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InventoryItems>
        PARSER = new com.google.protobuf.AbstractParser<InventoryItems>() {
      public InventoryItems parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InventoryItems(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InventoryItems> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InventoryItems> getParserForType() {
      return PARSER;
    }

    public org.tron.protos.CypherInventoryItems.InventoryItems getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_InventoryItems_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_InventoryItems_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037core/CypherInventoryItems.proto\022\010proto" +
      "col\"-\n\016InventoryItems\022\014\n\004type\030\001 \001(\005\022\r\n\005i" +
      "tems\030\002 \003(\014BR\n\017org.tron.protosB\024CypherInv" +
      "entoryItemsZ)github.com/tronprotocol/grp" +
      "c-gateway/coreb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_protocol_InventoryItems_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protocol_InventoryItems_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_InventoryItems_descriptor,
        new java.lang.String[] { "Type", "Items", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
