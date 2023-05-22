package src.main.java.com.example.anagram;

import java.util.Scanner;

public class AnagramApplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        AnagramCreater anagram = new AnagramCreater();
        System.out.println("Вас приветсвует программа анаграмм.");
        System.out.println("Введите строку:");
        System.out.println(anagram.createAnagram(scanner.nextLine()));
    }
}
