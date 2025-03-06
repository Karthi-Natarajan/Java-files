public class Main {
    public static int countVowels(String s){
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : s.toCharArray()){
            if(vowels.indexOf(c) != -1){
                count ++;
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        String s = "Hello world";
        System.out.println("The vowels are in the sentence : "+countVowels(s));
    }
}