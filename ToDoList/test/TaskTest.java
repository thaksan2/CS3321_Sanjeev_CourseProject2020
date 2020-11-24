/*
 * @author Sanjeev Thakur
 * This class is to test menthod in task class
 * to add new local date https://www.baeldung.com/java-creating-localdate-with-values
 */

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TaskTest {
    
    private Task fixture = new Task(LocalDate.of(2020,11,8),"new Task Description Added");
    
    /**
     * Test of Constructor, of class Task.
     * Test passes if both parameters i.e. description and date are equal to expected
     */
    @Test
    public void testConstructor() {
        //Finally test if expected and actual results are equal
        //For Description
        String expectedDescription = "new Task Description Added";
        String result = fixture.gettaskDescription();
        assertEquals(expectedDescription, result);     
        
        //For Date
        LocalDate expectedDate=LocalDate.of(2020,11, 8);
        LocalDate resultDate=fixture.getDate();
        assertEquals(expectedDate,resultDate);
    }

    /**
     * Test of ToString method, of class Task.
     * Test passes if the object is in string format
     */
   
    @Test
    public void testToString() {
        String expResult = "At: 2020-11-08 do new Task Description Added";
        String result = fixture.toString();
        System.out.print(result);
        assertEquals(result,expResult);
    }
    
}
