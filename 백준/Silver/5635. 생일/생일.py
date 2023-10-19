n = int(input())
dic = {}

for i in range(n):
    name,dd,mm,yy = map(str,input().split())
    if len(mm) == 1:
        mm = '0'+mm
    if len(dd) == 1:
        dd = '0'+dd
    yymmdd = yy+mm+dd
    dic[name] = int(yymmdd)
newdic = sorted(dic.items(), key = lambda x:x[1],reverse=True)
print(newdic[0][0])
print(newdic[len(newdic)-1][0])
    