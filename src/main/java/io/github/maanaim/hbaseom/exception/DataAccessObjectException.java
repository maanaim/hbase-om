package io.github.maanaim.hbaseom.exception;

public class DataAccessObjectException extends Exception {

  private static final long serialVersionUID = 1L;

  public DataAccessObjectException() {
    super();
  }
  
  public DataAccessObjectException(String message) {
      super(message);
  }

  public DataAccessObjectException(String message, Throwable cause) {
      super(message, cause);
  }

  public DataAccessObjectException(Throwable cause) {
      super(cause);
  }
  
}
