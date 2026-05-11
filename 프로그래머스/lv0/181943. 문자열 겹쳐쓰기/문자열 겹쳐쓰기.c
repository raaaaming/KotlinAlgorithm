#include <string.h>
#include <stdlib.h>

char* solution(const char* my_string, const char* overwrite_string, int s) {
    int len = strlen(my_string);
    char* answer = (char*)malloc(len + 1);
    strcpy(answer, my_string);
    memcpy(answer + s, overwrite_string, strlen(overwrite_string));

    return answer;
}
