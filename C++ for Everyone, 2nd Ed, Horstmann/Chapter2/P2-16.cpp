//File names and extensions.Write a program that prompts the user for the drive letter
//(C), the path(\Windows\System), the file name(Readme), and the extension(txt).Then
//print the complete file name  C : \Windows\System\Readme.txt . (If you use UNIX or a
//Macintosh, skip the drive name and use / instead of \ to separate directories.)

#include <iostream>
#include <string>

using namespace std;

int main()
{
   cout << "Enter the drive letter: ";
   string drive;
   cin >> drive;

   cout << "Enter the path: ";
   string path;
   cin >> path;

   cout << "Enter the file name: ";
   string filename;
   cin >> filename;

   cout << "Enter the extension: ";
   string ext;
   cin >> ext;

   cout << drive + ":" + path + "\\" + filename
      + "." + ext << endl;
   return 0;
}
