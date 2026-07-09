list1=[]
print("numbers to arrange")
i=int(input())
print("numbers in list")
for n in range(i):
	numbers=int(input())
	list1.insert(n,numbers)
print("in ascending order")
list1.sort()
print(list1)
print("in descending order")
list1.reverse()
print(list1)