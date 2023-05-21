package src.main.java.com.example.anagram;

public class AnagramCreater {
    public String createAnagram(String anagram){
        StringBuilder result = new StringBuilder();
        String[] anagrams = anagram.split(" ");
        for (String line : anagrams) {
            if (!(result.isEmpty())){
                result.append(" ");
            }
            StringBuilder beta = new StringBuilder(getString(line));
            beta.reverse();
            for (int i = 0, j = 0; i < line.length(); i++){
                if ((int) 'A' <= line.charAt(i) && line.charAt(i) <= (int) 'z') {
                    result.append(beta.charAt(j));
                    j++;
                } else{
                    result.append(line.charAt(i));
                }
            }
        }
        return result.toString();
    }

    private String getString(String line){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < line.length(); i++){
            if ((int) 'A' <= line.charAt(i) && line.charAt(i) <= (int) 'z'){
                result.append(line.charAt(i));
            }
        }
        return result.toString();
    }
}
