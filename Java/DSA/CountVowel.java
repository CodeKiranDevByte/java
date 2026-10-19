public class CountVowel {
    public static void main(String[] args) {
        String str = "infosys";
        int count = 0;
        
        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        
        System.out.println("Number of vowels: " + count);
    }
}