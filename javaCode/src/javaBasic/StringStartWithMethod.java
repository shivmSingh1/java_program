package javaBasic;

public class StringStartWithMethod {
    public static void main(String[] args) {
        final String name = "shivam singh";

        System.out.println("String start with shi? "+name.startsWith("shi"));
        System.out.println("String start with svam? "+ name.startsWith("svam"));

        //String end with method

        System.out.println("String end with ngh? "+name.endsWith("ngh"));
        System.out.println("String end with vam? "+name.endsWith("vam"));
    }
}
