class MissingNo{
    public static void find(int a[], int sum, int n){
        for(int i=0; i<a.length; i++){
            sum = sum + a[i];
        }
        int s;
        s = n*(n+1)/2;
        System.out.println(s-sum);
    }
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5,6,8,9,10,11,12};
        int sum=0;
        int n = 12;
        find(a,sum,n);
    }
}