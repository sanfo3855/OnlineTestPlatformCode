package HackerRank.Algorithms.PlusMinus;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'plusMinus' function below.
	 *
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */

	public static void plusMinus(List<Integer> arr) {
		// Write your code here
		int n = arr.size();
		int positive = 0;
		int negative = 0;
		int zero = 0;
		for( int i = 0; i < n; i++) {
			if(arr.get(i)>0) {
				positive++;
			} else if(arr.get(i)<0) {
				negative++;
			} else {
				zero++;
			}
		}
		System.out.println((double)positive/n);
		System.out.println((double)negative/n);
		System.out.println((double)zero/n);
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
								  .map(Integer::parseInt)
								  .collect(toList());

		Result.plusMinus(arr);

		bufferedReader.close();
	}
}
