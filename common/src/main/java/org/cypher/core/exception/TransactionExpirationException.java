package org.tron.core.exception;

public class TransactionExpirationException extends CypherException {

  public TransactionExpirationException() {
    super();
  }

  public TransactionExpirationException(String message) {
    super(message);
  }

}