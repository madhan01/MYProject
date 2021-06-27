package come.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;

public class TestClass {
	public void reverString() {
		String s = "madhan";
		System.out.println("Given string ::" + s);
		int lenStr = s.length();
		String revStr = "";
		for (int i = lenStr - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
			revStr = revStr + s.charAt(i);
		}
		System.out.println("reverse string :" + revStr);
		StringBuffer sf = new StringBuffer(s);
		System.out.println("Reverse string using string buffer :" + sf.reverse());
	}

	public void replacejunk() {
		String strl = "selenium #$%#@ AA testing 0123182963 #$%#$ AA ahfsudhf AA";
		System.out.println("Remove junk char :" + strl.replaceAll("[^a-zA-Z0-9]", ""));
	}

	public void reverseInteger() {
		int value = 916891638;
		int revV = 0;
		while (value != 0) {
			revV = revV * 10 + value % 10;
			value = value / 10;
		}
		System.out.println("rever int :" + revV);
		int secVal = 461328234;
		System.out.println("using sting buffer :" + new StringBuffer(String.valueOf(secVal)).reverse());
	}

	public void findElementinArray() {
		String names[] = { "Java", "Java", "C", "Ruby", "VBScript", "Groovy", "Python", "C" };
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("Dublicate Elemnt :" + names[i]);
				}
			}
		}
	}

	/** using hashset */

	public static void usingHashSet() {
		String names[] = { "Java", "Java", "C", "Ruby", "VBScript", "Groovy", "Python", "C" };

		Set<String> langs = new HashSet<String>();
		for (String name : names) {
			if (langs.add(name) == false) {
				System.out.println("Dublicate element is " + name);
			}
		}
	}

	/** using hash map */

	public static void usingHashMap() {
		String names[] = { "Java", "Java", "C", "Ruby", "VBScript", "Groovy", "Python", "C" };
		Map<String, Integer> hashmap = new HashMap<String, Integer>();
		for (String name : names) {
			Integer count = hashmap.get(name);
			if (count == null) {
				hashmap.put(name, 1);
			} else {
				hashmap.put(name, ++count);
			}
		}
//Iterate using iterator
		Iterator<Entry<String, Integer>> il = hashmap.entrySet().iterator();
		while (il.hasNext()) {
			Map.Entry<String, Integer> newMap = (Map.Entry<String, Integer>) il.next();

			if (newMap.getValue() > 1) {
				System.out.println("Duplicate String " + newMap.getKey());
			}
		}
//Iterate using Entry set		
		Set<Entry<String, Integer>> entrySet = hashmap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate element ew :" + entry.getKey());
			}
		}
	}

	public static void samllestandLargest() {
		int number[] = { 34, 10, 4567, 23, -10, 100, 874, -100 };
		int smallest = number[0];
		int largset = number[0];
		for (int i = 1; i < number.length; i++) {
			if (number[i] > largset) {
				largset = number[i];
			}
			if (number[i] < smallest) {
				smallest = number[i];
			}

		}
		System.out.println("smallest number" + smallest);
		System.out.println("LArgest number :" + largset);
	}

	// public void finalize () { System.out.println("Inside Finalize"); }

	public static void findnonrepititivechar() {
		String str = "madhankumar";
		int strLen = str.length();
		for(int i=0; i<strLen; i++) {
			int nonrepetionChar = str.substring(str.indexOf(str.charAt(i))+1).indexOf(str.charAt(i));
			if(nonrepetionChar<0){
				System.out.println("First non repititive char  is  :"+str.charAt(i));
				break;
			}	
		}
	}

	public static void main(String args[]) {
		TestClass t1 = new TestClass();
		// t1.reverString();
		// t1.replacejunk ();
		// t1.reverseInteger();
		// t1.findElementinArray();
		// t1.samllestandLargest();
//		t1.usingHashSet();
//		t1.usingHashMap();
		t1.findnonrepititivechar();
		System.gc();
	}
}
