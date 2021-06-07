import java.util.Arrays;

class ArrayInsert {
    public static void enter(int a[],int index,int ele){
        for(int i=a.length-1; i>index; i--){
            a[i] = a[i-1];
        }
        a[index] = ele;
        System.out.println(Arrays.toString(a));
    }
  public static void main(String[] args) {
      int a[] = {1,2,3,5,0};
      int index = 3;
      int ele = 4;
      enter(a,index,ele);
  }    
}
