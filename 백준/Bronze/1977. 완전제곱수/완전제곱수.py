M = int(input())
N = int(input())
i = 1

while True:
    if M <= i*i:
        if i*i <= N:
            break
        elif N < i*i:
            print(-1)
            exit(0)
    else: i += 1

min = i*i
sum = 0

while i*i <= N:
    sum += i*i
    i += 1

print(sum)
print(min)
