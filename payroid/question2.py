import matplotlib.pyplot as plt
import numpy as nm
x = [0,5,10,15,20,25,30]
y1 =[10,15,20,20,30,15,0]
y2 =[10,12,15,12,20,10,0]

plt.plot(x,y1,linestyle = 'dashed',label='Velocity 1',marker='*')
plt.plot(x,y2,linestyle = 'dashed',label='Velocity 2',marker='o')
plt.xlabel('Velocity m/s')
plt.ylabel('Bodies')
plt.title('Line Graph')
plt.legend()
plt.show()