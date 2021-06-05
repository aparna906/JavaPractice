import java.util.Arrays;

class Insertion{
    public static void main(String[] args) {
        
        int A[] = {1,2,3,4,5,6};  
        int n = A.length;  
        int B[] = new int[n+1];  
        int value = 7;    
        for(int i = 0; i<n; i++) {  
        B[i] = A[i];  
        }  
        B[n] = value;  
        System.out.println(Arrays.toString(B)); 
        
    }
}
        