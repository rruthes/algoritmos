# Big O Notation

## O que é
Forma de determinar o quão eficiente é um algoritmo, classificando-o quanto ao tempo de execução ou uso de memória à medida que o tamanho da entrada cresce. Mostra como o algoritmo se comporta lidando com entradas grandes.

## Tipos comuns de Complexidade na Notação Big O
**O(1) - Constante**
- O tempo de execução não muda, não dependendo do tamanho da entrada.
- O algoritmo sempre executa a mesma quantidade de operações.
- Exemplo:
````python
def acessar_elemento(lista, i):
    return lista[i]
````
- Esse exemplo é usado para acessar um elemento específico de uma array.

**O(log n) - Logarítmica**
- O tempo de execução cresce lentamente à medida que a entrada aumenta
- O tamanho do problema reduz pela metade (ou outra fração) a cada iteração.
- É usado na busca binária.
````python
def busca_binaria(arr, alvo):
    inicio, fim = 0, len(arr) - 1
    while inicio <= fim:
        meio = (inicio + fim) // 2
        if arr[meio] == alvo:
            return meio
        elif arr[meio] < alvo:
            inicio = meio + 1
        else:
            fim = meio - 1
    return -1
````
- Esse exemplo é usado em algoritmos de busca eficientes.

**O(n) - Linear**
- O tempo de execução cresce proporcionalmente ao tamanho da entrada.
- Um único loop que percorre todos os elementos uma vez.
- É usado para percorrer um array em busca de um valor.
````python
def buscar_elemento(arr, alvo):
    for i in range(len(arr)):
        if arr[i] == alvo:
            return i
    return -1
````
- Esse exemplo é usado em contagem de elementos.

**O(n log n) - Quasilinear**
- O tempo de execução cresce um pouco mais rápido que linear, mas não exponencialmente.
- O problema é dividido em partes menores e processado recursivamente.
- Usado em alguns algoritmos de ordenação eficiente (Quick Sort e Merge Sort).
````python
def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    meio = len(arr) // 2
    esquerda = merge_sort(arr[:meio])
    direita = merge_sort(arr[meio:])
    return merge(esquerda, direita)

def merge(esq, dir):
    resultado = []
    i = j = 0
    while i < len(esq) and j < len(dir):
        if esq[i] < dir[j]:
            resultado.append(esq[i])
            i += 1
        else:
            resultado.append(dir[j])
            j += 1
    resultado.extend(esq[i:])
    resultado.extend(dir[j:])
    return resultado
````

**O(n²) - Quadrática**
- O tempo de execução cresce exponencialmente conforme a entrada aumenta.
- Normalmente apresenta dois loops aninhados percorrendo toda a entrada.
- É o caso do Bubble Sort e do Selection Sort.
````python
def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(n - i -1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j+1] = arr [j+1], arr[j]
````
- É encontrado em algoritmos de força bruta ou pouco otimizados.

**O(2ⁿ) - Exponencial**
- O tempo de execução cresce muito rapidamente conforme a entrada aumenta.
- Cada chamada recursiva gera duas novas chamadas, o que gera um crescimento exponencial.
- É o caso de resoluções de Fibonacci simples.
````python
def fibonacci(n):
    if n <= 1:
        return n
    return fibonacci(n - 1) + fibonacci(n - 2)
````
- É encontrado em alguns algoritmos de backtracking e problemas NP-difíceis.

## Exemplos de perguntas sobre Big O
### Questões teóricas
- 1. O que é a notação Big O e por que ela é usada?
  - *A notação Big O é uma expressão que mede o tempo de execução ou o uso de memória de um determinado algoritmo. Ela é usada para classificar a eficiência de um algoritmo, permitindo decidir qual algoritmo é mais adequado.*
- 2. Qual a complexidade do algoritmo de busca binária?
  - *O algoritmo de busca binária tem a complexidade O(log n).*
- 3. Como a complexidade O(n log n) se compara a O(n²)?
  - *A complexidade O(n log n) apresenta um crescimento menos acentuado no tempo de execução com o aumento da entrada, o que não acontece na complexidade O(n²), onde o tempo de execução cresce muito rapidamente. Isso faz com que a notação O(n log n) seja muito mais eficiente do que a O(n²).*
- 4. Quais são os principais tipos de complexidade assintótica?
  - *O(n), O(1), O(log n), O(n log n), O(n²), O(n!), O(2ⁿ).*
---
