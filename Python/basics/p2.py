#range():- used to generate numbers in given range.

#range(5) --> 0 1 2 3 4
#range(1,5) --> 1 2 3 4
#range(1,10,2) -->1 3 5 7 9

#Syntax:-

#range(beg, end, step)


#WAP to print series of even numberss from 1-100 
for i in range(1,101):
 if i%2==0:  
  print(i,end="   ")
