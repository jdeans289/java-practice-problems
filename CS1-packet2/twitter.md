#Tweet  

| Program Name | Input File |
|--------------|------------|
| `tweet.java` | `tweet.in` |  

##Overview
A tweet can have at most 140 characters. I saw an article somewhere that said the average tweet was 67.9 characters and the median was 60. Write a program that determines if a short message can be a tweet!  
  
For this program, tweets will start with the `@` symbol and have 140 characters or less (counting spaces between words). There will be no space at the end of a line.  

##Input  
The first line consists of the number of data tweets in the file, `n`. Each tweet starts with the `@` symbol. There could be at most 3 lines per tweet. No line will end with a space.
  
##Output
Print either `tweet` or `not tweet` for each message.  
  
##Example Input File  
```
3
@coolstuff This tweet will have exactly 81 characters
so it is definitely a tweet!
@funnyman This message is really, really, really long so it will
not be a tweet. No one wants a long tweet cuz ain't nobody got time for
that!
@sweetbrown I am so awesome that Beyonce quotes me!
```  
  
##Example Output To Screen
```
tweet
not tweet
tweet
```
