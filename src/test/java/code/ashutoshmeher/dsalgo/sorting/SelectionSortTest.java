package code.ashutoshmeher.dsalgo.sorting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.sound.midi.SysexMessage;
import java.util.Arrays;

public class SelectionSortTest {

    private int[] input ;
    private int[] sorted;

    @Before
    public void setup(){
        input = new int[]{2, 1, 4, 6, 8, 5, 34, 21, 98, 55, 82, 45};
        sorted = new int[]{1, 2, 4, 5, 6, 8, 21, 34, 45, 55, 82, 98};
    }

    @Test
    public void testSort() {
        SelectionSort.sort(input);
        //Arrays.stream(input).forEach(System.out::println);
        Assert.assertArrayEquals(sorted, input);
    }
}
