package Week1Day2;

public class Revdups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text = "We learn java basics as part of java";
int count = 0;
String[] words = text.split(" ");
for(int i=0;i<words.length;i++) {
	for(int j=0;j<words.length;j++) {
		if(words[i].equals(words[j])) {
			count++;
		}
	}
	if(count>1) {
		text=text.replace(words[i], "");
	}
	count=0;
}
System.out.println(text);
	}

}
