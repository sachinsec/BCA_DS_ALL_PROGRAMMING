import matplotlib.pyplot as plt
import numpy as np

# Data
Tv = [230.1, 44.5, 17.2, 151.5, 180.8, 8.7, 57.5]
Radio = [37.8, 39.3, 45.9, 41.3, 10.8, 48.9, 32.8]
News = [69.2, 45.1, 69.3, 58.5, 58.4, 75.0, 23.5]
Sales = [22.1, 10.4, 12.0, 16.5, 17.9, 7.2, 11.8]

# X positions for each group
x = np.arange(7)  # 0,1,2,3,...

# Plot grouped bars
plt.bar(x - 0.25, Tv, color="blue", width=0.25, label='TV')
plt.bar(x, News, color="green", width=0.25, label='News')
plt.bar(x + 0.25, Radio, color="red", width=0.25, label='Radio')

# Labels

plt.xlabel("Items")
plt.ylabel("Value")
plt.title("TV, Radio and News vs Sales", color='red', fontweight='bold')
plt.legend()
plt.show()
