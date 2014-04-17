# Finds recursively files with given extension in the given directory


# IMPORTS
from os import listdir
from os.path import join, isdir


# FUNCTIONS
def find(parent_dir, extension):
    for file in listdir(parent_dir):
        child = join(parent_dir, file)
        if isdir(child):
            find(child, extension)
        elif child.endswith(extension):
            print(child)
