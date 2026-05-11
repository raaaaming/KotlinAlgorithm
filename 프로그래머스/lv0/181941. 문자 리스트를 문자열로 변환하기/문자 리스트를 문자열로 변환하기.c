#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// arr_len은 배열 arr의 길이입니다.
// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* arr[], size_t arr_len) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    size_t total_len = 0;
    for (size_t i = 0; i < arr_len; i++) {
        total_len += strlen(arr[i]);
    }
    char* answer = (char*)malloc(total_len + 1);
    
    char* current_pos = answer;
    for (size_t i = 0; i < arr_len; i++) {
        size_t len = strlen(arr[i]);
        memcpy(current_pos, arr[i], len);
        current_pos += len;
    }
    
    *current_pos = '\0';
    return answer;
}