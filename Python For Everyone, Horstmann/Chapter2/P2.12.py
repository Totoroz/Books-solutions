# File names and extensions. Write a program that prompts the user for the drive letter
# ( C ), the path ( \Windows\System ), the file name ( Readme ), and the extension ( txt ). Then
# print the complete file name  C:\Windows\System\Readme.txt . (If you use UNIX or a
# Macintosh, skip the drive name and use  / instead of \ to separate directories.)

driveLetter = str(input("Enter the drive letter: "))
path = str(input("Enter the path(folders only: "))
fileName = str(input("Enter the file name: "))
fileExtension = str(input("Enter the file extension: "))

print("The complete file name path is:")
print(driveLetter + ":\\" + path + "\\" + fileName + "." + fileExtension)