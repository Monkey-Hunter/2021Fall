import sys
from heapq import heappop, heappush

input = sys.stdin.readline

N = int(input())

leftpq = []
leftnum = 0
rightpq = []
rightnum = 0

# ù �� ó��
m = int(input())
print(m)
heappush(leftpq, -m)
leftnum += 1

for i in range(1, N):
    X = int(input())
    
    # �߰������� ũ�� rightpq�� ����
    if X >= m:
        heappush(rightpq, X)
        rightnum += 1
    # ������ leftp1
    else:
        heappush(leftpq, -X)
        leftnum += 1

    # ���� ���� ���̰� 2 �̻��̶�� �Ű���
    # leftpq -> rightpq
    if leftnum - rightnum == 2:
        heappush(rightpq, -(heappop(leftpq)))
        leftnum -= 1
        rightnum += 1

    # leftpq <- rightpq
    elif rightnum - leftnum == 2:
        heappush(leftpq, -(heappop(rightpq)))
        leftnum += 1
        rightnum -= 1

    # ¦������ ������ leftpq ��Ʈ�� �߰���
    if (leftnum + rightnum) % 2 == 0:
        m = -(leftpq[0])
    
    # Ȧ������
    else:
        # leftpq�� �� ���ٸ� leftpq ��Ʈ�� �߰���
        # [-99, 1, 2] [5, 10]
        if leftnum > rightnum:
            m = -(leftpq[0])

        # rightpq�� �� ���ٸ� rightpq ��Ʈ�� �߰���
        # [-99, 1, 2] [5, 10, 11, 17]
        else:
            m = rightpq[0]

    #print("-"*10)
    #print(leftpq, ",", m, ",", rightpq)
    print(m)
