package org.tron.core.exception;

public class TooBigTransactionException extends CypherException {

  public TooBigTransactionException() {
    super();
  }

  public TooBigTransactionException(String message) {
    super(message);
  }
}
