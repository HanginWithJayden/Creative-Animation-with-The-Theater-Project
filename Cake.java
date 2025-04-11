import org.code.theater.*;
import org.code.media.*;

// Food subclass

public class Cake extends Food {

  // Instance variables
  private int sugar;

  // Constructor
  public Cake(String image, int x, int y, int sugar) {
    super(image, x, y);
    this.sugar = sugar;
  }

  public int getSugar() {
    return sugar;
  }
  
}