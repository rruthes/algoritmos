#include <stdio.h>
#include <stdlib.h>

struct no {
    int info;
    struct no * proximo;
};
// o tipo da variável proximo é um ponteiro de struct "nó"
int main () {
    printf ("tamanho do inteiro: %d\n", sizeof(int));
    printf ("tamanho da estrutura: %ld\n", sizeof(struct no));

    struct no no1, no2;

    no1.info = 5;
    no1.proximo = &no2; // endereço do nó 2 

    printf("no1.info: %d\nno1.proximo: %p\n", no1.info, no1.proximo);

    struct no * pt_no;

    pt_no = (struct no *) malloc (sizeof(struct no));
    pt_no->info = 8;
    pt_no->proximo = &no1;

    printf("onde esta o ponteiro pt_no: %p\n", &pt_no);
    printf("para onde o pt_no aponta: %p\n", pt_no); // o conteúdo de um ponteiro é sempre o endereço de memória dele

    printf("o proximo do pt_no é: %p\n", pt_no->proximo);

    return 0;
}