import pandas as pd
df=pd.read_csv("dataset.csv")
print(df)

from sklearn.model_selection import train_test_split

x_train,x_test,y_train,y_test=train_test_split()