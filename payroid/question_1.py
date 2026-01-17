import matplotlib.pyplot as plt
import numpy as np
batters = ['A','B','C','D']
Score1 = [5,25,45,20]
Score2 =[ 4,23,49,17]
Score3 = [6,22,47,19]

x = np.arange(4)
#y = np.arange(len(batters))
#plt.bar(x+0.0,batters,width=0.25)
plt.bar(x+0.25,Score1,width=0.25)
plt.bar(x+0.50,Score2,width=0.25)
plt.bar(x+0.75,Score3,width=0.25)
plt.xlabel('Batter')
plt.ylabel('Score')
plt.xticks(x,['A','B','C','D'])
plt.legend()
plt.show()
