class Compare {
  public static void main(String[] args) {
      String st = "Painting";
      char s1[] = st.toCharArray();
      String st1 = "painting";
      char s2[] = st1.toCharArray();

      int i,j;
      for(i=0,j=0;i!=s1.length-1 && j!=s2.length-1;i++,j++)
      {
        if(s1[i]!=s2[j]){
           break;
        }
      }
        if(s1[i]==s2[j]){
            System.out.println("Match String");
            
        }
        else{
            System.out.println("Not Match String");
            
      }
   }  
}
 

