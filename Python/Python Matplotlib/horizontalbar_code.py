#Horizontal Bar Chart With Custom x-ticks and y-range

import matplotlib.pyplot as plt
categories = ['Pen', 'Book', 'Chalk', 'Duster', 'Eraser']
values = [20, 35, 30, 35, 27]
plt.barh(categories, values, color='skyblue')
plt.xlim(0, 100)
plt.xticks([0, 20, 40, 60, 80, 100])
plt.title('Horizontal Bar Chart')
plt.xlabel('Values')
plt.ylabel('Categories')
plt.show()