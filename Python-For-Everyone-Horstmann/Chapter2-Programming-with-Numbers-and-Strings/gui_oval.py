# Creates a GUI oval


# IMPORTS
from graphics import GraphicsWindow


win = GraphicsWindow(400, 400)
canvas = win.canvas()
canvas.setColor("red")
canvas.drawOval(110, 100, 180, 180)
win.wait()
