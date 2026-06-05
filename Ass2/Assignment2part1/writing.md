- Name: Zehan Wang
- Student ID: s2799443
- Tutorial group: 03C
- Tutor: Anna Kandyba
- Date: 2026-03-09

The actual questions are in
[`readme.md`](readme.md#instructions-for-writingmd- "Link to readme file")

* [1: Helping previous you](#1-helping-previous-you-)
* [2: Helping future you](#2-helping-future-you-)
* [3: You be the judge](#3-you-be-the-judge-)

# 1: Helping previous you #
When I first looked at this challenge, the most confusing part was understanding how the sequence of operations should be applied to the matrix. The problem alternates between row rotations and column rotations, which is not immediately obvious when reading the description quickly.

If I were explaining this to my earlier self, I would start with a very small example matrix such as a 2×2 matrix and walk through each operation step by step. Drawing the intermediate matrices helped me understand how elements move during row and column rotations. I also realised that large rotation values do not need to be applied repeatedly because the effective rotation can be calculated using modulo arithmetic.

# 2: Helping future you #
If I were to solve a similar problem again in the future, I would start by analysing the pattern of operations before writing any code. In this challenge, recognising that the operations alternate between rows and columns makes the algorithm much easier to design.

Another useful approach is to separate the logic into small functions. In my implementation I created separate methods for rotating rows and columns. This keeps the code easier to read and debug. I would also test the algorithm with small matrices first, because it is much easier to track how elements move in a small example.

# 3: You be the judge #
Overall, I think the design I chose is clear and suitable for beginners. The algorithm processes the operations one by one and uses modular arithmetic to calculate the final position of each element during rotation. This approach avoids repeatedly shifting elements and keeps the code relatively simple.

However, the explanation of matrix rotations could still be improved. Beginners might initially find it difficult to visualise how elements move within the matrix. For this reason, the worksheet includes a diagram and step-by-step examples to make the process clearer.

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
