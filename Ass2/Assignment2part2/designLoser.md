# Losing Design

## Overview

This design rotates rows and columns by repeatedly shifting elements
one position at a time.

Although this approach produces the correct result, it is inefficient
because it performs many unnecessary operations when the shift value
is large.

Instead of computing the final position directly, it simulates movement
step by step.

---

## Key Idea

The core idea of this design is:

Repeat a single-step shift multiple times until the desired rotation
distance is reached.

For example:

To rotate right by 3:

- shift once
- shift again
- shift again

This mimics the physical movement of elements, but is inefficient.

---

## Algorithm Description

Given an n × n matrix and a list of 2n integers:

1. Process each operation in order
2. For each operation:
    - If index is even → rotate a row
    - If index is odd → rotate a column
3. Repeat the following |shift| times:
    - perform a single-step rotation

---

## Pseudocode
for i from 0 to 2n-1:
    shift = operations[i]
    if i is even:
        repeat |shift| times
        shift row right by one position
    else:
        repeat |shift| times
        shift column down by one position

Single-step row rotation:
    save last element
    move all elements one position to the right
    place saved element at the beginning

Single-step column rotation:
    save bottom element
    move all elements one position down
    place saved element at the top

---

## Disadvantages of this Design

### 1. Inefficient for Large Shifts

This design performs |shift| operations:

- shift = 100 → 100 loops
- even if matrix size is small

Example:

n = 10, shift = 100  
→ effective shift = 0  
→ but still performs 100 operations ❌

---

### 2. Poor Time Complexity

Each rotation becomes:

O(n × |shift|)

Worst case:

O(n² × shift)

This is significantly worse than the winning design.

---

### 3. Unnecessary Repetition

The same work is repeated multiple times:

- moving elements again and again
- instead of computing final positions once

---

### 4. Harder to Maintain

More loops = more complexity:

- harder to debug
- more chances for bugs
- more code duplication

---

### 5. Conceptually Misleading

This approach focuses on "how elements move step by step"
instead of understanding the mathematical structure of rotation.

This can prevent learners from developing better algorithmic thinking.

---

## Conclusion

This design is considered inferior because it is:

- inefficient
- repetitive
- harder to scale

While it is easier to understand initially, it does not demonstrate
good algorithm design compared to the winning solution.

The winning design improves on this by eliminating repeated work and
using direct index calculation.