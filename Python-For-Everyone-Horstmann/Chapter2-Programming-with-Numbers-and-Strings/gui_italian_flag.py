# Draws an italian flag


# IMPORTS
from graphics import GraphicsWindow


win = GraphicsWindow(250, 250)
canvas = win.canvas()
canvas.setColor("green")
canvas.drawRect(100, 100, 30, 60)
canvas.setColor("red")
canvas.drawRect(160, 100, 30, 60)

canvas.setColor("black")
canvas.drawLine(130, 100, 160, 100)
canvas.drawLine(130, 160, 160, 160)
win.wait()
