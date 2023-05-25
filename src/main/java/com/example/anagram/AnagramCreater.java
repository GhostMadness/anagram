package src.main.java.com.example.anagram;

import org.junit.jupiter.api.function.Executable;

public class AnagramCreater {
    public String createAnagram(String anagram){
        validate(anagram);
        StringBuilder result = new StringBuilder();
        String[] anagrams = anagram.split("\s");
        for (String line : anagrams) {
            if (!(result.isEmpty()) && result.charAt(result.length() - 1) != ' '){
                result.append(" ");
            }
            StringBuilder reverseLine = new StringBuilder(getString(line));
            reverseLine.reverse();
            for (int index = 0, index2 = 0; index < line.length(); index++){
                if (Character.isLetter(line.charAt(index))) {
                    result.append(reverseLine.charAt(index2));
                    index2++;
                } else{
                    result.append(line.charAt(index));
                }
            }
        }
        return result.toString();
    }

    private String getString(String line){
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < line.length(); index++){
            if (Character.isLetter(line.charAt(index))){
                result.append(line.charAt(index));
            }
        }
        return result.toString();
    }

    private void validate(String string) throws RuntimeException{
        if (string.isEmpty()){
            throw new RuntimeException("передана пустая строка");
        } else if (string.trim().length() == 0) {
            throw new RuntimeException("строка состоит из пробелов");
        }
    }
}
