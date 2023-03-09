import org.example.Calculation.calc;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class calcTest {

    static calc c ;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
       c = new calc();
    }
    @Test
    public void testaddition(){
        assertEquals(10 ,c.addition(4,6));
    }
    @Test
    public void testsubtraction(){
        assertEquals(0, c.subtraction(8 , 8));
    }
    @Test
    public void testmultiply(){

        assertEquals(25 , c.multiply(5,5));

    }
    @Test
    public void testdivision(){

        assertEquals(6 , c.division(36 , 6));
    }
}
