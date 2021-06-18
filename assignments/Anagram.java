package week1.day2.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "keep";
		String text2 = "peek";
		int textlen1 = text1.length();
		int textlen2 = text2.length();
		boolean status = false;
		if (textlen1 != textlen2) {
			status = false;
		} else {
			char[] textArr1 = text1.toLowerCase().toCharArray();
			char[] textArr2 = text2.toLowerCase().toCharArray();
			Arrays.sort(textArr1);
			Arrays.sort(textArr2);
			status = Arrays.equals(textArr1, textArr2);
		}
		if (status) {
			System.out.println(text1 + " and " + text2 + " are anagrams");
		} else {
			System.out.println(text1 + " and " + text2 + " are not anagrams");
		}
	}
}
