#Python program to check whether entered number is Palindrome or not like 121,111,505,45654

#To take input as integer form
number = int(input("Enter a number: ")) 

temp = number
rev = 0

#To separate the digits of number
while(number>0):
    dig = number%10
    rev = rev*10+dig
    number = number//10

#To check whether the reverse number and original number is equal or not
if(temp == rev):
    print("Entered number is a Palindrome")
else:
    print("Entered number isn't a palindrome!")