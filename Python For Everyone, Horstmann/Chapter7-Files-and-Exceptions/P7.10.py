# Get the data for baby names in prior years from the Social Security Administration.
# Paste the table data in files named babynames2010.txt , etc. Modify the babynames.py
# program so that it prompts the user for a file name. Can you spot a trend in the
# frequencies?	
##
#  This program displays the most common baby names. Half of boys and girls in
#  the United States were given these names in 2011.
#

from sys import argv

# The percentage limit to be extracted.
LIMIT = 50.0

def main() :
   # MODIFIED
   if argv != "":
      inputFile = open(argv[1], "r")
   
   else:
      filename = str(input("File to open: "))
      inputFile = open(filename, "r")

   boyTotal = 0.0
   girlTotal = 0.0
   while boyTotal < LIMIT or girlTotal < LIMIT :      
      # Extract the data from the next line and split it.
      line = inputFile.readline()
      dataFields = line.split()

      # Extract the individual field values.
      rank = int(dataFields[0])
      boyName = dataFields[1]
      boyPercent = float(dataFields[2].rstrip("%"))
      girlName = dataFields[3]
      girlPercent = float(dataFields[4].rstrip("%"))

      # Process the data.            
      print("%3d " % rank, end="")
      boyTotal = processName(boyName, boyPercent, boyTotal)
      girlTotal = processName(girlName, girlPercent, girlTotal)
      print()
      
   inputFile.close()
   
## Prints the name if total >= 0 and adjusts the total.
#  @param name the boy or girl name
#  @param percent the percentage for this name
#  @param total the total percentage processed
#  @return the adjusted total
#
def processName(name, percent, total) :
   if total < LIMIT :
      print("%-15s " % name, end="")

   total = total + percent
   return total      
   
# Start the program.
main()
