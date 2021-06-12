import java.util.Arrays;

class CheckAnagram {
    public static void main(String[] args) {
        String s = "race";
        String s1 = "care";
        if(s.length()==s1.length()){
        char S[] = s.toCharArray();
        char S1[] = s1.toCharArray();
        
            boolean res = Arrays.equals(S, S1);
            if(res){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }
        }
    }
}
