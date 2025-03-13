# Algoritmos de Ordenação

## Insert Sort

O **Insert Sort** é um algoritmo de ordenação simples que constrói a lista ordenada um item de cada vez. É muito eficiente para listas pequenas ou quase ordenadas. O funcionamento básico é o seguinte:
1. Percorre a lista da esquerda para a direita.
2. Para cada elemento, insere-o na posição correta em relação aos elementos anteriores.

### Vantagens
- Simples de implementar.
- Eficiente para listas pequenas ou quase ordenadas.

### Desvantagens
- Ineficiente para listas grandes.
- Complexidade de tempo: O(n²).

## Bubble Sort

O **Bubble Sort** é um algoritmo de ordenação simples que repetidamente percorre a lista, compara elementos adjacentes e os troca se estiverem na ordem errada. O processo é repetido até que a lista esteja ordenada.

### Vantagens
- Simples de entender e implementar.
- Detecta se a lista já está ordenada.

### Desvantagens
- Muito ineficiente para listas grandes.
- Complexidade de tempo: O(n²).

## Selection Sort

O **Selection Sort** é um algoritmo de ordenação que divide a lista em duas partes: a sublista dos itens já ordenados e a sublista dos itens restantes a serem ordenados. A cada iteração, o menor (ou maior) elemento da sublista não ordenada é selecionado e movido para a sublista ordenada.

### Vantagens
- Simples de implementar.
- Desempenho consistente, independentemente da ordem inicial dos elementos.

### Desvantagens
- Ineficiente para listas grandes.
- Complexidade de tempo: O(n²).
