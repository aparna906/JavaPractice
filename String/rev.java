class rev {
    public static void main(String[] args) {
        String a = "aparn";
        char t[] = a.toCharArray();
         
        int i = 0;
        int j = a.length()-1;
        while(i<=j){
            char temp = t[i];
            t[i] = t[j];
            t[j] = temp;
            i++;
            j--;
        }
        System.out.println(t);
    }
}
