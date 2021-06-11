 class LowerToUpper {
    public static void main(String[] args) {
        String s1[] = {"hi","aparna"};
        String s2[] = new String[s1.length];
        int i;
        for(i=0;i<s1.length;i++){
            s2[i] = s1[i].toUpperCase();
        }

        for(i=0;i<s2.length;i++){
            System.out.print(s2[i] +" ");
        }
    }
}
