#import matplotlib.pyplot as plt
#Tv = [230.1, 44.5,17.2,151.5,180.8,8.7,57.5]
#Radio = [ 37.8,39.3,45.9,41.3,10.8,48.9,32.8]
#News =[69.2,45.1,69.3,58.5,58.4,75.0,23.5]
#Sales = [ 22.1,10.4,12.0,16.5,17.9,7.2,11.8]
#
#col=[ 'red','blue','yellow','pink','black','green','purple']
#
#plt.pie(Tv,labels=Sales,autopct='%1.1f%%')
##plt.pie(News,labels=Sales,autopct='%1.1f%%')
#
##plt.pie(Radio,labels=Sales,autopct='%1.1f%%')
#
#plt.title("Tv, Radio and News vs Sales", color ='red',fontweight = 'bold')
#plt.show()

import matplotlib.pyplot as plt

import numpy as np
x = np.arange(7)

Tv = [230.1, 44.5,17.2,151.5,180.8,8.7,57.5]
Radio = [ 37.8,39.3,45.9,41.3,10.8,48.9,32.8]
News =[69.2,45.1,69.3,58.5,58.4,75.0,23.5]
Sales = [ 22.1,10.4,12.0,16.5,17.9,7.2,11.8]

col=[ 'red','blue','yellow','pink','black','green','purple']

plt.bar(x+0.5,Sales,width=0.25, label = 'Sales')
plt.bar(x+0.75,Tv, width=0.25,label='TV')
plt.bar(x+1,News,width=0.25,label='News')
plt.bar(x+1.25,Radio,width=0.25,label = 'Radio')


plt.title("Tv, Radio and News vs Sales", color ='red',fontweight = 'bold')
plt.legend()
plt.show()