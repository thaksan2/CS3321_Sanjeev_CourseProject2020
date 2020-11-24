/**
 * @author Sanjeev Thakur
 * This class connects GUI.fxml which handles buttons, ListView, TextField, and0 DatePicker which i used in UI.
 * Got some idea on how to use javafx and scenebulder from following link
 * https://www.youtube.com/watch?v=WQEEjD3hwjA&t=643s
 * https://www.youtube.com/watch?v=nieIxKuQqo0&t=502s
 * https://www.youtube.com/watch?v=dQSTffLSSZY&t=9s
 * https://www.youtube.com/watch?v=9uubyM6oHAY&t=450s
 */

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


public class GUIController implements Initializable {
    
    /**
     * Sets local current date in the datePicker.  
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        datePicker.setValue(LocalDate.now());
    }    
    
    /**
     * @FXML is the annotation which helps to bind GUI with SceneBuilder
     */
    @FXML
    Button btnAddEvent;
    @FXML
    TextField txtEvent;
    @FXML
    DatePicker datePicker;
    @FXML
    ListView<Task> eventList;
    
    /**
     * Stor the user task in list variable.
     */
    ObservableList<Task> list = FXCollections.observableArrayList();
    
    /**
     * This action is performed when add Event button is clicked.
     * It adds the task to ListView panel. 
     * @param e Event that user wants to add.
     */
    @FXML
    private void addEvent(Event e){
        list.add(new Task(datePicker.getValue(),txtEvent.getText()));
        eventList.setItems(list);
        
    }
    
    
}
