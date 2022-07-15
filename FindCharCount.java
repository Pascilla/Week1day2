package Week1Day2;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "cognizant";
		char ch = 'i';
		int count = 0;
		char[] ch1 = str.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			if (ch == ch1[i])
			{
				count = count+1;
			}
			 
		}
			System.out.println(count);
		
		}
	}


