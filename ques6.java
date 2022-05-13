/*Apply following functions on the String "Java".
(i) Try to concat "Welcome".
(ii) Find character at index 1
(iii) Find index of first 'a'.
(iv) Find index of second 'a'
(v) Compare "Java" to "JAVA"
(vi) Compare "Java" to "JAVA" ignoring the case
(vii) Find the index of first 'a' from last*/

public class Strings
{
	public static void main(String[] args) {
		String myStr = "Java";
		System.out.println(myStr.concat("Welcome"));
		System.out.println(myStr.charAt(1));
        		System.out.println(myStr.indexOf("a"));
        		System.out.println(myStr.indexOf("a", myStr.indexOf("a") + 1));
        		System.out.println(myStr.equals("JAVA"));
        		System.out.println(myStr.equalsIgnoreCase("JAVA"));
        		System.out.println(myStr.lastIndexOf("a"));
	}
}
