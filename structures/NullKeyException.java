/**
 * NullKeyException class
 * @author Garikai 
 * @author Sam Rebelsky
 */
package structures;
public class NullKeyException extends Exception {
  public NullKeyException() {
    super("Null key");
  }

  public NullKeyException(String reason) {
    super(reason);
  } 
} 