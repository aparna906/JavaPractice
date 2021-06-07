 class MoveToHead {
    public static void Swap(int x, int y){
        int temp;
        temp = x;
        x = y;
        y = temp;
    }   
    public static int pick(int a[],int key){
        int i;
        for( i=0; i<a.length-1;i++){
           if(key==a[i]){
                Swap(a[i],a[0]);
             return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int a[] = {11,12,1,3,14,1,5};
        int key = 5;
        System.out.println (pick(a,key));
        
        
       
    }
    
}
