<h2><a href="https://www.geeksforgeeks.org/problems/number-of-solutions4523/1">Number of solutions</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given two integers <strong>b</strong> and <strong>p</strong>, count the number of integers x in the range [1, b] such that: </span><strong><span style="font-size: 18px;">x<sup>2</sup></span><span style="font-size: 18px;">&nbsp;</span></strong><span style="font-size: 18px;"><strong>mod p = 1</strong>.</span></p>
<p><span style="font-size: 18px;">Return the total count of such integers.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input:</strong> </span><span style="font-size: 18px;">b =<strong> </strong>5, p =<strong> </strong>7</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Output:</span> </strong></span><span style="font-size: 18px;">1</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Explanation:</span> <br></strong></span><span style="font-size: 18px;">Among the integers in the range [1, 5], only x = 1 satisfies:
1<sup>2</sup> mod 7 = 1
Hence, the answer is 1.</span></pre>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input:</strong> </span><span style="font-size: 18px;">b =<strong> </strong>8, p =<strong> </strong>6</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Output:</span> </strong></span><span style="font-size: 18px;">3</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Explanation:</span> <br></strong></span><span style="font-size: 18px;">The integers satisfying x² mod 6 = 1 are:
1<sup>2</sup> mod 6 = 1
5<sup>2</sup> = 25, and 25 mod 6 = 1
7<sup>2</sup> = 49, and 49 mod 6 = 1
Therefore, the answer is 3.</span>
</pre>
<p><span style="font-size: 18px;"><strong></strong></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematical</code>&nbsp;<code>Algorithms</code>&nbsp;