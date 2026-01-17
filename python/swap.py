
a = int(input("Enter value of a: "))
b = int(input("Enter value of b: "))

# using third variable
c = a
a = b
b = c

print("After swapping:")
print("The value of a is:", a)
print("The value of b is:", b)