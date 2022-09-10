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
A. Sliding window🪟: 

| Problems                  | Packages  |
|---------------------------|:---:|
| 1. Contiguous Sub-array   | contiguousSubArray |
| 2. Maximum sum Sub-array  | maxSumSubarray |
| 3. Smallest sum Sub-array | smallestSubarray  |

---
## A. Sliding window 🪟:

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
### 2. Maximum sum Sub-array:

Problem Statement:
> Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.

Here are a few examples:

Example 1:
>Input: [2, 1, 5, 1, 3, 2], k=3
Output: 9
Explanation: Subarray with maximum sum is [5, 1, 3].

Example 2:
>Input: [2, 3, 4, 1, 5], k=2
Output: 7
Explanation: Subarray with maximum sum is [3, 4].

This problem can be solved using 2 methods.
* Brute-force method,
* window-sliding method.

I've solved it using both of the approaches.

#### a. Using brute-force method:
The time complexity of the above algorithm will be O(N∗K), 
where ‘N’ is the total number of elements in the given array.

We take each element in groups of 'K' and calculate the sum.
We then store the max value that is found with the max size being 'K'.

#### b. Using sliding-window method:
If you observe closely, you will realize that to calculate the sum of a contiguous 
sub-array we can utilize the sum of the previous sub-array. 
For this, consider each sub-array as a Sliding Window of size ‘k’. 
To calculate the sum of the next sub-array, 
we need to slide the window ahead by one element.

The time complexity is reduced to O(N).

###### Note: Please check the package for the code.

---
### 3. Smallest Sum Sub-array:

Problem Statement:
>Given an array of positive numbers and a positive number ‘S’,
> find the length of the smallest contiguous sub-array 
> whose sum is greater than or equal to ‘S’.
> Return 0, if no such sub-array exists.

Note that I have not taken care of the "Return 0, if no such subarray exists."
because it's easy and I assume everyone is able to do it at this point.

This problem statement is fairly simply and can be easily tackled.
There are once again, you guessed it, 2 ways to sole this problem.
* Brute-force method,
* sliding-window method.

Since I'm sure you will be comfortable with brute force at this point,
I'll discontinue writing explanations for brute-force methods as they
are pretty straight forward. I will explain special cases or if they are
tough.

#### b. Sliding-window method:
It's the same as the one before but this time it's just a tad bit 
different.

Since we are not given a size for the window, the size will keep changing.
We start off with a windowEnd = 0 and then keep increasing the window size 
by adding elements one by one.

When the sum gets greater than 'S', we start reducing the window size
by removing the leftmost element by using this code:

``` java
while (sum >= s){
   if(windowLength < result) result = windowLength;
                windowSum -= array[windowStart];
                windowLength--;
                windowStart++;
}
```

###### Note: Please check the package for the code.

---



