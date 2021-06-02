public class nCr {
    public static int com(int n,int r){
       if(r==0 || n==r){
           return 1;
       }
       else{
           return com(n-1,r-1)+com(n-1,r);s
       }
    }
    public static void main(String[] args) {
         int n = 4;
         int r = 2;
        System.out.println(com(n,r));
    }
    
}
