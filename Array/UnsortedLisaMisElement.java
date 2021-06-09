public class UnsortedLisaMisElement {
    public static void missing(int a[],int b[],int l,int h) {
        for(int i=0; i<a.length;i++){
          b[a[i]]++;
        }
        for(int i=l;i<=h;i++){
            if(b[i]==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {3,7,9,12,6,1,11,2,10};
        int b[] = new int[15];
        int l= 1;
        int h = 12;
        missing(a,b,l,h);
    }
}
