package come.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class ExampleTwo {
	public static void findcharOccurence() {
		String name = "madhankumar karthikeyan";
		char chl[] = new char[name.length()];
		for (int i = 0; i < name.length(); i++) {
			chl[i] = name.charAt(i);
		}
		for (char ch : chl) {
			int counter = 0;
			for (int j = 0; j < name.length(); j++) {
				if (ch == name.charAt(j)) {
					counter = counter + 1;
				}
			}
			System.out.println("Char " + ch + " occurs these many times :" + counter);
		}
	}

	public static void goodSolution() {
		String name = "stress";
		// char ch = 'a';
		int cnt = 0;
		Set<Integer> charset = new HashSet<Integer>();
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (charset.contains((int) ch) == false) {
				while (name.indexOf(ch) != -1) {
					name = name.substring(name.indexOf(ch) + 1);
					cnt = cnt + 1;
				}
				charset.add((int) ch);
				if (cnt == 1) {
					System.out.println("first occurence of non repetitive char :" + ch);
					break;
				}
				// System.out.println("Count of is " + cnt);
				cnt = 0;
			}
			name = "stress";
		}
	}

	public static void findUniquenumber() {
		int[] nums = { 1, 3, 4, 5, 6, 9, 1, 4, 9, 3, 6 };
		int a = 0;
		for (int i : nums) {
			a = a ^ i;
		}
		System.out.println("unique number is :" + a);
	}

	public static void findUniquenumberusingStream() {
		int[] nums = { 1, 3, 4, 5, 6, 9, 1, 4, 9, 3, 6 };
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for (int num : nums) {
			numList.add(num);
		}
		// Collections.sort(numList);
		// Collections.reverse(numList);
		Collections.sort(numList, Collections.reverseOrder());
		System.out.println("sorting the numbers " + numList);
		// System.out.println (\"sorting the numbers \"+numList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// findcharOccurence ();
		System.out.println("******");
		goodSolution();
		// findUniquenumber();
		// findUniquenumberusingStream();
	}
}
