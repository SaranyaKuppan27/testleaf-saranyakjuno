package week1.day2.assignments;

public class Palindrome {
	public static void main(String[] args) {
		String str = "wer";
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; --i) {
			revStr = revStr + str.charAt(i);
			System.out.println(revStr);
		}
			if (str.equals(revStr)) {
				System.out.println("String is Palindrome");
			} else {
				System.out.println("String is Not a Palindrome");
		}
	}

}