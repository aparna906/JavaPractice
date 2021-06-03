import javax.annotation.processing.SupportedSourceVersion;

public class Array2d {
    public static void main(String[] args) {
        int A[][] = {{1,2,3},{4,5,1},{1,5,6}};
        int B[][] = {{5,2,4},{4,3,6},{1,5,4}};
        int C[][] = new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " "); 
            }
            System.out.println();
        }
    }
}
