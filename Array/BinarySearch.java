class BinarySearch {
    public static void search(int a[],int l,int h,int key){
       int mid = (l+h)/2;
       while(l<=h){
           if(a[mid]<key){
               l = mid+1;
           }
           else if(a[mid]==key){
               System.out.println(mid);
               break;
           }
           else{
               h = mid-1;
           }
        mid = (l+h)/2;
       }
       if(l>h){
         System.out.println("Not Found");
       }
    }
    public static void main(String[] args) {
        int a[] ={11,16,19,21,25,30,32,35,39,41,45,51,55,56,60};
        int l=0;
        int h=a.length-1;
        int key=12;
       search(a, l, h, key);
    }
    
}
