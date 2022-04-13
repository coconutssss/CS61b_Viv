import  org.junit.Test;
import  static org.junit.Assert.*;
/**
 * @author Vivian
 * @create 2022-01-22 4:51 PM
 */
public class TestSort {
    @Test
    public   void testSort(){
        String[] input ={"i","have","an","egg"};
        String[] expected ={"an","egg","have","i"};
        Sort.sort(input);
        assertArrayEquals(expected,input);
    }
    @Test
    public  void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        int expected = 2;

        int actual = Sort.findSmallest(input,0);
        org.junit.Assert.assertEquals(expected, actual);

        String[] input2 = {"there", "are", "many", "pigs"};
        int  expected2 = 2;

        int actual2 = Sort.findSmallest(input2,2);
       assertEquals(expected2, actual2);
    }
    /** Test the Sort.swap method. */
    @Test
    public  void testSwap() {
        String[]  input = {"i", "have", "an", "egg"};
        int a = 0;
        int b = 2;
        String[] expected = {"an", "have", "i", "egg"};

        Sort.swap(input, a, b);
      assertArrayEquals(expected, input);
    }

}
