package week3;

public class Week3Test {

    Week3 test = new Week3();

    public static void main(String[] args) {
        Week3Test w3 = new Week3Test();
        // TODO: Viết 5 testcase cho phương thức max()
        System.out.println("Test phương thức max");
        System.out.println(w3.test.max(5, 10));
        System.out.println(w3.test.max(-1, 20));
        System.out.println(w3.test.max(0, 1));
        System.out.println(w3.test.max(-3, -7));
        System.out.println(w3.test.max(5, 5));

        // TODO: Viết 5 testcase cho phương thức minOfArray()
        System.out.println("Test phương thức minOfArray");
        int a[] = {1, 2, 3, 4, 99, -1, -6, -10};
        System.out.println(w3.test.minOfArray(a));
        int b[] = {-1,5,7};
        System.out.println(w3.test.minOfArray(b));
        int c[] = {0,-1,-3,-10,-20};
        System.out.println(w3.test.minOfArray(c));
        int d[] = {-11, 11, 1145,9999};
        System.out.println(w3.test.minOfArray(d));
        int e[] = {-0,0,0,0};
        System.out.println(w3.test.minOfArray(e));

        // TODO: Viết 5 testcase cho phương thức calculateBMI()
        System.out.println("Test phương thức calculateBMI");
        System.out.println(w3.test.calculateBMI(67, 1.70));
        System.out.println(w3.test.calculateBMI(41,1.52));
        System.out.println(w3.test.calculateBMI(43,1.49));
        System.out.println(w3.test.calculateBMI(60,1.70));
        System.out.println(w3.test.calculateBMI(90,1.75));

    }

}
