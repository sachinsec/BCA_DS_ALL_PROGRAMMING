import pandas as pd
import numpy as np

#ser =pd.Series(np.random.rand(100,10))  # only series data 
df =pd.DataFrame(np.random.rand(100,10)) # use for Frame data rows and columns
print(df.head())  # for STarting number
df.to_csv('first.csv')
#ser.tail(10)  # for last numbers
#ser.info()    # get information