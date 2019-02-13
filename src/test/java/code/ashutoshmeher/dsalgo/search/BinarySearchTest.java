package code.ashutoshmeher.dsalgo.search;

import jdk.nashorn.internal.objects.annotations.Setter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {

    private int[] inputArray;
    private int key;

    @Before
    public void setUp(){
        inputArray = new int[]{2, 3, 5, 9, 6, 7, 23, 45, 87, 88, 90};
    }

    @Test
    public void testSearchNotFound(){
        int result = BinarySearch.search(inputArray, 10);
        System.out.println(result);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testSearchFirstElement(){
        int result = BinarySearch.search(inputArray, 2);
        System.out.println(result);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSearchLastElement(){
        int result = BinarySearch.search(inputArray, 90);
        System.out.println(result);
        Assert.assertEquals(10, result);
    }

    @Test
    public void testSearchRandomElement(){
        int result = BinarySearch.search(inputArray, 45);
        System.out.println(result);
        Assert.assertEquals(7, result);
    }

    @Test
    public void testSearchNotFoundNR(){
        int result = BinarySearch.searchNonRecursive(inputArray, 10);
        System.out.println(result);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testSearchFirstElementNR(){
        int result = BinarySearch.searchNonRecursive(inputArray, 2);
        System.out.println(result);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSearchLastElementNR(){
        int result = BinarySearch.searchNonRecursive(inputArray, 90);
        System.out.println(result);
        Assert.assertEquals(10, result);
    }

    @Test
    public void testSearchRandomElementNR(){
        int result = BinarySearch.searchNonRecursive(inputArray, 45);
        System.out.println(result);
        Assert.assertEquals(7, result);
    }
}
