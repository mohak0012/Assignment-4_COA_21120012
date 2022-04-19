#include <stdio.h>
#include <time.h>
#include <stdlib.h>

int main() {
    clock_t t;

    int i, j, n, k;
    printf("Enter the size of matrix: ");
    scanf("%hu", &n);
    int mat1[n][n];
    int mat2[n][n];
    int res[n][n];

    for(i = 0; i < n; i++) {
        for(j = 0; j < n; j++) {
            mat1[i][j] = (rand()%(41))+10;
            mat2[i][j] = (rand()%(41))+10;
            res[i][j]=0;
        }
    }

    printf("First Matrix is:\n");
    for(i = 0; i<n; i++) {
        for(j = 0; j<n; j++) {
            printf("%d ", mat1[i][j]);
        }
        printf("\n");
    }

    printf("\nSecond Matrix is:\n");
    for(i = 0; i<n; i++) {
        for(j = 0; j<n; j++) {
            printf("%d ", mat2[i][j]);
        }
        printf("\n");
    }
    t = clock();
    for(i = 0; i<n; i++) {
        for(j = 0; j<n; j++) {
            for(k = 0; k<n; k++) {
                res[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
    }
    t = clock() - t;
    double time_taken = ((double)t)/CLOCKS_PER_SEC;

    printf("\nResultant Matrix is:\n");
    for(i = 0; i<n; i++) {
        for(j = 0; j<n; j++) {
            printf("%d ", res[i][j]);
        }
        printf("\n");
    }

    printf("Main took %f seconds to execute \n", time_taken);

}