{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": []
    },
    "kernelspec": {
      "name": "python3",
      "display_name": "Python 3"
    },
    "language_info": {
      "name": "python"
    }
  },
  "cells": [
    {
      "cell_type": "code",
      "execution_count": null,
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "18eQT1391Ufi",
        "outputId": "5124e2dd-abe8-430f-b673-eb92699068a9"
      },
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "   Ordinal_Encoded  Temp_Scaled  Income_Scaled\n",
            "0              0.0     0.175180       0.000000\n",
            "1              1.0    -1.302902       1.000000\n",
            "2              2.0     1.127722       0.357143\n"
          ]
        }
      ],
      "source": [
        "import pandas as pd\n",
        "from sklearn.preprocessing import OneHotEncoder, OrdinalEncoder, StandardScaler, MinMaxScaler\n",
        "\n",
        "# 1. Create a dataset representing various measurement scales\n",
        "data = {\n",
        "    'Nominal_Color': ['Red', 'Blue', 'Green'], # Nominal (Categorical)\n",
        "    'Ordinal_Rating': ['Low', 'Medium','High'], # Ordinal (Ranked)\n",
        "    'Interval_Temp': [22.5, 18.0, 25.4],      # Interval (Numerical, No True Zero)\n",
        "    'Ratio_Income': [50000, 120000, 75000]   # Ratio (Numerical, True Zero)\n",
        "}\n",
        "df = pd.DataFrame(data)\n",
        "\n",
        "# 2. Process Nominal Data (One-Hot Encoding)\n",
        "# Ensures no false numerical hierarchy is assigned to colors.\n",
        "ohe = OneHotEncoder(sparse_output=False)\n",
        "nominal_encoded = ohe.fit_transform(df[['Nominal_Color']])\n",
        "\n",
        "# 3. Process Ordinal Data (Ordinal Encoding)\n",
        "# Preserves the rank: Low (0) < Medium (1) < High (2)\n",
        "rank_order = [['Low', 'Medium', 'High']]\n",
        "oe = OrdinalEncoder(categories=rank_order)\n",
        "df['Ordinal_Encoded'] = oe.fit_transform(df[['Ordinal_Rating']])\n",
        "\n",
        "# 4. Process Interval Data (Standardization)\n",
        "# Good for models sensitive to variance (e.g., SVM, KNN).\n",
        "ss = StandardScaler()\n",
        "df['Temp_Scaled'] = ss.fit_transform(df[['Interval_Temp']])\n",
        "\n",
        "# 5. Process Ratio Data (Min-Max Scaling)\n",
        "# Compresses income into a 0-1 range while maintaining ratio properties.\n",
        "mms = MinMaxScaler()\n",
        "df['Income_Scaled'] = mms.fit_transform(df[['Ratio_Income']])\n",
        "\n",
        "print(df[['Ordinal_Encoded', 'Temp_Scaled', 'Income_Scaled']])\n"
      ]
    }
  ]
}