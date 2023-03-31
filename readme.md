# Sorting Algorithms

## Insertion Sort[^1]

|   Case    |   Complexity  |
|:---       |   ---:        |
| Worst     | `O(n^2)`      |
| Average   | `O(n^2)`      |
| Best      | `O(n)`        |
| Stable    | `false`       |

### Explanation

Basicaly, the insertion sort consider that the input list has two subscections. Starting with **sorted** elements, and immediately after, the **unsorted** elements section. In its first iteraction, the first element, from index 0, is considered as the **sorted** section. From the second element (index 1) and so on, starts the comparisons.

Since the target index is greater than 0 and its value is lower than the value of the previous index (target index minus one), these values are swaped and the target index is decreased. This comparison keeps going until one of these conditions are false, like, **target index** is not greater than 0 or the value of the target index is **greater or equal** to the **antecedent value of the target index**. 

These comparisions are made with all positions of the input, so, if it is not sorted, it will have and complexity of `O(n^2)` as average or wors case. Otherwise, iIf the input is already sorted, it will have a complexity of `O(n)`.

The insertion sort is slow and it is not recommended for big amount of data.

#### Ordenação por inserção
Basicamente, a ordenação por inserção considera que a lista de dados possui duas subseções. Començando com os elementos **ordenados**, e imediatamente após, a seção de elementos **não ordenados**.

Desde que o índice alvo da entrada de dados for superior a 0, e seu valor for menor que o valor do índice anterior, esses valores são trocados e o índice alvo é decrementado. Esta comparação é feita repetidamente até que uma das condições resultem em falso, como, a posição do **índice alvo** não for maior que 0 ou o valor da posição do **índice alvo** for **maior ou igual** ao valor da posição **anterior ao índice alvo**.

[^1]: [Insertion Sort reference at Interview Cake](https://www.interviewcake.com/concept/python/insertion-sort)