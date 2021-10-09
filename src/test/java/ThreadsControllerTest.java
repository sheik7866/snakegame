import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.event.KeyEvent;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreadsControllerTest {
    Tuple position = new Tuple(10,10);
    // passing this value to the controller
    Window f1= new Window();

    ThreadsController c = new ThreadsController(position);
    @Test
    @DisplayName("Check for initial snake size which should be 3")
    public void testCase1(){
        assertEquals(c.sizeSnake,3);
    }

    @Test
    @DisplayName("Check right direction")
    public void testCase2(){
        c.moveInterne(1);

        System.out.println("Passed");
    }
    @Test
    @DisplayName("Check left direction")
    public void testCase3(){

        c.moveInterne(2);

        System.out.println("Passed");
    }
    @Test
    @DisplayName("Check top direction")
    public void testCase4(){
        c.moveInterne(3);
        System.out.println("Passed");
    }
    @Test
    @DisplayName("Check bottom direction")
    public void testCase5(){
        c.moveInterne(4);
        System.out.println("Passed");
    }

}