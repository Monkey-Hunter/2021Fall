import sys
import heapq

input = sys.stdin.readline

N = int(input())
# Heap
hq = []

for n in range(N):
    x = int(input())

    if x == 0:
        if hq:
            # �ڵ����� ������ ���� ���� ���� ���´�
            x, i = heapq.heappop(hq)
            # ������� -1�� ������ ��µȴ�
            print(str(x * i))
        else:
            # ����ִٸ� 0 ���
            print('0')

    else:
        # ���񰪰� ��ȣ�� ���� ����
        if x < 0:
            # ����
            heapq.heappush(hq, [-x, -1])
        else:
            # ���
            heapq.heappush(hq, [x, 1])
