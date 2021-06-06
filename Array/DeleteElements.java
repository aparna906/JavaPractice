import java.util.Arrays;

class DeleteElements {
    public static void delete(int A[],int index) {
        for(int i=index; i<A.length-1; i++){
           // A[i] = A[i+1];
        }
        System.out.println(Arrays.toString(A));
     }
      public static void main(String[] args) {
          int A[] = {1,2,3,11,5,6};
          int index = 3;
          delete(A, index);
      } 
    }

