package come.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Exampleone {
	public static int paths(int steps) {
		int path[]

				= { 1, 2, 3 };
		if (steps <= 0) {
			return 1;
		} else if (steps == 1) {
			return 1;
		} else if (steps == 2) {
			return 2;
		}
		for (int i = 3; i < steps; i++) {
			int count = path[2] + path[1] + path[0];
			path[0] = path[1];
			path[1] = path[2];
			path[2] = count;
		}
		return path[2];
	}

	public static int countWays(int n)

	{
		if (n == 1)
			return 1;
		int[] res = new int[n + 1];
		res[0] = 1;
		res[1] = 1;
		res[2] = 2;
		for (int i = 3; i <= n; i++)
			res[i] = res[i - 1] + res[i - 2] + res[i - 3];
		return res[n];
	}

	public static void main(String[] args) {

//System.out.println("number of paths :" + paths (4)); 
		// System.out.println("number of paths :" + countWays (2));
		LinkedHashSet<Integer> newSet = new LinkedHashSet<Integer>();

		List<Integer> numList = Arrays.asList(10, 20, 30, 40, 50, 60, 70);
		System.out.println("==== For Each====" + numList);

		numList.stream().forEach(num -> newSet.add(num));
		numList.stream();

		System.out.println("added value in set " + newSet);
		Iterator<Integer> il = newSet.iterator();
		while (il.hasNext()) {
			System.out.println("value in set :" + il.next());
		}

		System.out.println(" =========Map===");

		List<Integer> newList = numList.stream().map(n -> n * 2).collect(Collectors.toList());
		System.out.println(newList);

		System.out.println("For Each " + numList);
		System.out.println(" =======Filter===");

		List<Integer> filteredList = numList.stream().filter(n -> n > 30).collect(Collectors.toList());
		System.out.println(filteredList);
		System.out.println("====== Chaining ======");
		List<Integer> chainedList = numList.stream().map(n -> n * 2).filter(n -> n > 30).collect(Collectors.toList());
		System.out.println(chainedList);
	}
}