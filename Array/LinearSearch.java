class LinearSearch {
    
    public static int search(int a[], int key) {
        int i;
        for(i=0;i<a.length-1;i++){
            if(key==a[i])
            return i;
        }
        return -1;
    }   
   
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int key = 3;
        System.out.println(search(a,key));
    }
}
