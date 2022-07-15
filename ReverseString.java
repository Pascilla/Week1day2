package Week1Day2;

import java.util.Arrays;
import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1 = "Hello";
char[] charArray = str1.toCharArray();
for (int j = charArray.length-1;j >= 0; j--) {
System.out.println(charArray[j]);
	}

}
}