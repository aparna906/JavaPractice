public class Factorial {
    public static int fact(int n) {
     if(n==0){
         return 1;
     }
     else{
         return fact(n-1)*n;
     }
        
    }
    public static void main(String[] args) {
        int x=5;
        System.out.println(fact(x));
    }
}
