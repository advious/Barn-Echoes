# Barn-Echoes

An introductory USACO Bronze-level problem about a barn of cows that like hearing their moos.

## Description:

The cows enjoy mooing at the barn because their moos echo back, although sometimes not completely. Bessie, ever the excellent secretary, has been recording the exact wording of the moo as it goes out and returns. She is curious as to just how much overlap there is.

Given two lines of input (letters from the set a..z, total length in the range of 1..80), each of which has the wording of a moo on it, determine the greatest number of characters of overlap between one string and the other. A string is an overlap between two other strings if it is a prefix of one string and a suffix of the other string.

### Example:

Consider two moos:

```
moyooyoxyzooo
yzoooqyasdfljkamo
```

The last part of the first string overlaps 'yzooo' with the first part of the second string. The last part of the second string overlaps 'mo' with the first part of the first string. The largest overlap is 'yzooo' whose length is 5.

### Input Format:

* Lines 1...2: Each line has the text of a moo or its echo.

### Sample Input:

```
abcxxxxabcxabcd
abcdxabcxxxxabcx
```

### Output Format:

* Line 1: A single line with a single integer that is the length of the longest overlap between the front of one string and the end of the other.

### Sample Output:

```
11
```

### Output Details:

'abcxxxxabcx' is a prefix of the first string and a suffix of the second string.
