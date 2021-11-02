#include <stdio.h>

int calc(void){



    return 0;
}

int main(){
    
    int N, B;
    scanf("%d %d", &N, &B);
    int temp = 0;
    int matrix[5][5];
    int res[5][5];

    for(int i=0; i<N; i++)
        for(int j=0; j<N; j++)
            scanf("%d ", &matrix[i][j]);

    for(int i=0; i<N; i++){
        for(int j=0; j<N; j++){
            temp += matrix[i][j] * matrix[j][i];
        }
        res[i]
    }
    


    return 0;
}