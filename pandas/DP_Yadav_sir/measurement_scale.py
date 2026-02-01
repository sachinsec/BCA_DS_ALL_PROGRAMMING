import pandas as pd
from sklearn.preprocessing import OneHotEncoder, OrdinalEncoder, StandardScaler, MinMaxScaler


def build_measurement_scale_df() -> pd.DataFrame:
    """Create and return a DataFrame demonstrating common measurement scales

    - Nominal: `Nominal_Color` (one-hot encoded)
    - Ordinal: `Ordinal_Rating` (ordinal encoded)
    - Interval: `Interval_Temp` (standard scaled)
    - Ratio: `Ratio_Income` (min-max scaled)
    """

    data = {
        'Nominal_Color': ['Red', 'Blue', 'Green'],  # Nominal (Categorical)
        'Ordinal_Rating': ['Low', 'Medium', 'High'],  # Ordinal (Ranked)
        'Interval_Temp': [22.5, 18.0, 25.4],  # Interval (Numerical, No True Zero)
        'Ratio_Income': [50000, 120000, 75000],  # Ratio (Numerical, True Zero)
    }

    df = pd.DataFrame(data)

    # 1) Nominal (One-Hot)
    # Handle sklearn API differences (`sparse` vs `sparse_output`) and feature-name methods.
    try:
        ohe = OneHotEncoder(sparse=False, dtype=float)
    except TypeError:
        ohe = OneHotEncoder(sparse_output=False, dtype=float)

    nominal_encoded = ohe.fit_transform(df[['Nominal_Color']])
    try:
        nominal_cols = ohe.get_feature_names_out(['Nominal_Color'])
    except AttributeError:
        nominal_cols = ohe.get_feature_names(['Nominal_Color'])
    df[nominal_cols] = nominal_encoded

    # 2) Ordinal
    rank_order = [['Low', 'Medium', 'High']]
    oe = OrdinalEncoder(categories=rank_order, dtype=float)
    df['Ordinal_Encoded'] = oe.fit_transform(df[['Ordinal_Rating']]).ravel()

    # 3) Interval (Standardization)
    ss = StandardScaler()
    df['Temp_Scaled'] = ss.fit_transform(df[['Interval_Temp']]).ravel()

    # 4) Ratio (Min-Max Scaling)
    mms = MinMaxScaler()
    df['Income_Scaled'] = mms.fit_transform(df[['Ratio_Income']]).ravel()

    return df


def main() -> None:
    df = build_measurement_scale_df()
    # display key transformed columns
    print(df[['Ordinal_Encoded', 'Temp_Scaled', 'Income_Scaled']])


if __name__ == '__main__':
    main()