n = int(input())

for i in range(n):
    p = int(input())
    dic = {}
    for j in range(p):
        cost, name = input().split()
        cost = int(cost)
        dic[name] = cost
    newdic = sorted(dic.items(), key = lambda x:x[1],reverse=True)
    print(newdic[0][0])