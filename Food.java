import org.code.theater.*;
import org.code.media.*;

// Renamed starter code class

public class Food {

  // Instance variables
  private String fileName;
  private int x;
  private int y;

  // Constructor
  public Food(String fileName, int x, int y) {
    this.fileName = fileName;
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public String getFileName() {
    return fileName;
  }

  public void setX(int newX) {
    x = newX;
  }

  public void setY(int newY) {
    y = newY;
  }
  
  public void setFile(String newFileName) {
    fileName = newFileName;
  }
  
}