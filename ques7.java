/*Apply following functions on StringBuffer object "HELLO"
(i) Append "Java"
(ii) Insert "Java" at index 1
(iii) Replace with "Java" with characters between index 1 to 2
(iv) Delete characters between index 1 and 2 
(v) Reverse the string "HELLO"*/


public class Strings
{
	public static void main(String[] args) {
		StringBuffer myStr = new StringBuffer("HELLO");
		System.out.println(myStr.append("Java"));
		System.out.println(myStr.insert(1,"Java"));
        		System.out.println(myStr.replace(1,2,"Java"));
        		System.out.println(myStr.delete(1,2));
        		System.out.println(myStr.equals("JAVA"));
        		myStr = new StringBuffer("HELLO");
        		System.out.println(myStr.reverse());
	}
}

