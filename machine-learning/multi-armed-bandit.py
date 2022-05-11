import numpy as np
import pandas as pd

# Number of trainings
t = 0

# Number of bandits
k = 3

# Our action values
Q = [0 for _ in range(k)]

# This is to keep track of the number of times we take each action
N = [0 for _ in range(k)]

# Epsilon value for exploration
eps = 0.1

# True probability of winning for each bandit
p_bandits = [0.45, 0.40, 0.80]

# Q-Table
# Creating the first Dataframe using dictionary
df = pd.DataFrame({"action": [0],
                   "reward": [0]})

def pull(a):
    """Pull arm of bandit with index `i` and return 1 if win,
    else return 0."""
    if np.random.rand() < p_bandits[a]:
        return 1
    else:
        return 0


while t < 100 :
    if np.random.rand() > eps:
        # Take greedy action most of the time
        a = np.argmax(Q)
    else:
        # Take random action with probability eps
        a = np.random.randint(0, k)

    # Collect reward
    reward = pull(a)
    df = df.append({"action": [a],
                    "reward": [reward]}, ignore_index=True)
    # Incremental average
    N[a] += 1
    Q[a] += 1 / N[a] * (reward - Q[a])
    t += 1


print(df)

print("Actions:", N[0]+N[1]+N[2])
print("Action ", 0, (N[0]*100)/(N[0]+N[1]+N[2]))
print("Action ", 1, (N[1]*100)/(N[0]+N[1]+N[2]))
print("Action ", 2, (N[2]*100)/(N[0]+N[1]+N[2]))

print(Q[0])
print(Q[1])
print(Q[2])

