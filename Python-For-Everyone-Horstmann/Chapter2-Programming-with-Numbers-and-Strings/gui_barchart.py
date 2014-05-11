# A gui bar chart using multiple liens


# IMPORTS
from graphics import GraphicsWindow


win = GraphicsWindow()
canvas = win.canvas()
canvas.setColor("red")
canvas.drawRect(0, 10, 200, 20)
canvas.setColor("green")
canvas.drawRect(0, 40, 300, 20)
canvas.setColor("blue")
canvas.drawRect(0, 70, 100, 20)
win.wait()
