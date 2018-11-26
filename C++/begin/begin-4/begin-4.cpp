#include <iostream>

using namespace std;

int main() {
	int n;
	int i;
	int fib;
	int fibSub1 = 1;
	int fibSub2 = 1;
	cin >> n;
	if (n < 3) {
		cout << 1 << endl;
		return 0;
	}
	else {
		for (i = 3; i <= n; i++) {
			fib = (fibSub1 + fibSub2) % 10007;
			fibSub2 = fibSub1;
			fibSub1 = fib;
		}
		cout << fib << endl;
	}
	return 0;
}