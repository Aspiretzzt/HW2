
/*
 * name: Zhongtian Zhai
 * zzhai4@u.rochester.edu
 * last modified at 27 Sep,2023
 * Assignment name: MathLoops
 */
import java.util.Scanner;

public class MathLoops {
	public static boolean Check(long n) {
		if (n == 1)
			return false;
		for (long i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void primefactor(long n, long f) {
		if (n == 1) {
			System.out.println(" ");
			return;
		}
		for (long i = f; i <= n; i++) {
			if (n % i == 0) {
				if (Check(i) == true) {
					System.out.print(i + " ");
					primefactor(n / i, i);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNextLine()) {
			String w = s.next();
			if (w.equals("quit"))
				break;
			else {
				long n = s.nextInt();
				s.nextLine();
				if (w.equals("factors"))
					primefactor(n, 2);
				else if (w.equals("prime"))
					System.out.println(Check(n));
			}
		}
	}
}
