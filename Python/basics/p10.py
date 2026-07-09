print("enter the operation:")
print("1. ADD")
print("2. SUBTRACT")
print("3. MULTIPLY")
print("4. DIVISION")
print("5. POWER")
operation = int(input())
if operation==1:
	num1=int(input("enter the first number: "))
	num2=int(input("enter the second number: "))
	print("the sum of numbers is=",num1 + num2)
elif	operation==2:
	num1=int(input("enter the first number: "))
	num2=int(input("enter the second number: "))
	print("the subtraction of numbers is=",num1 - num2)
elif	operation==3:
	num1=int(input("enter the first number: "))
	num2=int(input("enter the second number: "))
	print("the multiplication of numbers is=",num1 * num2)
elif	operation==4:
	num1=int(input("enter the first number: "))
	num2=int(input("enter the second number: "))
	print("the division of numbers is=",num1 / num2)
elif	operation==5:
	num1=int(input("enter the number: "))
	num2=int(input("enter the power: "))
	for i in range(num2):
		print("the answer is=",num1*num1)
else:
	print("invalid operation")