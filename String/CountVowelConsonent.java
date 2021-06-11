 class CountVowelConsonent {
   public static void main(String[] args) {
       String a = "how are you";
            
           int i,vowelcount=0, concount=0;
           for(i=0; i<a.length();i++){
            char ch = a.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
                 vowelcount++;
               }
           
           else if(ch>=65 && ch<=90 || ch>=90 && ch<=120 ){
             concount++;
           }
           }
        System.out.println("vowel : "+vowelcount);
        System.out.println("Consonent : "+concount);
   }    
}
