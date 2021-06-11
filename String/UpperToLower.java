class UpperToLower {
  public static void main(String[] args) {
    String s1[]={"AAA","BB","CCCC","A","ABCDE"};
    String s2[]=new String[s1.length];
   int i;
        for ( i = 0; i < s1.length; i++)
           {
              s2[i]=s1[i].toLowerCase();
           }
           
       for(i=0; i<s2.length;i++)
        System.out.print(s2[i] +" ");
    }
 }  

