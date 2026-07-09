#wap to craete a list by taking input from user
list1=[] # Empty List
print("enter five names")
for i in range(5): 
 name=input()
 list1.insert(i, name)
print(list1)