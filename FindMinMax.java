package Week1Day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num = {10,20,30,50,5632,258,2659,45,2};
Arrays.sort(num);
int lengthofArray = num.length;
System.out.println("The minimum value is"+num[0]);
System.out.println("The maximum value is"+num[lengthofArray-1]);
	}

}
