a,b,c = input().split() 
d = int(input())

carry = int((int(c)+d)/60)
sec = int((int(c)+d)%60)
min = int(b)
hour = int(a)

if carry > 0 :
    temp = min+carry
    carry = int((temp)/60)
    min = int((temp)%60)
if carry > 0 :
    hour = int((hour+carry)%24)

print(hour,end=" ")
print(min,end=" ")
print(sec)