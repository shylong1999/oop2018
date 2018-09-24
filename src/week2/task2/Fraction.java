package week2.task2;

    public class Fraction {

        private int numerator,denominator;

        public static int gcd(int a, int b) {
            if (a==0) return b;
            return gcd(b%a,a);
        }

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

    /*public void setFraction(Fraction fraction) {
        this.numerator = fraction.numerator;
        this.denominator = fraction.denominator;
    }*/

        public void PrintFraction(){
            if (numerator > 0 && denominator < 0) System.out.println((-this.numerator) + "/" + (-this.denominator));
            else if (numerator < 0 && denominator < 0) System.out.println((-this.numerator) + "/" + (-this.denominator));
            else System.out.println(this.numerator + "/" + this.denominator);
        }
        public Fraction add(Fraction other) {
            other.numerator = this.numerator*other.denominator + this.denominator*other.numerator;
            other.denominator = this.denominator*other.denominator;
            return other;
        }

        public Fraction subtract(Fraction other) {
            other.numerator = this.numerator*other.denominator - this.denominator*other.numerator;
            other.denominator = this.denominator*other.denominator;
            return other;
        }

        public Fraction multiply(Fraction other) {
            other.numerator = this.numerator*other.numerator;
            other.denominator = this.denominator*other.denominator;
            return other;
        }

        public Fraction divide(Fraction other) {
            other.numerator = this.numerator*other.denominator;
            other.denominator = this.denominator*other.numerator;
            return other;
        }


    public void Reduce(){
        int UCLN = gcd(numerator,denominator);
        this.numerator = this.numerator/UCLN;
        this.denominator = this.denominator/UCLN;
    }

    public boolean equals(Fraction obj){
        int tu =  this.numerator*obj.denominator - this.denominator*obj.numerator;
        int mau =  this.denominator*obj.denominator;

        if (tu==0) System.out.println("Hai phan so bang nhau");

        if (tu * mau >=0) return true;
        return false;
    }
    public static void main(String[] args) {
        Fraction ps = new Fraction(3,5);
        Fraction ps1 = new Fraction(10,15);
        Fraction ps2 = new Fraction(10,15);
        Fraction ps3 = new Fraction(10,15);
        Fraction ps4 = new Fraction(10,15);
        Fraction ps5 = new Fraction(9,15);
        ps.PrintFraction();

        System.out.println("Rút gọn phân số 10/15");
        ps1.Reduce();
        ps1.PrintFraction();

        System.out.println("Phép cộng của 3/5 với 10/15");
        Fraction cong = ps.add(ps1);
        cong.Reduce();
        cong.PrintFraction();

        System.out.println("Phép trừ của 3/5 với 10/15");
        Fraction tru = ps.subtract(ps2);
        tru.Reduce();
        tru.PrintFraction();

        System.out.println("Phép nhan của 3/5 với 10/15");
        Fraction nhan = ps.multiply(ps3);
        nhan.Reduce();
        nhan.PrintFraction();

        System.out.println("Phép chia của 3/5 với 10/15");
        Fraction chia = ps.divide(ps4);
        chia.Reduce();
        chia.PrintFraction();

        System.out.println("So sánh 2 phân số 3/5 và 10/15");
        if (ps.equals(ps1)) System.out.println("True");
        else System.out.println("False");

        System.out.println("So sánh 2 phân số 3/5 và 9/15");
        if (!ps.equals(ps5)) System.out.println("True");
        else System.out.println("True");

    }

}
