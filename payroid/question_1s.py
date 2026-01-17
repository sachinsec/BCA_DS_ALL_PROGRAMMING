import matplotlib.pyplot as plt
import numpy as nm

Score=[[5,25,45,29],[4,23,49,17],[6,22,47,19]]
Batter=['A','B','C','D']
Match = ['M1','M2','M3']

x = nm.arange(len(Batter))
width= 0.25

plt.figure(figsize=(10,6))
for i, Match_Score in enumerate(Score):
    plt.bar(x+i*width , Match_Score,width,label =Match[i])
plt.xlabel('Batter')
plt.ylabel('Scores')
plt.xticks(x+width,Batter)
plt.legend()
plt.show()