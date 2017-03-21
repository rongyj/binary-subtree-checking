This repo includes two coding problems source code
# Problem 1
binary-subtree-checking
Given two binary trees, check if the first tree is a subtree of the second one. A subtree of a tree T is a tree S consisting of a node in T and all of its descendants in T.

For example, in the following case, Tree1 is a subtree of Tree2.
```
        Tree1
          x 
        /    \
      a       b
       \
        c

        Tree2
              z
            /   \
          x      e
        /    \     \
      a       b      k
       \
        c
```        
# Problem 2:
Given a positive number n, count the total number of set bits in the binary representation of all numbers from 1 to n.

Examples:
```
Input: n = 6
Output: 9
```
# Usage:
I included the source code for each problem with different package name.
```
    Problem 1 has package name:com.rong.interviews.binarysubtree.
    The problem 2 has the package name:com.rong.interviews.bitscount.
```
There are two junit test cases created to test the sample inputs as above:
```
    com.rong.interviews.binarysubtree.BinarySubtreeCheckerTest for Problem 1.
    com.rong.interviews.bitscount.SetBitsCounterTest for Problem 2.
```
