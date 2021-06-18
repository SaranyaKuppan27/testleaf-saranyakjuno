package week1.day2.assignments;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		char[] charArr = test.toCharArray();
		int len = charArr.length;
		for (int i = 0; i < len; i++) {
			if (Character.isLetter(charArr[i])) {
				System.out.println(charArr[i] + " is a letter ");
			} else if (Character.isDigit(charArr[i])) {
				System.out.println(charArr[i] + " is a number ");
			} else if (Character.isSpaceChar(charArr[i])) {
				System.out.println(charArr[i] + "is a space ");
			} else {
				System.out.println(charArr[i] + "is a specialCharcter ");
			}
		}
	}
}
