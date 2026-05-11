#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* str1, const char* str2) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int str1Len = strlen(str1);
    int str2Len = strlen(str2);
    char* answer = (char*)malloc(str1Len + str2Len + 1);
    int i = 0;
    while (i < str1Len || i < str2Len) {
        if(i < str1Len) answer[i*2] = str1[i];
        if(i < str2Len) answer[i*2 + 1] = str2[i];
        i++;
    }
    answer[str1Len + str2Len] = '\0';
    return answer;
}