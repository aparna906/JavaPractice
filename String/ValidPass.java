class ValidPass {
public static boolean validate(String name) {
   
    int i;
    for(i=0;i<=name.length()-1;i++){
     char ch = name.charAt(i);
          if(!(ch>=65 && ch<=90) && !(ch>=97 && ch<=122) && !(ch>=48 && ch<=57)){
               return false;
            }
         }
         return true;
} 

public static void main(String[] args) {
    String name = "Apps?123";
    if(validate(name)){
        System.out.println("Valid Password");
    }
    else{
        System.out.println("Invalid Password");
    }
   }
}
