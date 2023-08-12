package javaBasic;

public class StringIndexOfMethod {
    public static void main(String[] args) {

        final String sentence ="shivam singh";

        System.out.println(sentence.indexOf("v"));
        System.out.println(sentence.indexOf("i")); //return index of first occurance

        System.out.println(sentence.indexOf("i",7));  //return index of i from 7th index

        //lastIndexOf() method\

        System.out.println(sentence.lastIndexOf("s")); //retrun index from last

        System.out.println(sentence.lastIndexOf("s",6));
    }
}
