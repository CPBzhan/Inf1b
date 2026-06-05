# Winning Design

## Overview

This design rotates rows and columns of a square matrix by directly
computing the final position of each element using modular arithmetic.

Instead of moving elements step by step, the algorithm determines where
each value should end up in one calculation. This avoids unnecessary work
and makes the behaviour easier to reason about.

The operations alternate between row and column rotations:

- even indices → rotate rows
- odd indices → rotate columns

This clear structure makes the algorithm predictable and easy to follow.

---

## Key Idea

The most important idea in this design is:

Instead of performing multiple small shifts, we calculate the final index directly:

newIndex = (currentIndex + shift) mod n

This means:

- we only move each element once
- wrap-around happens naturally using modulo
- large shifts are reduced automatically

Example:

If n = 5 and shift = 12

12 mod 5 = 2

So we only rotate by 2, not 12.

---

## Algorithm Description

Given an n × n matrix and a list of 2n integers:

1. Loop through each operation in order
2. For each operation:
    - If the index is even → rotate a row
    - If the index is odd → rotate a column
3. Reduce the shift using modulo:
   shift = shift % n
4. If shift is negative, convert it:
   shift = shift + n
5. Use a temporary array to store rotated values
6. Copy results back into the matrix

---

## Pseudocode
for i from 0 to 2n-1:
    shift = operations[i]
    if i is even:
        rowIndex = i / 2
        rotate row using direct index mapping
    else:
        columnIndex = i / 2
        rotate column using direct index mapping

Row rotation:
for each column j in the row:
    newIndex = (j + shift) mod n
    temp[newIndex] = matrix[row][j]
    copy temp back to matrix[row]

Column rotation:
for each row i:
    newIndex = (i + shift) mod n
    temp[newIndex] = matrix[i][column]
    copy temp back to the matrix column

---

## Advantages of this Design

### 1. Efficient (Time Complexity)

Each rotation processes the row or column only once:

- Time complexity per operation: O(n)
- Total time: O(n²)

This is optimal for this problem.

---

### 2. Avoids Redundant Work

Large shifts are reduced immediately:

- rotating by 100 in size 10 → same as rotating by 0
- no unnecessary loops are executed

---

### 3. Clear and Predictable Logic

Each element is moved exactly once:

- no repeated shifting
- no complicated state changes
- easier to debug

---

### 4. Beginner-Friendly Structure

Although it uses modulo, the logic is consistent:

- same formula for row and column
- same structure for both operations

---

### 5. Safe Implementation

Using a temporary array prevents:

- overwriting values too early
- losing data during rotation

---

## Conclusion

This design is considered the winning solution because it is:

- efficient
- mathematically clean
- easy to reason about
- scalable for larger inputs

It demonstrates a good understanding of both algorithm design and
practical implementation.