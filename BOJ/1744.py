Case = int(input())

seq = []
for _ in range(Case):
    seq.append(int(input()))

minus_seq = []
plus_seq = []
one = []
zero = [3]

for i in seq:
    if i < 0:
        minus_seq.append(i)
    elif i > 1:
        plus_seq.append(i)
    elif i == 1:
        one.append(i)
    elif i == 0:
        zero[0] = 0

minus_seq.sort()
plus_seq.sort(reverse=True)

result = 0

minus_times = len(minus_seq)//2
plus_times = len(plus_seq)//2


if 0 < minus_times:
    for i in range(0, minus_times*2, 2):
        result += minus_seq[i]*minus_seq[i+1]

if len(minus_seq) % 2 != 0:
    if zero[0] != 0:
        result += minus_seq[-1]

if 0 < plus_times:
    for i in range(0, plus_times*2, 2):
        result += plus_seq[i]*plus_seq[i+1]
if len(plus_seq) % 2 != 0:
    result += plus_seq[-1]

for i in one:
    result += i

print(result)

