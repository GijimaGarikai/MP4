/**
 * KeyNotFoundException class
 * @author Garikai 
 * @author Sam Rebelsky
 */
package structures;
public class KeyNotFoundException extends Exception {
  public KeyNotFoundException() {
    super();
  }

  public KeyNotFoundException(String reason) {
    super(reason);
  } 
} 