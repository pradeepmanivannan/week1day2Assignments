package week1day2Assignments;
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 8;
        int a = 0;
        int b = 1;
        int c =0;
        System.out.println("Fibonacci series are:");
        System.out.println(a );  
        for (int i = 0; i < n; i++) {
            c = a + b;
         System.out.println(c);   
            a = b;
            b = c;
        }
    }
}
