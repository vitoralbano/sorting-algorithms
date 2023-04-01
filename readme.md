# Sorting Algorithms

This is a revision of some sort algorithms, aiming to refresh topics that I've saw in college.
So, fell free to be in touch if there is something wrong or anything else..
Enjoy..

## Index

1. [Complexity summary](#complexity-summary)
2. Bubble sort
3. Selection sort
4. [Insertion sort](#insertion-sort)

---

## Complexity summary

|   Algorithm       |   Worst   |   Average     |   Best    |   Stable  |
|:---               |:---:      |:---:          |:---:      |:---:      |
|Bubble sort        | `O(n^2)`  | `O(n^2)`      | `O(n)`    | &check;   |
|Heap sort [soon]   |           |               |           |           |
|Insertion sort     | `O(n^2)`  | `O(nˆ2)`      | `O(n)`    | &check;   |
|Merge sort [soon]  |           |               |           |           |
|Quick sort [soon]  |           |               |           |           |
|Selection sort     | `O(n^2)`  | `O(n^2)`      | `O(n^2)`  | -         |  


# Insertion Sort

|   Algorithm   |   Worst   |   Average     |   Best    |   Stable  |
|:---           |:---:      |:---:          |:---:      |:---:      |
|Insertion sort | `O(n^2)`  | `O(nˆ2)`      | `O(n)`    | &check;   |

## Explanation[^1]

Basically, the insertion sort consider that the input list has two subsections. Starting with **sorted** elements, and immediately after, the **unsorted** elements section. In its first iteration, the first element, from index 0, is considered as the **sorted** section. From the second element (index 1) and so on, starts the comparisons.

Since the target index is greater than 0 and its value is lower than the value of the previous index (target index minus one), these values are swapped and the target index is decreased. This comparison keeps going until one of these conditions are false, like, **target index** is not greater than 0 or the value of the target index is **greater or equal** to the **antecedent value of the target index**. After this comparisons and sorting, within the **sorted** section, the **index** is increased, getting the next **unsorted** element.

These comparisons are made with all positions of the input, so, if it is not sorted, it will have and complexity of `O(n^2)` as average or worse case. Otherwise, iIf the input is already sorted, it will have a complexity of `O(n)`.

The insertion sort is slow and it is not recommended for big amount of data.

### Ordenação por Inserção
Basicamente, a ordenação por inserção considera que a lista de dados possui duas subseções. Començando com os elementos **ordenados**, e imediatamente após, a seção de elementos **não ordenados**.

Desde que o índice alvo da entrada de dados for superior a 0, e seu valor for menor que o valor do índice anterior, esses valores são trocados e o índice alvo é decrementado. Esta comparação é feita repetidamente até que uma das condições resultem em falso, como, a posição do **índice alvo** não for maior que 0 ou o valor da posição do **índice alvo** for **maior ou igual** ao valor da posição **anterior ao índice alvo**. Após essas comparações e ordenações, dentro da seção **classificada**, o **índice** é incrementado, obtendo o próximo elemento **não classificado**.

[^1]: [Insertion Sort reference at Interview Cake](https://www.interviewcake.com/concept/python/insertion-sort)