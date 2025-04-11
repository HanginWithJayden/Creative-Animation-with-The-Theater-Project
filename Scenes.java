import org.code.theater.*;
import org.code.media.*;

public class Scenes extends Scene {

  // Instance Variables
  private Food[] allFood;          // Food 1D Array
  private String[] allText;        // Text 1D Array
  
  // Constructor
  public Scenes(Food[] allFood, String[] allText) {
    this.allFood = allFood;
    this.allText = allText;
  }

  // Main drawScene Method
  public void drawScene() {
    openingScene();
    secondScene();
    finalScene();
  }

  private void openingScene() {
    clear("white");
    drawImage("phone_image.png", 0, 0, 400);
    setTextStyle(Font.SANS, FontStyle.NORMAL);
    setTextHeight(20);
    setTextColor("black");
    drawText(allText[0], 30, 75);
    drawText(allText[1], 30, 95);
    drawText(allText[2], 30, 115);
    pause(5.0);
  }

  private void secondScene() {
    Cake cake = (Cake) allFood[0];
    clear("white");
    drawImage("photo_image.png", 0, 0, 400);
    drawImage(allFood[0].getFileName(), 125, 85, 90);
    setTextHeight(17);
    setTextColor("black");
    drawText(allText[3], 65, 25);
    drawText("Sugar: " + cake.getSugar() + " grams", 100, 240);
    pause(5.0);
  }

  private void finalScene() {
    Pizza pizza = (Pizza) allFood[1];
    playSound("modern.wav");
    clear("white");
    drawImage("photo_image.png", 0, 0, 400);
    drawImage(allFood[1].getFileName(), 95, 100, 175);
    setTextHeight(17);
    setTextColor("black");
    drawText(allText[4], 85, 25);
    drawText(allText[5], 150, 45);
    drawText("Added sugars: " + pizza.getAddedSugar() + " grams", 95, 240);
  }
  
}