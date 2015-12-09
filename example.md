#What's The Frequency, Kenneth?  

| Program Name | Input File |
|--------------|------------|
| `count.java` | `count.in` |  

##Overview
A good approach to cracking replacement ciphers is frequency analysis. Is uses known frequencies of letters in normal text to help decrypt encoded messages. However, before this approach can be employed, the cryptologist has to have a very good idea what the expected frequencies of letters are in the normal text.  
  
Write a program that will output the frequencies of letters occurring in the input text.

##Input  
The first line of input will contain a single integer, ***n***, indicating the number of lines in the text to be examined. The following ***n*** lines are to be examined by the program to determine the frequencies of the letters used.  
  
##Output
There will be 26 lines of output, one for each alphabetic character, beginning with 'a' and ending with 'z'. Each line will contain the letter followed by the number of times it occured in the input text. Ignore the case of the characters in the imput. For example, both `'E'` and `'e'` will count toward the frequency of `'e'`.  
  
##Example Input File  
```
3  
The quick brown fox jumps over the lazy dog.  
Hello  
Goodbye
```
##Example Output To Screen
```
a 1  
b 2  
c 1  
d 2  
e 5  
f 1  
g 2  
h 3  
i 1  
j 1  
k 1  
l 3  
m 1  
n 1  
o 7  
p 1  
q 1  
r 2  
s 1  
t 2  
u 2  
v 1  
w 1  
x 1  
y 2  
z 1  
```
