import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;


public class KataTest {
    @Test
    public void test() {
        assertEquals(3,Kata.findEvenIndex(new int[] {1,2,3,4,3,2,1}));
        assertEquals(1,Kata.findEvenIndex(new int[] {1,100,50,-51,1,1}));
        assertEquals(-1,Kata.findEvenIndex(new int[] {1,2,3,4,5,6}));
        assertEquals(3,Kata.findEvenIndex(new int[] {20,10,30,10,10,15,35}));
        assertEquals(-1,Kata.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
        assertEquals(1,Kata.findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
        assertEquals(6,Kata.findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
    }
}


public class Kata {
  public static int findEvenIndex(int[] arr) {

    
    for(int i = 0; i < arr.length; i++){
          int left = 0;
          int right = 0;
      for(int j = i - 1; j >= 0; j--){
          left += arr[j];
      }
      for(int j = i + 1; j < arr.length; j++){
          right += arr[j];
      }
      if(left == right){
        return i;
      }
    }
    
    
    return -1;
  }
}
