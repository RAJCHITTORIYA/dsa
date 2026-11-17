# Height Checker

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **Language** | java |
| **Solved On** | November 17, 2026 |
| **Tags** | Array, Sorting, Counting Sort, Bubble Sort |
| **Link** | [View Problem](https://leetcode.com/problems/height-checker/) |
| **Runtime** | 5 ms |
| **Memory** | 43.2 MB |

## Problem Description

<p>A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in <strong>non-decreasing order</strong> by height. Let this ordering be represented by the integer array <code>expected</code> where <code>expected[i]</code> is the expected height of the <code>i<sup>th</sup></code> student in line.</p>

<p>You are given an integer array <code>heights</code> representing the <strong>current order</strong> that the students are standing in. Each <code>heights[i]</code> is the height of the <code>i<sup>th</sup></code> student in line (<strong>0-indexed</strong>).</p>

<p>Return <em>the <strong>number of indices</strong> where </em><code>heights[i] != expected[i]</code>.</p>

<p>&nbsp;</p>
<p><span class="float-right -my-0.5 ml-2 inline-flex select-none items-center" data-example-lang-controls=""><span role="group" class="inline-flex h-6 items-center rounded-sd-md bg-sd-muted p-0.5" data-example-lang-toggle=""><button type="button" aria-pressed="false" class="h-5 max-w-[10rem] truncate whitespace-nowrap rounded-sd-sm border px-2 text-xs font-normal leading-none border-transparent text-sd-muted-foreground hover:text-sd-foreground">Original</button><button type="button" aria-pressed="true" class="h-5 max-w-[10rem] truncate whitespace-nowrap rounded-sd-sm border px-2 text-xs font-normal leading-none border-sd-border bg-sd-background text-sd-foreground">Java</button></span></span><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong><span class="group relative my-1 flex min-w-0 flex-col rounded-sd-md bg-sd-muted px-3 py-1.5 transition-opacity" data-example-lang-cards=""><span class="min-w-0 overflow-x-auto whitespace-pre py-0.5 pr-8 font-menlo text-xs font-normal leading-5 text-sd-foreground">int[] heights = new int[]{1, 1, 4, 2, 1, 3};</span><button type="button" aria-label="Copy" title="Copy" class="absolute flex h-[22px] w-[22px] items-center justify-center rounded-[4px] border right-1.5 top-1.5 border-border-quaternary dark:border-border-quaternary bg-layer-02 dark:bg-layer-02 hover:bg-fill-tertiary dark:hover:bg-fill-tertiary focus-visible:opacity-100 [@media(hover:hover)]:opacity-0 [@media(hover:hover)]:group-hover:opacity-100"><div class="relative text-[12px] leading-[normal] p-[1px] before:block before:h-3 before:w-3 h-3.5 w-3.5 text-text-primary dark:text-text-primary"><svg aria-hidden="true" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" height="1em" width="1em" class="svg-inline--fa fa-clone absolute h-[1em] -translate-x-1/2 -translate-y-1/2 align-[-0.125em] left-1/2 top-1/2"><path fill="currentColor" d="M64 464H288c8.8 0 16-7.2 16-16V384h48v64c0 35.3-28.7 64-64 64H64c-35.3 0-64-28.7-64-64V224c0-35.3 28.7-64 64-64h64v48H64c-8.8 0-16 7.2-16 16V448c0 8.8 7.2 16 16 16zM224 304H448c8.8 0 16-7.2 16-16V64c0-8.8-7.2-16-16-16H224c-8.8 0-16 7.2-16 16V288c0 8.8 7.2 16 16 16zm-64-16V64c0-35.3 28.7-64 64-64H448c35.3 0 64 28.7 64 64V288c0 35.3-28.7 64-64 64H224c-35.3 0-64-28.7-64-64z"></path></svg></div></button></span><strong>Output:</strong> 3
<strong>Explanation:</strong> 
heights:  [1,1,<u>4</u>,2,<u>1</u>,<u>3</u>]
expected: [1,1,<u>1</u>,2,<u>3</u>,<u>4</u>]
Indices 2, 4, and 5 do not match.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong><span class="group relative my-1 flex min-w-0 flex-col rounded-sd-md bg-sd-muted px-3 py-1.5 transition-opacity" data-example-lang-cards=""><span class="min-w-0 overflow-x-auto whitespace-pre py-0.5 pr-8 font-menlo text-xs font-normal leading-5 text-sd-foreground">int[] heights = new int[]{5, 1, 2, 3, 4};</span><button type="button" aria-label="Copy" title="Copy" class="absolute flex h-[22px] w-[22px] items-center justify-center rounded-[4px] border right-1.5 top-1.5 border-border-quaternary dark:border-border-quaternary bg-layer-02 dark:bg-layer-02 hover:bg-fill-tertiary dark:hover:bg-fill-tertiary focus-visible:opacity-100 [@media(hover:hover)]:opacity-0 [@media(hover:hover)]:group-hover:opacity-100"><div class="relative text-[12px] leading-[normal] p-[1px] before:block before:h-3 before:w-3 h-3.5 w-3.5 text-text-primary dark:text-text-primary"><svg aria-hidden="true" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" height="1em" width="1em" class="svg-inline--fa fa-clone absolute h-[1em] -translate-x-1/2 -translate-y-1/2 align-[-0.125em] left-1/2 top-1/2"><path fill="currentColor" d="M64 464H288c8.8 0 16-7.2 16-16V384h48v64c0 35.3-28.7 64-64 64H64c-35.3 0-64-28.7-64-64V224c0-35.3 28.7-64 64-64h64v48H64c-8.8 0-16 7.2-16 16V448c0 8.8 7.2 16 16 16zM224 304H448c8.8 0 16-7.2 16-16V64c0-8.8-7.2-16-16-16H224c-8.8 0-16 7.2-16 16V288c0 8.8 7.2 16 16 16zm-64-16V64c0-35.3 28.7-64 64-64H448c35.3 0 64 28.7 64 64V288c0 35.3-28.7 64-64 64H224c-35.3 0-64-28.7-64-64z"></path></svg></div></button></span><strong>Output:</strong> 5
<strong>Explanation:</strong>
heights:  [<u>5</u>,<u>1</u>,<u>2</u>,<u>3</u>,<u>4</u>]
expected: [<u>1</u>,<u>2</u>,<u>3</u>,<u>4</u>,<u>5</u>]
All indices do not match.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong><span class="group relative my-1 flex min-w-0 flex-col rounded-sd-md bg-sd-muted px-3 py-1.5 transition-opacity" data-example-lang-cards=""><span class="min-w-0 overflow-x-auto whitespace-pre py-0.5 pr-8 font-menlo text-xs font-normal leading-5 text-sd-foreground">int[] heights = new int[]{1, 2, 3, 4, 5};</span><button type="button" aria-label="Copy" title="Copy" class="absolute flex h-[22px] w-[22px] items-center justify-center rounded-[4px] border right-1.5 top-1.5 border-border-quaternary dark:border-border-quaternary bg-layer-02 dark:bg-layer-02 hover:bg-fill-tertiary dark:hover:bg-fill-tertiary focus-visible:opacity-100 [@media(hover:hover)]:opacity-0 [@media(hover:hover)]:group-hover:opacity-100"><div class="relative text-[12px] leading-[normal] p-[1px] before:block before:h-3 before:w-3 h-3.5 w-3.5 text-text-primary dark:text-text-primary"><svg aria-hidden="true" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" height="1em" width="1em" class="svg-inline--fa fa-clone absolute h-[1em] -translate-x-1/2 -translate-y-1/2 align-[-0.125em] left-1/2 top-1/2"><path fill="currentColor" d="M64 464H288c8.8 0 16-7.2 16-16V384h48v64c0 35.3-28.7 64-64 64H64c-35.3 0-64-28.7-64-64V224c0-35.3 28.7-64 64-64h64v48H64c-8.8 0-16 7.2-16 16V448c0 8.8 7.2 16 16 16zM224 304H448c8.8 0 16-7.2 16-16V64c0-8.8-7.2-16-16-16H224c-8.8 0-16 7.2-16 16V288c0 8.8 7.2 16 16 16zm-64-16V64c0-35.3 28.7-64 64-64H448c35.3 0 64 28.7 64 64V288c0 35.3-28.7 64-64 64H224c-35.3 0-64-28.7-64-64z"></path></svg></div></button></span><strong>Output:</strong> 0
<strong>Explanation:</strong>
heights:  [1,2,3,4,5]
expected: [1,2,3,4,5]
All indices match.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= heights.length &lt;= 100</code></li>
	<li><code>1 &lt;= heights[i] &lt;= 100</code></li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: 💯✅🔥Easy Java ,Python3 ,C++ Solution|| 2 ms ||≧◠‿◠≦✌
**Author**: [@suyalneeraj09](https://leetcode.com/suyalneeraj09/)
**Upvotes**: 41 👍
**Link**: [View Original Post](https://leetcode.com/problems/height-checker/solutions/5286562/)

---

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The problem is to find the number of students who are not in their correct positions in a line based on their heights. This is achieved by comparing the actual order of students with the order they would be in if they were sorted by height.
# Approach
<!-- Describe your approach to solving the problem. -->
- **Create a Copy of the Original Array**: Create a copy of the original array to maintain the original order of students.
- **Sort the Copy**: Sort the copy of the array in ascending order based on the heights.
- **Compare the Original and Sorted Arrays**: Iterate through both arrays and count the number of students who are not in their correct positions.
# Complexity
- Time complexity:O(n log n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:O(n)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->


# Code
```Java []
class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i])
                count++;
        }
        return count;
    }
}
```
```python3 []
class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        return sum(h1 != h2 for h1, h2 in zip(heights, sorted(heights)))
```
```C++ []
class Solution {
public:
    int heightChecker(vector<int>& heights) {
        vector<int> v(heights);
        sort(v.begin(),v.end());
        int count = 0;
        for(int i=0;i<heights.size();i++){
            if(heights[i] != v[i])
             count++;
        }
        return count;
    }
};
```

![upvote.png](https://assets.leetcode.com/users/images/ef3746b7-74e8-46ac-b638-a232588b33cb_1717979537.4347806.png)




</details>
