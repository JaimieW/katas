package kata02;

import static org.junit.Assert.*;
import static kata02.BinarySearch.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BinarySearchTest {


    private static int[] empty = new int[0];
    private static int[] oneElement = new int[]{1};
    private static int[] twoElement = new int[]{1, 3};
    private static int[] threeElement = new int[]{1, 3, 5};
    private static int[] fourElement = new int[]{1, 3, 5, 7};
    
    private int target;
    private int[] sortedInts;
    private int expected;
    
    public BinarySearchTest(int target, int[]sortedInts, int expected){
	this.target = target;
	this.expected = expected;
	this.sortedInts = sortedInts;
    }
    
    @Parameters
    public static Collection<Object[]> data(){
	return Arrays.asList(new Object[][]{
		{3, empty, -1},
		{3, oneElement, -1},
		{1, oneElement,  0},
		
		{1, twoElement,  0},
		{3, twoElement,  1},
		{0, twoElement, -1},
		{2, twoElement, -1},
		{5, twoElement, -1},
		
		{1, threeElement,   0},
		{3, threeElement,   1},
		{5, threeElement,   2},
		{0, threeElement,  -1},
		{2, threeElement,  -1},
		{4, threeElement,  -1},
		{6, threeElement,  -1},

		{1, fourElement,   0},
		{3, fourElement,   1},
		{5, fourElement,   2},
		{7, fourElement,   3},
		{0, fourElement,  -1},
		{2, fourElement,  -1},
		{4, fourElement,  -1},
		{6, fourElement,  -1},
		{8, fourElement,  -1},

	});
    }
    
    @Test
    public void iterativeBinarySearch(){
	assertEquals(expected, search(target, sortedInts));
    }

}
