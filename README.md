# Algorithms using *Java* ☕ 
### Welcome to my Algorithms repo!🎍
<img src = "https://i.pinimg.com/originals/cb/67/e9/cb67e94f7dc44ac7ea0c333a8e44fc1f.gif" width = "200" height = "100" />

#### 𝓘𝓷𝓽𝓻𝓸𝓭𝓾𝓬𝓽𝓲𝓸𝓷:📔
I found a new intrest in learning algorithms and wanted to practice them and thought why not share them too! 🌘
Feel free to clone or reach out to me if you have any questions!✍🏼

#### Detailed list of Algorithms:📚
1. Sorting Algorithms:
    * Merge Sort
    * Quick Sort
2. Searching Algorithms:
3. Pattern Algorithms:
    * Sliding window
    * Two pointers

---

#### Here is a list of Algorithms and the package names that are there in this repo📓:
1. Sliding window🪟: 

| Problems  | Packages  |
|---|:---:|
|1. Contiguous Subarray | contiguousSubArray |
|2. Maximum sum Subarray | maxSumSubarray |
|3. Smallest sum Subarray   | smallestSubarray  |

---
### 1. Contiguous Subarray:
In many problems dealing with an array (or a LinkedList), we are asked to find or calculate something among all the contiguous subarrays (or sublists) of a given size. For example, take a look at this problem:

> Given an array, find the average of all contiguous subarrays of size ‘K’ in it.
Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5;

We are asked to find the average of all the elements in groups of 'K'.
the output for the above example would be:

> Output: [2.2, 2.8, 2.4, 3.6, 2.8]

##### There are two ways to solve this problem:
* Using brute-force method,
* Using sliding window method.

##### a. Using brute-force method:
This is the method where we calculate the average for each and every element one by one, therefore making the time complexity O(N*K) where N is the number of elements in the given array.
###### Note: Check the package for the code. 

##### b. Using sliding-window method:
The efficient way to solve this problem would be to visualize each contiguous subarray as a sliding window of ‘5’ elements. This means that when we move on to the next subarray, we will slide the window by one element. So, to reuse the sum from the previous subarray, we will subtract the element going out of the window and add the element now being included in the sliding window. This will save us from going through the whole subarray to find the sum and, as a result, the algorithm complexity will reduce to O(N).

Here's a visual representation:

<img src = "https://miro.medium.com/max/567/1*0BP5ffOsjx4CnzAy-q788A.png"/>

###### Note: Check the package for the code.
---



