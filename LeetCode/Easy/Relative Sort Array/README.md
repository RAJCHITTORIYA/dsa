# Relative Sort Array

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **Language** | java |
| **Solved On** | November 17, 2026 |
| **Tags** | Array, Hash Table, Sorting, Counting Sort, Quicksort, Bubble Sort |
| **Link** | [View Problem](https://leetcode.com/problems/relative-sort-array/) |
| **Runtime** | 5 ms |
| **Memory** | 43.5 MB |

## Problem Description

<p>Given two arrays <code>arr1</code> and <code>arr2</code>, the elements of <code>arr2</code> are distinct, and all elements in <code>arr2</code> are also in <code>arr1</code>.</p>

<p>Sort the elements of <code>arr1</code> such that the relative ordering of items in <code>arr1</code> are the same as in <code>arr2</code>. Elements that do not appear in <code>arr2</code> should be placed at the end of <code>arr1</code> in <strong>ascending</strong> order.</p>

<p>&nbsp;</p>
<p><span class="float-right -my-0.5 ml-2 inline-flex select-none items-center" data-example-lang-controls=""><span role="group" class="inline-flex h-6 items-center rounded-sd-md bg-sd-muted p-0.5" data-example-lang-toggle=""><button type="button" aria-pressed="false" class="h-5 max-w-[10rem] truncate whitespace-nowrap rounded-sd-sm border px-2 text-xs font-normal leading-none border-transparent text-sd-muted-foreground hover:text-sd-foreground">Original</button><button type="button" aria-pressed="true" class="h-5 max-w-[10rem] truncate whitespace-nowrap rounded-sd-sm border px-2 text-xs font-normal leading-none border-sd-border bg-sd-background text-sd-foreground">Java</button></span></span><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong><span class="group relative my-1 flex min-w-0 flex-col rounded-sd-md bg-sd-muted px-3 py-1.5 transition-opacity" data-example-lang-cards=""><span class="min-w-0 overflow-x-auto whitespace-pre py-0.5 pr-8 font-menlo text-xs font-normal leading-5 text-sd-foreground">int[] arr1 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};</span><span class="min-w-0 overflow-x-auto whitespace-pre py-0.5 pr-8 font-menlo text-xs font-normal leading-5 text-sd-foreground">int[] arr2 = new int[]{2, 1, 4, 3, 9, 6};</span><button type="button" aria-label="Copy" title="Copy" class="absolute flex h-[22px] w-[22px] items-center justify-center rounded-[4px] border right-1.5 top-1.5 border-border-quaternary dark:border-border-quaternary bg-layer-02 dark:bg-layer-02 hover:bg-fill-tertiary dark:hover:bg-fill-tertiary focus-visible:opacity-100 [@media(hover:hover)]:opacity-0 [@media(hover:hover)]:group-hover:opacity-100"><div class="relative text-[12px] leading-[normal] p-[1px] before:block before:h-3 before:w-3 h-3.5 w-3.5 text-text-primary dark:text-text-primary"><svg aria-hidden="true" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" height="1em" width="1em" class="svg-inline--fa fa-clone absolute h-[1em] -translate-x-1/2 -translate-y-1/2 align-[-0.125em] left-1/2 top-1/2"><path fill="currentColor" d="M64 464H288c8.8 0 16-7.2 16-16V384h48v64c0 35.3-28.7 64-64 64H64c-35.3 0-64-28.7-64-64V224c0-35.3 28.7-64 64-64h64v48H64c-8.8 0-16 7.2-16 16V448c0 8.8 7.2 16 16 16zM224 304H448c8.8 0 16-7.2 16-16V64c0-8.8-7.2-16-16-16H224c-8.8 0-16 7.2-16 16V288c0 8.8 7.2 16 16 16zm-64-16V64c0-35.3 28.7-64 64-64H448c35.3 0 64 28.7 64 64V288c0 35.3-28.7 64-64 64H224c-35.3 0-64-28.7-64-64z"></path></svg></div></button></span><strong>Output:</strong> [2,2,2,1,4,3,3,9,6,7,19]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong><span class="group relative my-1 flex min-w-0 flex-col rounded-sd-md bg-sd-muted px-3 py-1.5 transition-opacity" data-example-lang-cards=""><span class="min-w-0 overflow-x-auto whitespace-pre py-0.5 pr-8 font-menlo text-xs font-normal leading-5 text-sd-foreground">int[] arr1 = new int[]{28, 6, 22, 8, 44, 17};</span><span class="min-w-0 overflow-x-auto whitespace-pre py-0.5 pr-8 font-menlo text-xs font-normal leading-5 text-sd-foreground">int[] arr2 = new int[]{22, 28, 8, 6};</span><button type="button" aria-label="Copy" title="Copy" class="absolute flex h-[22px] w-[22px] items-center justify-center rounded-[4px] border right-1.5 top-1.5 border-border-quaternary dark:border-border-quaternary bg-layer-02 dark:bg-layer-02 hover:bg-fill-tertiary dark:hover:bg-fill-tertiary focus-visible:opacity-100 [@media(hover:hover)]:opacity-0 [@media(hover:hover)]:group-hover:opacity-100"><div class="relative text-[12px] leading-[normal] p-[1px] before:block before:h-3 before:w-3 h-3.5 w-3.5 text-text-primary dark:text-text-primary"><svg aria-hidden="true" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" height="1em" width="1em" class="svg-inline--fa fa-clone absolute h-[1em] -translate-x-1/2 -translate-y-1/2 align-[-0.125em] left-1/2 top-1/2"><path fill="currentColor" d="M64 464H288c8.8 0 16-7.2 16-16V384h48v64c0 35.3-28.7 64-64 64H64c-35.3 0-64-28.7-64-64V224c0-35.3 28.7-64 64-64h64v48H64c-8.8 0-16 7.2-16 16V448c0 8.8 7.2 16 16 16zM224 304H448c8.8 0 16-7.2 16-16V64c0-8.8-7.2-16-16-16H224c-8.8 0-16 7.2-16 16V288c0 8.8 7.2 16 16 16zm-64-16V64c0-35.3 28.7-64 64-64H448c35.3 0 64 28.7 64 64V288c0 35.3-28.7 64-64 64H224c-35.3 0-64-28.7-64-64z"></path></svg></div></button></span><strong>Output:</strong> [22,28,8,6,17,44]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= arr1.length, arr2.length &lt;= 1000</code></li>
	<li><code>0 &lt;= arr1[i], arr2[i] &lt;= 1000</code></li>
	<li>All the elements of <code>arr2</code> are <strong>distinct</strong>.</li>
	<li>Each&nbsp;<code>arr2[i]</code> is in <code>arr1</code>.</li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: Java in-place solution using counting sort
**Author**: [@motorix](https://leetcode.com/motorix/)
**Upvotes**: 262 👍
**Link**: [View Original Post](https://leetcode.com/problems/relative-sort-array/solutions/335056/)

---

1. Because ```0 <= arr1[i], arr2[i] <= 1000```, we use an array to count every element.
2. Go through every element in the second array, and update values of the first array based on the order in the second array.
```
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] cnt = new int[1001];
        for(int n : arr1) cnt[n]++;
        int i = 0;
        for(int n : arr2) {
            while(cnt[n]-- > 0) {
                arr1[i++] = n;
            }
        }
        for(int n = 0; n < cnt.length; n++) {
            while(cnt[n]-- > 0) {
                arr1[i++] = n;
            }
        }
        return arr1;
    }
}
```
Time: O(N)
Space: O(1)

--
**Follow-up: What if this constraint ```0 <= arr1[i], arr2[i] <= 1000``` doesn\'t exist?**
Use TreeMap.
```
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int n : arr1) map.put(n, map.getOrDefault(n, 0) + 1);
        int i = 0;
        for(int n : arr2) {
            for(int j = 0; j < map.get(n); j++) {
                arr1[i++] = n;
            }
            map.remove(n);
        }
        for(int n : map.keySet()){
            for(int j = 0; j < map.get(n); j++) {
                arr1[i++] = n;
            }
        }
        return arr1;
    }
}
```
Time: O(NlogN)
Space: O(N)

Or use HashMap + PriorityQueue

HashMap is to count those elements in arr2. PriorityQueue is for sorting those elements not in arr2.

```
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : arr1) {
            if (map.containsKey(n)) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            } else {
                pq.add(n);
            }
        }
        int i = 0;
        for (int j = 0; j < arr2.length; j++) {
            if (map.containsKey(arr2[j])) {
                for (int k = map.get(arr2[j]); k > 0; k--) {
                    arr1[i++] = arr2[j];
                }
            }
        }
        while(!pq.isEmpty()) {
            arr1[i++] = pq.poll();
        }
        return arr1;
    }
}
```
Time: O(NlogN)
Space: O(N)

</details>
