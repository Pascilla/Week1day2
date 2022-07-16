package Week1Day2;

public class Revevenwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test ="I am a software tester";
String[] words=test.split(" ");
for (int i=0;i<words.length;i++)
	if(i%2==1) {
		StringBuilder sb=new StringBuilder(words[i]);
		System.out.print(sb.reverse()+" ");
	}
	else {
		System.out.print(words[i]+" ");
	}
	}

}
