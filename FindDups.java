package Week1Day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num = {12,12,0,4,3,63,3,25,85,25,10,10,0};
int length=num.length;
Arrays.sort(num);
		for(int i=0;i<num.length-1;i++)  {
			System.out.println(num[i]);{
				if(num[i]==num[i+1]) {
					System.out.println("The duplicate numbers are");
				}
		
	}
	
		}
	}
}
