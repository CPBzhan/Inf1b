- Name: Zehan Wang
- Student ID: s2799443
- Tutorial group: 03C
- Tutor: Anna Kandyba
- Date: 2026-03-18

The actual questions are in the A2P2 readme.md file.

* [1: Helping previous you](#1-helping-previous-you-)
* [2: Helping future you](#2-helping-future-you-)
* [3: You be the judge](#3-you-be-the-judge-)
* [4: Have you used your feedback? ](#4-how-have-you-used-your-feedback-)

# 1: Helping previous you #

When I first approached this challenge, the most confusing part was
understanding how the algorithm actually changes the matrix step by step.

At first, I only understood the idea of “rotating rows and columns”, but
I did not understand how this is implemented in code.

If I were explaining this to my earlier self, I would focus on how each
line of the algorithm works in practice.

The key idea is that we do not move elements one step at a time.
Instead, we calculate where each element should go directly.

For example, when rotating a row:

- suppose we are at position j
- we compute the new position using:

  newIndex = (j + shift) mod n

This means:

- j is the original position
- shift is how far we move
- mod n makes the value wrap around

So instead of shifting multiple times, we place each element directly
into its final position.

Another important detail is the use of a temporary array.

Without a temporary array, we would overwrite values too early.

For example:

- if we move the first element into a new position
- we might destroy a value that we still need later

The temporary array solves this problem by:

1. storing all new values first
2. copying them back into the matrix afterwards

Finally, I would explain how the loop controls everything:

- the loop index i determines whether we rotate a row or column
- i / 2 determines which row or column we are working on

Understanding these small implementation details makes the algorithm
much clearer and easier to implement.

# 2: Helping future you #

If I encountered a similar problem in the future, I would focus on both
the high-level idea and the low-level implementation details.

First, I would identify the pattern in the operations:

- even index → row rotation
- odd index → column rotation

Then, I would think about how to implement the movement of elements.

Instead of using repeated shifts, I would always try to compute the final
position directly using a formula.

For example:

newIndex = (currentIndex + shift) mod n

This avoids unnecessary loops and improves efficiency.

I would also make sure to:

- reduce the shift using modulo before doing any work
- convert negative shifts into positive ones

This ensures that the algorithm behaves correctly in all cases.

Another important strategy is separating the logic into methods:

- one method for rotation
- one method for printing

This makes the code easier to test and reuse.

Finally, I would always test with small examples first.

By manually checking how each element moves, I can confirm that the
implementation is correct before trying more complex inputs.

# 3: You be the judge #

Between the two designs, the winning design is clearly preferable. The
winning design uses modular index mapping to compute the final position
of each element directly. This avoids performing repeated shift
operations and keeps the algorithm efficient.

In contrast, the losing design performs rotations by repeatedly shifting
elements one position at a time. While this approach is easy to
understand, it can perform many unnecessary operations when the rotation
distance is large. For example, rotating a row by 100 positions in a
matrix of size 10 still performs 100 shifts even though the effective
rotation is only 0.

Because the winning design reduces unnecessary work and keeps the code
more structured, it is both more efficient and easier to maintain.

# 4: How have you used the feedback you got from Part 1 to improve your submission? #

The feedback from Part 1 helped me improve my work in several specific
ways, especially in terms of clarity, structure, and explanation of the
algorithm.

One important change was improving the level of detail in my explanations.
Previously, I focused more on describing what the algorithm does, but I
did not clearly explain how it works step by step. In this submission, I
added more detailed explanations of the implementation, including how
indices are calculated, how the modulo operation works, and why a
temporary array is required. This makes the worksheet easier for beginners
to follow.

I also improved the pseudocode section. In Part 1, the pseudocode was too
abstract and did not clearly show how the algorithm operates. I rewrote
it to make each step explicit, including how rows and columns are selected
and how elements are moved.

Another improvement was the use of diagrams. I added two different types
of diagrams: a conceptual diagram to explain how rotations work, and a
flowchart to show how the algorithm is executed. I also included
explanations of how to read these diagrams, so that they support the
learning process rather than just acting as visual decoration.

In addition, I refined the code implementation. I reduced code duplication
by combining row and column rotation into a single method, added more
detailed comments to explain each step, and improved input handling by
supporting the required input format and adding error checking.

Finally, I ensured that all formatting requirements were followed
correctly, including using the correct short CodeGolf URL and improving
the overall structure of the document.

Overall, the feedback helped me move from simply presenting a solution to
clearly explaining both the algorithm and its implementation in a way
that is accessible to beginners.

<STYLE>
* { /* Don't leave any empty lines or IntelliJ might not render correctly */
  /* Text size */
  font-size:   1.1rem;
  /*font-size:   1.2rem;*/
  /* Zenburn dark theme */
  background-color: #2A252A;
  color:            #D5DAD5;
  /* One Dark theme */
  /*background-color: #282C34;
  color:            #ABB2BF;*/
  /* white-ish on dull blue-ish */
  /*background-color: DarkSlateGray;
    color:            AntiqueWhite;*/
  /* white on black */
  /*background-color: black;
  color: white;*/
  /* black on white */
  /*background-color: white;
  color: black;*/
  /* nearly black on bright yellow */
  /*background-color: #FFFFAA;
  color:            #080808;*/
  /* black on bright blue */  
  /*background-color: #99CCFF;
  color:            black;*/
}
body {
  /* width of the text column */
  width: 80%;
  /* line spacing */
  line-height: 180%;
  /*line-height: 200%;*/
  /* Font styles: */
  /* Default sans serif */
  /*font-family: sans-serif;*/
  /* Default serif */
  font-family: serif;
  /* Specific font with generic fall-back */
  /* font-family: "Calibri Light", sans-serif; */
  /*font-family: "OpenDyslexic", sans-serif;*/
}
pre,
code,
pre code {
  /* line spacing */
  line-height: 150%;
  /* Default monospace */
  font-family: monospace;
  /* Specific fixed-width font with generic fall-back */
  /*font-family: "Consolas", monospace;*/
  /*font-family: "OpenDyslexicMono", monospace;*/
}
ol,
ol ol,
ol ol ol { /* Nested lists all use decimal numbering */
  list-style-type: decimal;
}
em {
  /* if you want underlining instead of italics */
  /*font-style: normal;
  border-bottom-style: solid;
  border-bottom-width: 1px;
  padding-bottom:      2px;*/
  text-decoration-skip-ink: auto;
}
h2 { /* Put a horizontal line above major headings to assist screen viewing */
  border-top:  1px solid #D5DAD5;
  margin-top:  80px;
  padding-top: 20px;
  }
</STYLE>
