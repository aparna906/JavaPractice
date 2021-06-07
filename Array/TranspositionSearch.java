class TranspositionSearch {
    public static void Swap(int x,int y){
           int temp;
           temp = x;
           x = y;
           y = temp;
        }
    public static int trans(int a[],int key){
        int i;
        for(i=0;i<a.length-1;i++){
            if(key==a[i]){
                Swap(a[i],a[i-1]);
                return (i);
            }  
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {2,6,5,4,8,9};
        int key = 10;
       System.out.println( trans(a,key));
    }
}
