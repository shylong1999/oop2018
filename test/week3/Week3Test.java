package week3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax() {
        assertEquals(7, Week3.max(7, 2));
        assertEquals(9, Week3.max(6, 9));
        assertEquals(6, Week3.max(6, 6));
        assertEquals(-1, Week3.max(-1, -10));
        assertEquals(30, Week3.max(Week3.max(10, 20), Week3.max(15, 30)));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray() {
        int a[] = {1, 2, 4, 7, 9, 11};
        assertEquals(1, Week3.minOfArray(a));
        int b[] = {1, 2, 3, 4, 99, -1, -6, -10};
        assertEquals(-10, Week3.minOfArray(b));
        int c[] = {-11, 11, 1145, 9999};
        assertEquals(-11, Week3.minOfArray(c));
        int d[] = {0, -1, -3, -10, -20};
        assertEquals(-20, Week3.minOfArray(d));
        int e[] = {-1, 5, 7};
        assertEquals(-1, Week3.minOfArray(e));

    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCalculateBMI() {
        assertEquals("Thiếu cân", Week3.calculateBMI(41, 1.52));
        assertEquals("Thừa cân", Week3.calculateBMI(67, 1.70));
        assertEquals("Bình thường", Week3.calculateBMI(43, 1.49));
        assertEquals("Bình thường", Week3.calculateBMI(60, 1.70));
        assertEquals("Béo phì", Week3.calculateBMI(90, 1.75));
    }
}
