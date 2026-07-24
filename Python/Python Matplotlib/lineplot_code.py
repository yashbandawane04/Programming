import matplotlib.pyplot as plt
Months = ["Jan","Feb","Mar","Apr"]
Sales  = [2000,4000,6000,8000]
plt.figure(figsize=(8,4))
plt.plot(Months, Sales, marker='o', linestyle='--', color='g', label='Sales')
plt.title("Monthly Sales")
plt.xlabel("Months")
plt.ylabel("Sales")
plt.legend()
plt.show()