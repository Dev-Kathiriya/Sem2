import java.util.Scanner;
class CountVowels{
	int countVowelNo;
	String str;
	void setmethod(){
		Scanner scan=new Scanner(System.in);
		str=scan.nextLine();
	}
	void counts(){
		for (int i=0;i<str.length() ;i++)
			if(str.charAt(i)=='A' || str.charAt(i)=='a' || str.charAt(i)=='E' || str.charAt(i)=='e' || str.charAt(i)=='I' || str.charAt(i)=='i' || str.charAt(i)=='O' || str.charAt(i)=='o' || str.charAt(i)=='U' || str.charAt(i)=='u')
				countVowelNo++;
	}
}