#"wap to create a list with five numbers. Now display numbers in ascending and descendding order."
list1=[] # empty list
print("enetr total numbers to arrange")
for i in range(6):
 	numbers=int(input())
 	list1.insert(i,numbers)
print(list1)
list1.sort()
print("numbers in ascending order")
print(list1)
list1.reverse()
print("numbers in descending order")
print(list1)