import matplotlib.pyplot as plt
data = [12,45,67,23,45,67,89,45,67,12]
plt.figure(figsize=(8,4))
plt.hist(data, bins=6)
plt.title("Histogram of Data")
plt.xlabel("Value")
plt.ylabel("Frequency")
plt.show()