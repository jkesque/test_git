import numpy as np

def backSub(A,b):
    n = np.shape(A)
    n = len(A)
    x = b
    for i in range(n-1, 0, -1):
        x[i] = x[i]/A[i][i]
        for j in range(i):
            x[j] = x[j] - A[j][i] * x[i]
    x[0]=x[0]/A[0][0]
    return x
