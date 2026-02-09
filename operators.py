# Input two numbers
a = int(input("Enter first number: "))
b = int(input("Enter second number: "))

print("\n--- Arithmetic Operators ---")
print("Addition:", a + b)
print("Subtraction:", a - b)
print("Multiplication:", a * b)
print("Division:", a / b)
print("Modulus:", a % b)
print("Floor Division:", a // b)
print("Exponent:", a ** b)

print("\n--- Relational (Comparison) Operators ---")
print("a == b:", a == b)
print("a != b:", a != b)
print("a > b:", a > b)
print("a < b:", a < b)
print("a >= b:", a >= b)
print("a <= b:", a <= b)

print("\n--- Logical Operators ---")
print("(a > 0 and b > 0):", a > 0 and b > 0)
print("(a > 0 or b > 0):", a > 0 or b > 0)
print("not(a > 0):", not(a > 0))

print("\n--- Assignment Operators ---")
c = a
print("c =", c)

c += b
print("c += b:", c)

c -= b
print("c -= b:", c)

c *= b
print("c *= b:", c)

c //= b
print("c //= b:", c)

print("\n--- Bitwise Operators ---")
print("a & b:", a & b)
print("a | b:", a | b)
print("a ^ b:", a ^ b)
print("~a:", ~a)
print("a << 1:", a << 1)
print("a >> 1:", a >> 1)

print("\n--- Membership Operators ---")
lst = [a, b, 10, 20]
print("a in list:", a in lst)
print("5 not in list:", 5 not in lst)

print("\n--- Identity Operators ---")
x = a
y = a
print("x is y:", x is y)
print("x is not y:", x is not y)



