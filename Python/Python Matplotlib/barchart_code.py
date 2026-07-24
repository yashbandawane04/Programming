import matplotlib.pyplot as plt
categories = ["Pen","Pencil","Book"]
Sales = [50,30,80]
plt.figure(figsize=(6,4))
plt.bar(categories,Sales)
plt.title("Sales of Categories")
plt.xlabel("Categories")
plt.ylabel("Sales")
plt.show()