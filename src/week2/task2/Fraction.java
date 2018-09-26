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
            int numerator = this.numerator*other.denominator + this.denominator*other.numerator;
            int denominator = this.denominator*other.denominator;
            return new Fraction(numerator,denominator);
        }

        public Fraction subtract(Fraction other) {
            int numerator = this.numerator*other.denominator - this.denominator*other.numerator;
            int denominator = this.denominator*other.denominator;
            return new Fraction(numerator,denominator);
        }

        public Fraction multiply(Fraction other) {
            int numerator = this.numerator*other.numerator;
            int denominator = this.denominator*other.denominator;
            return new Fraction(numerator,denominator);
        }

        public Fraction divide(Fraction other) {
            int numerator = this.numerator*other.denominator;
            int denominator = this.denominator*other.numerator;
            return new Fraction(numerator,denominator);
        }


        public void Reduce(){
            int UCLN = gcd(numerator,denominator);
            this.numerator = this.numerator/UCLN;
            this.denominator = this.denominator/UCLN;
        }

        public boolean equals(Object obj){
            if (obj == null) return false;

            if (!(obj instanceof Fraction)) return false; //kiểm tra Object có phải kiểu Fraction hay không
            Fraction fraction = (Fraction) obj; //ép kiểu Object

            int tu =  this.numerator*fraction.denominator - this.denominator*fraction.numerator;
            int mau =  this.denominator*fraction.denominator;
            if (tu * mau >=0) return true;
            return false;
        }
        public static void main(String[] args) {

            Fraction ps = new Fraction(3,5);
            Fraction ps1 = new Fraction(10,15);
            Fraction ps2 = new Fraction(9,15);
            ps.PrintFraction();

            System.out.println("Rút gọn phân số 10/15");
            ps1.Reduce();
            ps1.PrintFraction();

            System.out.println("Phép cộng của 3/5 với 10/15");
            Fraction cong = ps.add(ps1);
            cong.Reduce();
            cong.PrintFraction();

            System.out.println("Phép trừ của 3/5 với 10/15");
            Fraction tru = ps.subtract(ps1);
            tru.Reduce();
            tru.PrintFraction();
            
            System.out.println("Phép nhan của 3/5 với 10/15");
            Fraction nhan = ps.multiply(ps1);
            nhan.Reduce();
            nhan.PrintFraction();

            System.out.println("Phép chia của 3/5 với 10/15");
            Fraction chia = ps.divide(ps1);
            chia.Reduce();
            chia.PrintFraction();

            System.out.println("So sánh 2 phân số 3/5 và 10/15");
            if (ps.equals(ps1)) System.out.println("True");
            else System.out.println("False");

            System.out.println("So sánh 2 phân số 3/5 và 9/15");
            if (ps.equals(ps2)) System.out.println("True");
            else System.out.println("False");

        }

}
