package src.main.test.example.anagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import src.main.java.com.example.anagram.AnagramApplication;
import src.main.java.com.example.anagram.AnagramCreater;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class TestAnagram {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp(){
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testAnagram(){
        AnagramCreater anagramBase = new AnagramCreater();
        Assertions.assertEquals("dcba hgfe", anagramBase.createAnagram("abcd efgh"));
        Assertions.assertEquals("d1cba hgf!e", anagramBase.createAnagram("a1bcd efg!h"));
        Assertions.assertEquals("olleh dlrow", anagramBase.createAnagram("hello   world"));
        String input = "abcd efgh";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        AnagramApplication.main(null);
        Assertions.assertEquals("Вас приветсвует программа анаграмм.\r\nВведите строку:\r\ndcba hgfe",
                outputStream.toString().trim());
    }
}
