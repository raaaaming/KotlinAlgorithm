#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(0); 
    cin.tie(0);
    
    int N, M;
    int i, j, k;
    int arr[101] = { 0, };
    
    cin >> N >> M;
    
    for (int a=0; a<M; a++) {
        cin >> i >> j >> k;
        
        for (int b=i; b<=j; b++) {
            arr[b] = k;
        }
    }
    
    for (int i=1; i<=N; i++) {
        cout << arr[i] << ' ';
    }
    
    return 0;
}