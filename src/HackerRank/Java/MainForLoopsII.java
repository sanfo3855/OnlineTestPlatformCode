package HackerRank.Java;

import java.util.Scanner;

public class MainForLoopsII {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t=in.nextInt(); //2
		for(int i=0;i<t;i++) {
			int a = in.nextInt();//0
			int b = in.nextInt();//2
			int n = in.nextInt();//10
			StringBuilder line = new StringBuilder();
			for(int j=0; j<=n-1; j++) {
				int valPrint = a;
				for(int k=0; k<=j; k++) {
					valPrint += (int) Math.pow(2,k)*b;
				}
				line.append(valPrint).append(" ");
			}
			System.out.println(line.toString().trim());
		}
		in.close();
	}
}
