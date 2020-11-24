/**
 * @author Sanjeev Thakur
 * This class combines the GUI.fxml and all classes together.
 * Got some idea on how to use javafx and scenebulder from following link
 * https://www.youtube.com/watch?v=WQEEjD3hwjA&t=643s
 * https://www.youtube.com/watch?v=nieIxKuQqo0&t=502s
 * https://www.youtube.com/watch?v=dQSTffLSSZY&t=9s
 * https://www.youtube.com/watch?v=9uubyM6oHAY&t=450s
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainClass extends Application {
    
    /**
     * It gets the data from scene builder and shows to the ListView panel.
     * @param stage it sets the title of the project. 
     * @throws Exception error in the output 
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("ToDOList");
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
