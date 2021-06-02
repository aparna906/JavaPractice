public class SumOfNaturalno {
   
        public static int add(int n){
            if(n==0){
                return 0;
            }
            else{
                return add(n-1)+n;
            }
        }
    
    public static void main(String args[]){
       int x =5;
       add(x);
     System.out.println(add(x));
    }
    
        
    }