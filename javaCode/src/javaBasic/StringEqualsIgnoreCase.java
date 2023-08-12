package javaBasic;

public class StringEqualsIgnoreCase {
    public static void main(String[] args) {

        final String name1="shivam singh";
        final String name2="SHIVAM SINGH";

        //without ignoring letter case
        System.out.println(name1.equals(name2));

        //After ignoring letter case
        System.out.println(name1.equalsIgnoreCase(name2));
    }
}
