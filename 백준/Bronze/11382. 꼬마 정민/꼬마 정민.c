#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	long long A = 77, B = 77, C = 7777;
	long long R;
	scanf("%lld %lld %lld", &A, &B, &C);
	R = A + B + C;
	printf("%lld", R);
}