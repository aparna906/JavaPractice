public class Fibonacci {
    public static int fib(int n){
          if(n<=1)
          return n;
          return fib(n-2)+fib(n-1);
    }
    public static void main(String[] args) {
        int x = 10;
        System.out.println(fib(x));
    }
}
