package Lesson;



public class SubstringExample {
    public static void main(String[] args){
        String str="www.amazon.com";
        System.out.println("First 4 characters in the string: "+str.substring(0,4));
        System.out.println("Last 4 characters in the string: "+str.substring(str.length()-4));
        System.out.println("The website name: "+str.substring(4,10));
    }
}
