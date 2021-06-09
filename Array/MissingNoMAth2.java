class MissingNoMAth2 {
    public static void missing(int a[], int l, int h, int n) {
        int diff = l-0;
        for(int i=0; i<n; i++){
            if(a[i]-i != diff){
                System.out.println(i+diff);
                break;
            }
        }
    }
public static void main(String[] args) {
    int a[] = {6,7,8,9,10,11,13,14,15,16};
    int l = 6;
    int h = 16;
    int n = 10;
    missing(a,l,h,n);
}    
}
