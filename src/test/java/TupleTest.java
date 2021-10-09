import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TupleTest {
    Tuple tuple = new Tuple(0,0);

    @Test
    @DisplayName("Check for tuple data changing")
    public void testTuple(){
        tuple.ChangeData(10,5);
        System.out.println(tuple.getX());
        assertEquals(tuple.getX(),10);
    }
}