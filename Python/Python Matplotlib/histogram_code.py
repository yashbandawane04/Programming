import matplotlib.pyplot as plt
data = [12, 45, 67, 23, 45, 67, 89, 45, 67, 12]
plt.figure(figsize=(8, 4))
plt.hist(data, bins=8, edgecolor='black', color='skyblue', rwidth=0.85)
plt.title("Histogram of Data Distribution")
plt.xlabel("Value Ranges")
plt.ylabel("Frequency (Count)")
plt.show()