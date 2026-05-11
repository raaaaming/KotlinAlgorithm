#include <stdio.h>
#define LEN_INPUT 21

int main(void) {
    char s1[LEN_INPUT];
    scanf("%s", s1);
    for (int i = 0; s1[i]; i++) {
        if ((s1[i] >= 'A' && s1[i] <= 'Z') || (s1[i] >= 'a' && s1[i] <= 'z')) {
            s1[i] ^= 32;
        }
    }
    printf("%s", s1);
    return 0;
}
