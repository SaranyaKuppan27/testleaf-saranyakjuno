package week1.day2.assignments;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		char searchChar = 'e';
		char[] charArr = str.toCharArray();
		int len = charArr.length;
		for (int i = 0; i < len; i++) {
			if (charArr[i] == searchChar) {
				count++;
			}
		}
		System.out.println("no. of times string 'e' occured is :" +count);
	}

}
