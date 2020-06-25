
package se.lexicon.hema;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Unit test for simple App.
 */
public class AppTest {
    /*
       Test that we follow the rules above!

     */
    @Before
    public void reset() {
        //  App.resetNames();//clean out the names so we always start with no names in our Array.

    }

    @Test
    public void add() {
        //Arrange
        float number1 = 1;
        float number2 = 3;
        //Act
        float result = App.add(number1, number2);
        //Assert
        assertEquals(4,result,0.01);
    }
    @Test
    public void addArrayTestingForVarargs()
    {
        //Act
        String resultForTestingForVarargs=App.add(3,4,5,6,7,8);
        //Assert
        assertEquals("3+4+5+6+7+8=33",resultForTestingForVarargs);
    }
    @Test
    public void sub() {
        //Arrange
        float number1 = 6;
        float number2 = 3;
        //Act
        float result = App.sub(number1, number2);
        //Assert
        assertEquals(3,result,0.01);
    }
    @Test
    public void addArrayTestingForVarargsSub()
    {
        //Act
        int resultForTestingForVarargsSub=App.sub(8,3,4);
        //Assert
        assertEquals("8-3-4=1",resultForTestingForVarargsSub);
    }

}