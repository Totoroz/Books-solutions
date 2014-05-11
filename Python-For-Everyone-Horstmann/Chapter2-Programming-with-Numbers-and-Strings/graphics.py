# graphics.py
#
# Defines the GraphicsWindow and Canvas classes for creating simple drawings
# in Python.

import tkinter as tk

class GraphicsWindow :
  """Defines a simple top-level framed window that contains a canvas on 
     which graphical objects can be drawn. """
    
  def __init__(self, width = 400, height = 400, title = ""):
    "Creates a new graphics window containing an empty drawing canvas."
    
     # Is the window currently open? You can only update an open window.
    self._isValid = True
    
     # Create a top-level window for the graphics window.
    self._tkwin = tk.Toplevel( _rootWin )
    self._tkwin.protocol("WM_DELETE_WINDOW", self.close)
    self._tkwin.title(title)
      
     # Create a canvas inside the top-level window which is used for 
     # drawing the graphical objects and text.
    self._canvas = GraphicsCanvas( self, width, height ) 
    
     # Bring the graphics window to the front of all other windows and
     # force an update.
    self._tkwin.lift()
    self._tkwin.resizable(0, 0)    
    self._tkwin.update()
        
 
  def close( self ):
    """Closes and destroys the graphics window."""
    
     # Set the closed flag to true so no other ops can be performed on
     # the window object.
    if not self._isValid : return
    self._isValid = False
    
     # Destroy the window and force an update so it will close when  
     # used in IDLE or Wing IDE.
    self._tkwin.destroy()
    self._tkwin.update_idletasks()
    
     # Terminate the mainloop so the program will exit.
    self._tkwin.quit()
   
  def wait( self ):
    """Stops and waits for the user to click the 'close' button on the 
     window frame."""
     
    if not self._isValid : raise GraphicsWinError()
    self._tkwin.mainloop()
 
  def canvas( self ):
    """Returns a reference to the canvas contained within the window."""
    if not self._isValid : raise GraphicsWinError()
    return self._canvas

  def setTitle( self, title ):
    """Sets the title of the window."""
    self._tkwin.title( title )
    
  def valid( self ):
    """Returns a boolean indicating whether the window exists or was 
     previously closed. Most operations can not be performed on a closed
     window."""     
    return self._isValid
    
  def hide( self ):
    """Hides the graphics window."""
    
    if not self._isValid : raise GraphicsWinError()
    self._tkwin.withdraw()
    self._tkwin.update_idletasks()
      
  def show( self ):
    """Shows a previously hidden window."""
    
    if not self._isValid : raise GraphicsWinError()
    self._tkwin.deiconify()
    self._tkwin.update_idletasks()
     
   # This is only used for testing. Remove from the final version.
#  def sysid( self ):
#    return self._tkwin.frame()
     
 #--- Call back routines that can be overloaded in a child class.
 
  def onMouseClick( self, x, y ):
    pass
 
  def onMouseMove( self, x, y ):
    pass
  
  
#--- The graphics canvas.

class GraphicsCanvas :
  """Defines a canvas on which graphical objects and text can be drawn. 
     The canvas uses discrete Cartesian coordinates >= 0 with (0,0) being 
     in the upper-left corner of the window."""   
   
  def __init__(self, win, width, height) :
     
    # The GraphicsWindow that contains the canvas.
   self._win = win
   
    # Keep track of the size of the canvas.
   self._width = width
   self._height = height
       
    # Maintain the options used for drawing objects and text.
   self._polyOpts = {"outline" : "black", "width" : 1, "dash" : None, "fill" : ""}    
   self._fontOpts = { "text" : "", "justify" : tk.LEFT, "anchor" : tk.NW,
                       "fill" : "black",
                       "font" : ("helvetica", 10, "normal") }

    # Create the tk canvas inside the given window.
   self._tkcanvas = tk.Canvas(self._win._tkwin, 
                              width = width, height = height, bg = "white" )
   self._tkcanvas.pack()
   self._tkcanvas.update_idletasks()   


  def setHeight( self, size ):
    """Changes the height of the canvas."""
    
    self._checkValid()
    if type(size) != int or size <= 0 :
      raise GraphicsParamError( "The window height must be >= 1." )
    self._tkcanvas.config( height=size )
    self._height = size
    self._tkcanvas.update_idletasks()

  def setWidth( self, size ):
    """Changes the width of the window and drawing canvas."""
    
    self._checkValid()
    if type(size) != int or size <= 0 :
      raise GraphicsParamError( "The window width must be >= 1." )
    self._tkcanvas.config( width=size )
    self._width = size
    self._tkcanvas.update_idletasks()
    
  def height( self ):
    """Returns the current height of the window."""
    return self._height
  
  def width( self ):
    """Returns the current width of the window."""    
    return self._width
     
  def clear( self ):
    """Clears the canvas by removing all objects previously drawn on it."""
     
    self._checkValid()
    self._tkcanvas.delete(tk.ALL) 
    self._tkcanvas.update_idletasks()
   
  def setBackground( self, red, green = None, blue = None ) :
    """Sets the current background color."""
    
    if type(red) == int :
      color = "#%02X%02X%02X" % (red, green, blue) 
    elif type(red) != str :
      raise GraphicsParamError( "Invalid color." )
    else :
      color = red
    self._checkValid()
    self._tkcanvas.config( bg = color )
    self._tkcanvas.update_idletasks()

    
  def setFill( self, red = None, green = None, blue = None) :
    """Sets the fill color used when creating new polygon type objects.
     If color is the empty string, the object is not filled."""
     
    if red is None :
      color = ""
    elif type(red) == int :
      color = "#%02X%02X%02X" % (red, green, blue)       
    elif type(red) != str :
      raise GraphicsParamError( "Invalid color." )
    else :
      color = red
    self._polyOpts["fill"] = color
        
  def setOutline( self, red = None, green = None, blue = None) :
    """Sets the color used to draw the outline or frame around newly 
     created polygons, lines, pixels, and text. If color is the empty
     string, then no frame is drawn."""
     
    if red is None :
      color = ""
    elif type(red) == int :
      color = "#%02X%02X%02X" % (red, green, blue)  
    elif type(red) != str :
      raise GraphicsParamError( "Invalid color." )
    else :
      color = red
    self._polyOpts["outline"] = color
    self._fontOpts["fill"] = color
     
  def setColor( self, red, green = None, blue = None ) :
    """Sets the color used for drawing newly created objects to have the
     same color for filling and outlining. If the first argument is a
     color name, then the other two must be omitted. """

    if type(red)  == int :
       color = "#%02X%02X%02X" % (red, green, blue)
    elif type(red) != str :
       raise GraphicsParamError( "Invalid color." )
    else :
       color = red
    self._polyOpts["outline"] = color
    self._polyOpts["fill"] = color
    self._fontOpts["fill"] = color     
    
  def setLineWidth( self, size ):
    """Sets the width of new lines."""
    
    if type(size) != int or size <= 0 :
      raise GraphicsParamError( "Invalid line width." )
    self._polyOpts["width"] = size

  def setLineStyle( self, style ):
    """Sets the style used to draw lines. 'style' can be either solid or
     'dashed'."""
     
    if style == "solid" :
      self._polyOpts["dash"] = None
    elif style == "dashed" :
      self._polyOpts["dash"] = (4,)
    else :
      raise GraphicsParamError( "Invalid line style." )
      
  def setFont( self, family = None, size = None, style = None ):
    """Sets the font used to draw text". 'family' can be one of: arial,
     courier, times, or helvetica; 'size' is the point size; and 'style'
     can be one of: normal, bold, italic, or bold italic.""" 
    
    origFamily, origSize, origStyle = self._fontOpts["font"]
    if family is not None and \
       family not in ('helvetica', 'arial', 'courier', 
                       'times', 'times roman') :
      raise GraphicsParamError( "Invalid font family." )
    else :
      family = origFamily
    if style is not None and \
       style not in ('bold', 'normal', 'italic', 'bold italic') :
      raise GraphicsParamError( "Invalid font style." )
    else :
      style = origStyle
    if size is not None and (type(size) != int or size <= 0) :
      raise GraphicsParamError( "Invalid font size." )
    else :
       size = origSize
    self._fontOpts["font"] = (family, size, style)           

  def setAnchor( self, position ):
    """Sets the position of text by indicating how the bounding box
     surrounding the text will be positioned in relation to the (x, y)
     coordinate provided with drawText(). position can be one of:
     'n', 's', 'e', 'w', 'center', 'nw', 'ne', 'sw', 'se'.""" 
     
    if position not in ('n', 's', 'e', 'w', 'nw', 'ne', 'sw', 'se', 'center') :
      raise GraphicsParamError( "Invalid anchor position." )       
    self._fontOpts["anchor"] = position
     
  def setJustify( self, style ):
    """Sets the justification for multiline text. 'style' can be one of:
     left, center, or right."""
     
    if style == "left" :
      self._fontOpts["justify"] = tk.LEFT
    elif style == "center" :
      self._fontOpts["justify"] = tk.CENTER
    elif style == "right" :
      self._fontOpts["justify"] = tk.RIGHT
    else :
      raise GraphicsParamError( "Invalid justification value." )

 #--- The object drawing methods.

  def drawPoint( self, x, y ):
    """Draws or plots a single point (pixel) on the canvas at position: x, y."""
    
    self._checkValid()
    obj = self._tkcanvas.create_line( x, y, x+1, y,
                                    fill=self._polyOpts["outline"], 
                                    width=self._polyOpts["width"] )
    self._tkcanvas.update_idletasks()
    return obj    

  def drawLine( self, x1, y1, x2, y2 ):
    self._checkValid()
    obj = self._tkcanvas.create_line( x1, y1,
                                     x2, y2,
                                     fill=self._polyOpts["outline"], 
                                     width=self._polyOpts["width"],
                                     dash=self._polyOpts["dash"] )
    self._tkcanvas.update_idletasks()
    return obj
  
  def drawArrow( self, x1, y1, x2, y2 ):
    self._checkValid()
    obj = self._tkcanvas.create_line( x1, y1, x2, y2, 
                                     fill=self._polyOpts["outline"], 
                                     width=self._polyOpts["width"],
                                     dash=self._polyOpts["dash"],
                                     arrow=tk.LAST )
    self._tkcanvas.update_idletasks()
    return obj
    
  def drawRect( self, x, y, width, height ):
    self._checkValid()
    obj = self._tkcanvas.create_rectangle(x, y, x + width, y + height, self._polyOpts )
    self._tkcanvas.update_idletasks()
    return obj
  
  def drawPolygon( self, *coords ):
     # Unwrap the cooridinates which allows the method to accept individual vertices
     # or a list of vertices.
    if len(coords) == 1 and (type(coords[0]) == list or type(coords[0] == tuple)) :       
       expCoords = tuple(*coords)
    else :
       expCoords = coords
    
    self._checkValid()
    if len(expCoords) < 6 :
      raise GraphicsParamError( "At least 3 vertices must be provided." )
    obj = self._tkcanvas.create_polygon( expCoords, self._polyOpts )
    self._tkcanvas.update_idletasks()
    return obj
  
  def drawArc( self, x, y, diameter, startAngle, extent ):
    self._checkValid()
    obj = self._tkcanvas.create_arc( x, y, x + diameter, y + diameter, self._polyOpts,
                                    start=startAngle, extent=extent )
    self._tkcanvas.update_idletasks()
    return obj
  
  def drawOval( self, x, y, width, height ):
    self._checkValid()
    obj = self._tkcanvas.create_oval( x, y, x + width, y + height, self._polyOpts )
    self._tkcanvas.update_idletasks()
    return obj    
  
  def drawText( self, x, y, text ):
    self._checkValid()
    self._fontOpts["text"] = text
    obj = self._tkcanvas.create_text( x, y, self._fontOpts )
    self._tkcanvas.update_idletasks()
    return obj
    
 #--- Methods that can be used to manipulate the objects previously drawn 
 #--- on the canvas. Each object drawing method returns a unique id number
 #--- used to identify the resulting object.
 
  def shiftObj( self, objId, dx, dy ):
    self._checkValid()
    if objId not in self :
      raise GraphicsObjError()
    self._tkcanvas.move( objId, dx, dy )    
    self._tkcanvas.update_idletasks()
  
  def removeObj( self, objId ):
    self._checkValid()
    if objId not in self :
      raise GraphicsObjError()
    self._tkcanvas.delete( objId )
    self._tkcanvas.update_idletasks()
  
  def showObj( self, objId ):
    self._checkValid()
    if objId not in self :
      raise GraphicsObjError()
    self._tkcanvas.itemconfig( objId, state = "normal" )
    self._tkcanvas.update_idletasks()
    
  def hideObj( self, objId ):
    self._checkValid()
    if objId not in self :
      raise GraphicsObjError()
    self._tkcanvas.itemconfig( objId, state = "hidden" )
    self._tkcanvas.update_idletasks()
    
  def raiseObj( self, objId, above = None ):    
    self._checkValid()
    if objId not in self :
      raise GraphicsObjError()
    self._tkcanvas.tag_raise( objId )   
    self._tkcanvas.update_idletasks()
  
  def lowerObj( self, objId, below = None ):
    self._checkValid()
    if objId not in self :
      raise GraphicsObjError()
    self._tkcanvas.tag_lower( objid )
    self._tkcanvas.update_idletasks()
 
  def configObj( self, objId, char, value ):
    pass
    
  def __contains__( self, objId ):
    if self._tkcanvas.winfo_ismapped() :
      return len(self._tkcanvas.find_withtag( objId )) > 0
    else :
      return False
    
  def typeOfObj( self, objId ):
    """Returns a string containing the type of object with the given id. 
     The type will be one of: 'arc', 'bitmap', 'image', 'line', 'oval', 
     'polygon', 'rectangle', 'text'.
     """
    self._checkValid()
    if objId not in self :
      raise GraphicsObjError()
    return self._canvas.type(objId)
        
  def objects( self ):
    """Returns a list containing the id numbers of all objects currently 
     drawn on the canvas."""
     
    self._checkValid()
    return self.find_all()
    
 #--- Helper method. 
  def _checkValid( self ):
    if not self._tkcanvas.winfo_ismapped() :
      raise GraphicsWinError()


class ImageWindow :
  """Defines a simple top-level framed window that contains a photo image."""
    
  def __init__(self, width = 400, height = 400, title = ""):
    "Creates a new image window containing an empty image."
    
     # Is the window currently open? You can only update an open window.
    self._isValid = True
    
     # Create a top-level window for the graphics window.
    self._tkwin = tk.Toplevel( _rootWin, width = width, height = height,
                               borderwidth = 0, padx = 0, pady = 0)
    self._tkwin.protocol("WM_DELETE_WINDOW", self.close)
    self._tkwin.title(title)
            
     # Create the photo image and tk canvas inside the window.
    self._tkimage = tk.PhotoImage(width = width, height = height)
    self._tkcanvas = tk.Canvas(self._tkwin, width = width, height = height, 
                               bg = "white", bd = 0)
    
     # Add the photo image object to the canvas.    
    self._tkcanvas.create_image(0, 0, anchor="nw", image=self._tkimage)
    self._tkcanvas.pack()
    
     # Bring the graphics window to the front of all other windows and
     # force an update.
    self._tkwin.lift()
    self._tkwin.resizable(0, 0)    
    self._tkwin.update_idletasks()
        

  def close( self ):
    """Closes and destroys the image window."""
    
     # Set the closed flag to true so no other ops can be performed on
     # the window object.
    if not self._isValid : return
    self._isValid = False
    
     # Destroy the window and force an update so it will close when  
     # used in IDLE or Wing IDE.
    self._tkwin.destroy()
    self._tkwin.update_idletasks()
    
     # Terminate the mainloop so the program will exit.
    self._tkwin.quit()
   
  def wait( self ):
    """Stops and waits for the user to click the 'close' button on the 
     window frame."""
     
    if not self._isValid : raise GraphicsWinError()
    self._tkwin.mainloop()

  def setPixel(self, row, col, red, green, blue) :
    self._tkimage.put("#%02x%02x%02x" % (red, green, blue), (col, row))
  
  def getPixel(self, row, col) :
    string = self._tkimage.get(col, row)
    parts = string.split()
    return (int(parts[0]), int(parts[1]), int(parts[2]))    
    
# --- Defines special graphics exceptions that are raised when an error
# --- occurs in a GraphicsWindow method.

class GraphicsError( Exception ) :
  def __init__( self, message ):
    super(GraphicsError, self).__init__( message )

class GraphicsObjError( GraphicsError ) :
  def __init__( self ):
    super(GraphicsObjectError, self).__init__( "Invalid object id." )

class GraphicsWinError( GraphicsError ) :
  def __init__( self ):
    super(GraphicsWinError, self).__init__(
              "Operation can not be performed on a closed window." )

class GraphicsParamError( GraphicsError ) :
  def __init__( self, message ):
    super(GraphicsParamError, self).__init__( message )


# --- Create the root window and initialize the Tk system.

_rootWin = tk.Tk()
_rootWin.withdraw()


