class DuplicateChar {
    public static void main(String[] args) {
        String s = "eetrtt";
        char s1[] = s.toCharArray();
        int count=0;
        int i,j;
        for(i=0;i<=s.length()-1;i++){
        for(j=i+1;j<=s.length()-1;j++){
            if(s1[i]==s1[j]){
                System.out.print(s1[j]+" ");
                count++;
            }
           }  
         }
         System.out.println(" ");
         System.out.println(count+" are repeated");
        
    }

}
