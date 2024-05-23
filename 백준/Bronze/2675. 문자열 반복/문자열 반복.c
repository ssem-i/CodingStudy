#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
//#include <stdlib.h>
#include <string.h>
int main() {
	char S[20]; int T, R;
	scanf("%d", &T);
	for (int i = 0; i < T; i++) {
		scanf("%d %s", &R, S);
		int len = strlen(S);
		for (int k = 0; k < len; k++) {
			for (int j = 0; j < R; j++) {
				printf("%c", S[k]);
			}
		}
		printf("\n");
	}
}
