package kata02;

import static kata02.BinarySearch.search;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {


    @Test public void test_a(){ assertEquals(-1, search(3, new int[0])); }
    @Test public void test_b(){ assertEquals(-1, search(3, new int[]{1})); }
    @Test public void test_c(){ assertEquals(0, search(1, new int[]{1})); }
    
    @Test public void test_aa(){ assertEquals(0, search(1, new int[]{1,3})); }
    @Test public void test_ab(){ assertEquals(1, search(3, new int[]{1,3})); }
    @Test public void test_ac(){ assertEquals(-1, search(0, new int[]{1,3})); }
    @Test public void test_ad(){ assertEquals(-1, search(2, new int[]{1,3})); }
    @Test public void test_ae(){ assertEquals(-1, search(5, new int[]{1,3})); }


    @Test public void test_d(){ assertEquals(0, search(1, new int[]{1,3,5})); }
    @Test public void test_e(){ assertEquals(1, search(3, new int[]{1,3,5})); }
    @Test public void test_f(){ assertEquals(2, search(5, new int[]{1,3,5})); }
    @Test public void test_g(){ assertEquals(-1, search(0, new int[]{1,3,5})); }
    @Test public void test_h(){ assertEquals(-1, search(2, new int[]{1,3,5})); }
    @Test public void test_i(){ assertEquals(-1, search(4, new int[]{1,3,5})); }
    @Test public void test_j(){ assertEquals(-1, search(6, new int[]{1,3,5})); }


    @Test public void test_k(){assertEquals(0, search(1, new int[]{1,3,5,7})); }
    @Test public void test_l(){assertEquals(1, search(3, new int[]{1,3,5,7})); }
    @Test public void test_m(){assertEquals(2, search(5, new int[]{1,3,5,7})); }
    @Test public void test_n(){assertEquals(3, search(7, new int[]{1,3,5,7})); }
    @Test public void test_o(){assertEquals(-1, search(0, new int[]{1,3,5,7})); }
    @Test public void test_p(){assertEquals(-1, search(2, new int[]{1,3,5,7})); }
    @Test public void test_q(){assertEquals(-1, search(4, new int[]{1,3,5,7})); }
    @Test public void test_r(){assertEquals(-1, search(6, new int[]{1,3,5,7})); }
    @Test public void test_s(){assertEquals(-1, search(8, new int[]{1,3,5,7})); }

}
