#simple Random Sampling
from sklearn.model_selection import train_test_split
import numpy as np

# Dummy dataset
X = np.random.rand(1000, 20)   # 1000 samples, 20 features
y = np.random.randint(0, 2, 1000)

# Random 80–20 split
X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.2, random_state=42
)

print(len(X_train), len(X_test))

#systematic Sampling
import numpy as np

data = np.arange(3000)  # Simulated video frames
k = 10                  # Select every 10th frame

systematic_sample = data[::k]

print("Selected frames:", len(systematic_sample))


#cluster sampling
import numpy as np
import random

# 100 clusters (cities), 1000 samples each
clusters = {f"City_{i}": np.random.rand(1000, 5) for i in range(100)}

# Randomly select 10 clusters
selected_clusters = random.sample(list(clusters.keys()), 10)

cluster_sample = np.vstack([clusters[c] for c in selected_clusters])

print("Total samples after cluster sampling:", cluster_sample.shape[0])


#Multistage Sampling
import numpy as np
import random

# Stage 1: Regions
regions = list(range(50))
selected_regions = random.sample(regions, 10)

# Stage 2: Tiles per region
tiles_per_region = 20
selected_tiles = [
    (r, t) for r in selected_regions
    for t in random.sample(range(tiles_per_region), 5)
]

# Stage 3: Pixels per tile
pixels_per_tile = 1000
samples = len(selected_tiles) * pixels_per_tile

print("Total sampled pixels:", samples)


from sklearn.model_selection import StratifiedKFold
import numpy as np

X = np.random.rand(1000, 20)
y = np.array([0]*700 + [1]*300)

skf = StratifiedKFold(n_splits=5, shuffle=True, random_state=42)

for fold, (train_idx, test_idx) in enumerate(skf.split(X, y), 1):
    print(f"Fold {fold}:",
          np.bincount(y[train_idx]),
          np.bincount(y[test_idx]))

