import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    Food[] pastel = {new Cake("cake.jpg", 100, 100, 300),
                     new Pizza("pizza.jpg", 100, 100, 25)
                    };

    String[] bien = {new String("Let's see what"),
                     new String("the internet has"),
                     new String("me make today."),
                     new String("Naah, this one is too sweet for today."),
                     new String("Hey! This is looks good to eat!"),
                     new String("Very savory!")
                    };
    
    Scenes scene = new Scenes(pastel, bien);

    scene.drawScene();

    Theater.playScenes(scene);
  }
}