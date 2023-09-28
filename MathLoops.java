
/*
 * name: Zhongtian Zhai
 * zzhai4@u.rochester.edu
 * last modified at 27 Sep,2023
 * Assignment name: MathLoops
 */

import java.util.Scanner;

public class MathLoops {
	public static boolean prime(long n) {
		if (n == 1)
			return false;
		for (long i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static String factors(long n) {
		if (n == 1) {
			return " ";
		}
		String result="";
		for (long i = 2; i <= n; i++) {
			if (n % i == 0) {
				if (prime(i) == true) {
					result += i+ " ";
					return result + factors(n / i);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNextLine()) {
			String w = s.next();
			if (w.equals("quit"))
				break;
			else {
				long n = s.nextLong();
				s.nextLine();
				if (w.equals("factors")) {
					System.out.println(factors(n));
				} else if (w.equals("prime"))
					System.out.println(prime(n));
			}
		}
	}
}
