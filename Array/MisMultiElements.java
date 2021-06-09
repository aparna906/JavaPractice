class MisMultiElements {
    public static void missing(int a[], int l, int h) {
        int diff = l-0;
        for(int i=0; i<a.length-1; i++){
            if(a[i]-i != diff)
            while(diff<a[i]-i){
                System.out.println(i+diff);
                diff++;
            }
        }
    }
    public static void main(String[] args) {
    int a[] = {6,7,8,9,11,12,14,15,16,17};
    int l = 6;
    int h = 17;
    
    missing(a,l,h);
    }
   
}
