import sys
input = sys.stdin.readline

Test = int(input())

for _ in range(Test):
    app = int(input())
    applicant = []
    count = 1
    success = []


    for i in range(app):
        a, b = map(int, input().split())
        applicant.append((a, b))


    applicant.sort()


    success.append(applicant[0])
    A_max = success[0][0]
    B_max = success[0][1]
    A_min = success[0][0]
    B_min = success[0][1]

    for apply in applicant[1:]:
        if apply[0]>= A_max and apply[1] <= B_min:
            A_max = apply[0]
            B_min = apply[1]
            count += 1
        elif apply[0]<= A_min and apply[1] >= B_max:
            B_max = apply[1]
            A_min = apply[0]
            count += 1
    print(count)



