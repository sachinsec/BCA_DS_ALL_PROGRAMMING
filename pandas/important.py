import pandas as pd
df = pd.read_csv('marksheet.csv')
#print(df['Obtain'])
#print(df.dropna()) # drop all nan raws
#print(df.fillna(0)) # to fill na data
#print(df.rename(columns={"Percantage":"Per"})) # rename 
#print(len(df)) #check for lines

print(df.rename(columns={"English":"Eng"}))
df['Obtain'] = df['Obtain'].astype(float)  # for change data type 
print(df.info())

#def fx(a):
#    return a*a
#df["zeros + 1"] = df["Per"].apply(fx)  
#print(df["zeros + 1"]) 