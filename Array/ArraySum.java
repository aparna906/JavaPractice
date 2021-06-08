class ArraySum {
    public static int sum(int total,int a[]){
        for(int i=0;i<a.length;i++){
            total = total+a[i];
        }
        return total;
    }
public static void main(String[] args) {
    int total=0;
    int a[] = {2,3,4,5,6,7,8,1};
    System.out.println(sum(total,a));
}    
    
}
