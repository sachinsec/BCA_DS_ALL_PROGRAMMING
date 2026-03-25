import pandas as pd
from sklearn.preprocessing import OneHotEncoder, OrdinalEncoder, StandardScaler, MinMaxScaler

# Create dataset
df = pd.DataFrame({
    'Color': ['Red', 'Blue', 'Green'],
    'Rating': ['Low', 'Medium', 'High'],
    'Temp': [22.5, 18.0, 25.4],
    'Income': [50000, 120000, 75000]
})

# 1. Nominal → One-Hot Encoding
ohe = OneHotEncoder(sparse_output=False)
color_encoded = ohe.fit_transform(df[['Color']])
df[ohe.get_feature_names_out()] = color_encoded

# 2. Ordinal Encoding
oe = OrdinalEncoder(categories=[['Low', 'Medium', 'High']])
df['Rating_Encoded'] = oe.fit_transform(df[['Rating']])

# 3. Standard Scaling (Interval)
scaler = StandardScaler()
df['Temp_Scaled'] = scaler.fit_transform(df[['Temp']])

# 4. MinMax Scaling (Ratio)
mm = MinMaxScaler()
df['Income_Scaled'] = mm.fit_transform(df[['Income']])

print(df)