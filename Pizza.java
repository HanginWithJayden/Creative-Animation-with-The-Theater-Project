import org.code.theater.*;
import org.code.media.*;

// Food subclass

public class Pizza extends Food {

  // Instance variables
  private int addedSugar;

  // Constructor
  public Pizza(String image, int x, int y, int addedSugar) {
    super(image, x, y);
    this.addedSugar = addedSugar;
  }

  public int getAddedSugar() {
    return addedSugar;
  }
  
}