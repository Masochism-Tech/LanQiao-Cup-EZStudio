import java.util.Scanner;
import java.lang.System;

public class Main {
	public static void main() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner().nextInt();
		int i;
		int fib;
		int fibSub1 = 1;
		int fibSub2 = 1;
		if (n <= 2) {
			System.out.println("-1");
			System.exit(0);
		}
		else {
			for (i = 3; i <= n; i++) {
				fib = (fibSub1 + fibSub2) % 10007;
				fibSub2 = fibSub1;
				fibSub1 = fib;
			}
			System.out.println(fib);
			System.exit(0);
		}
	}
}