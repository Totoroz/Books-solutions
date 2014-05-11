# Write a text


# IMPORTS
from graphics import GraphicsWindow


win = GraphicsWindow(500, 500)
canvas = win.canvas()
canvas.drawText(250, 250, "Text")
win.wait()
