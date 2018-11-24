#include <stdio.h>

int main() {
	int n;
	int i;
	int fib;
	int fibSub1 = 1;
	int fibSub2 = 1;
	scanf("%d",&n);
	if (n <= 2) {
		printf("1");
		return 0;
	}
	else {
		for (i = 3; i <= n; i++) {
			fib = (fibSub1 + fibSub2) % 10007;
			fibSub2 = fibSub1;
			fibSub1 = fib;
		}
		printf("%d",fib);
		return 0;
	}
}
