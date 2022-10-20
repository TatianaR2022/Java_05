import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FizzBuzzTest {
    /*  1. Pasitive testing Happy path  if (start <= end)  return array;  */
    /* start < end */
    @Test
    public void testStartlessThanEnd_HappyPath() {
        //AAA
        //errange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz",
                "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};
        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*  start == end */
    /*  2. Pasitive testing Happy path  if (start = end)  return array;  */
    @Test
    public void testStartEgualsEnd_HappyPath() {
        //AAA
        //errange
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"};
        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*  start < end */
    /*  3. Pasitive testing Happy path  if (start < end)  return array;  */
    @Ignore
    @Test
    public void testStartlessThanEnd_StartEndAreNegative_HappyPath() {
        //AAA
        //errange
        int start = -20;
        int end = -1;
        String[] expectedResult = {"Buzz"};
        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    /*  4. Negative testing Happy path  if (start > end)  return array;  */

    @Test
    public void testStartGreaterThanEnd_Negative() {
        //AAA
        //errange
        int start = 20;
        int end = 1;
        String[] expectedResult = {};
        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
