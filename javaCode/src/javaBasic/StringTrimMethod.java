package javaBasic;

public class StringTrimMethod {
    public static void main(String[] args) {

        final String sentence= "      my name is shivam singh";

        String trimmedSentence= sentence.trim();

        System.out.println(sentence);
        System.out.println(trimmedSentence);
    }
}
