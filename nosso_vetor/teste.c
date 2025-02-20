#include <stdio.h>

int main () {
    int v[5];
    int i;
    for (i=0; i<5; i++) {
        v[i] = i*10;
        printf("%d\n", v[i]);
    }
    return 0;
}