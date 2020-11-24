
/**
 * @author thaku
 * This class collects all the data that user enters.
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
