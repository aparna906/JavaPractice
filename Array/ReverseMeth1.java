import java.util.Arrays;

class ReverseMeth1 {
    public static void rev(int a[],int b[]){
        for(int i=a.length-1,j=0; i>=0;i--,j++){
            b[j] = a[i];
        }
        for(int i=0;i<a.length;i++){
            a[i] =b [i];
        }
        System.out.println(Arrays.toString(a));
    }
   public static void main(String[] args) {
       int a[] = {2,3,4,5};
       int b[] = new int[4];
       rev(a,b);
   }    
}
