package come.test;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class GreedyAlgo {
	public static void revCharString() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 1;
		ArrayList<Integer> charInt = new ArrayList<Integer>();
		while (n <= i) {
			String str = scan.next();
			System.out.println("print str :" + str);
			// String[] splitstr = str.split(" ");
			String giveStr = str;
			int fIndex = Integer.parseInt(scan.next());
			int lIndex = Integer.parseInt(scan.next());
			String subStr = giveStr.substring(fIndex, lIndex + 1);
			System.out.println("sub:" + subStr);
			String preStr = giveStr.substring(0, fIndex);
			String postStr = giveStr.substring(lIndex + 1);
			for (int j = 0; j < subStr.length(); j++) {
				charInt.add((int) subStr.charAt(j));
			}
			Collections.sort(charInt, Collections.reverseOrder());
			String revStr = "";
			for (int k = 0; k < charInt.size(); k++) {
				int arrVal = charInt.get(k);
				char c = (char) arrVal;
				revStr = revStr + c;
			}
			System.out.println("Final reversed given string is : " + preStr + revStr + postStr);
			i++;
		}
	}

	public static Set<Integer> distInt = new LinkedHashSet<Integer>();

	public void addvalue(int addNum) {
		distInt.add(addNum);
	}

	public static void makeabsdiffArray() {
		int[] giveArrayofInt = { 7, 2, 4, 7 };
		for (int i : giveArrayofInt) {
			distInt.add(i);
		}
		for (int j = 0; j < distInt.size(); j++) {

		}
	}

	public static void findfirstoccuchar(String given) {
		char firstOcccurence; 
		List<Character> repeated = new ArrayList<Character>(); 
		for(int i=0;i<given.length(); i++) {
			char ch =given.charAt(i); 
			int firstOcc =given.indexOf(ch);
			while(given.substring(firstOcc+1).indexOf(ch)==-1) { 
				repeated.add(ch); 
				break;
			} 
		}
		System.out.println(" listarraylist"+repeated.get(0));
	}

public static void main(String[] args) { 
	//revCharString(); 
	//makeabsdiffArray(); 
	findfirstoccuchar("madhankumar"); 
	} 
}