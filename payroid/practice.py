import matplotlib.pyplot as plt
import numpy as nm
years = [2018, 2019, 2020, 2021]
sales_A = [120, 135, 150, 160]
sales_B = [100, 110, 140, 155]
#exp=[0,0,0,0.1]
x=nm.arange(4)
#width = 0.25

#col= ["#F90B3B","#FFEA03","#E9F90B","#F98A0B"]
#plt.bar(x+0.0,years,width=0.25,color='red')
plt.bar(x+0.0,sales_A,width=0.25,color='blue',label='sales_A')
plt.bar(x+0.25,sales_B,width=0.25,color='green',label='sales_B')
plt.xticks(x+0.125,years)
plt.title("Sales_A && Sales_B",color='red',font='bold',fontsize=16)
plt.xlabel("Years",color='red',font='bold',fontsize=16)
plt.ylabel("Company sales",color='red',font='bold',fontsize=16)
plt.legend()
plt.show()