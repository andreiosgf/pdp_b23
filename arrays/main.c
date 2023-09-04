#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define TAM 5

int sumar_array(int x[])
{
    int i,suma=0;
    for(i=0;i<TAM;i++)
    {
        suma+=x[i];
    }
}

int main() {
    printf("Arreglos\n");
    srand(time(NULL));
    int x[TAM];
    int i;
    for(i=0;i<TAM;i++)
    {
        x[i]=rand()%100;
    }

    printf("La suma es %d\n", sumar_array(x));
    return 0;
}
