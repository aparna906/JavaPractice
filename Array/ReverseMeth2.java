import java.util.Arrays;

class ReverseMeth2 {
     public static void rev(int a[], int temp) {
         for(int i=0,j=a.length-1;i<j;i++,j--){
             temp = a[i];
             a[i] = a[j];
             a[j] = temp;
         }
         System.out.println(Arrays.toString(a));
     }
  public static void main(String[] args) {
      int a[] = {2,3,56,4,8,6,4,14,36,5};
       int temp = 0;
       rev(a,temp);
  }    
}
