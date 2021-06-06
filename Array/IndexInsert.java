import java.util.Arrays;

 class IndexInsert {
      public static void insert(int a[], int key, int index) {
          for(int i=a.length-1; i>index; i--){
              a[i] = a[i-1];
             }
          a[index]=key;
          System.out.println(Arrays.toString(a));
      }
      
    public static void main(String[] args) {
        int a[]; 
        a = new int[]{0,1,2,4,5,0,0};
        int key =3;
        int index = 2;
        insert(a,key,index);
    }
}
