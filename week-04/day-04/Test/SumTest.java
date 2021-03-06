import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
  List<Integer> inputIntegers = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
  List<Integer> inputIntegers2 = new ArrayList<>(Arrays.asList());
  List<Integer> inputIntegers3 = new ArrayList<>(Arrays.asList(0));

  Sum bigSum = new Sum();

  @Test
  public void getSummer() {
      assertEquals(45, bigSum.summer(inputIntegers));
    }
  @Test
  public void getSummer2() {
    assertEquals(0, bigSum.summer(inputIntegers2));
  }
  @Test
  public void getSummer3() {
    assertEquals(0, bigSum.summer(inputIntegers3));
  }
}