# Creates a V sign


# IMPORTS
from graphics import GraphicsWindow


win = GraphicsWindow(500, 500)
canvas = win.canvas()
canvas.drawLine(0, 0, 10, 30)
canvas.drawLine(10, 30, 20, 0)
win.wait()
