package solved.ac_class3;

import java.util.Scanner;

public class acmicpc_10816 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		sc.nextLine();
		char [] c = sc.nextLine().toCharArray();
		long sum = 0;
		long l = 1234567891;
		for (int i = 0; i < c.length; i++) {
			sum+=((c[i]-96)%l)*(Math.pow((long)31, (long)i)%l);
		}
		System.out.println(sum%l);
	}
}
