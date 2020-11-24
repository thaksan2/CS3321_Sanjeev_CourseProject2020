
/**
 * @author thaku
 * This class collects all the data that user enters.
 * Got some idea on how to use javafx and scenebulder from following link
 * https://www.youtube.com/watch?v=WQEEjD3hwjA&t=643s
 * https://www.youtube.com/watch?v=nieIxKuQqo0&t=502s
 * https://www.youtube.com/watch?v=dQSTffLSSZY&t=9s
 * https://www.youtube.com/watch?v=9uubyM6oHAY&t=450s
 */

import java.time.LocalDate;


public class Task {
    
    //Variables 
    private String taskDescription;
    private LocalDate date;

    /**
     * @return the description
     */
    public String gettaskDescription() {
        return taskDescription;
    }

    /**
     * @param description the description to set
     */
    public void settaskDescription(String description) {
        if(description==" ")
            this.taskDescription="Null String";
        this.taskDescription = description;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    /**
     * Gets the date and task description that users entered.
     * @param date that user wants to add some task on particular date
     * @param description it is the task that user want to do
     */
    public Task (LocalDate date, String description){
        
        this.setDate(date);
        this.settaskDescription(description);
    }
    
    /**
     * Overrides the toString method to display the data in following formate. 
     * @return returns the user data to ListView.
     */
    @Override
    public String toString(){
        return "At: "+ this.getDate() + " do " + this.gettaskDescription();
    }
}
