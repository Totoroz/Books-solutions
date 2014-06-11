/*File names and extensions. Write a program that prompts the user for the drive letter
( C ), the path ( \Windows\System ), the file name ( Readme ), and the extension ( txt ). 
Then print the complete file name  C:\Windows\System\Readme.txt . (If you use UNIX or a
Macintosh, skip the drive name and use  / instead of \ to separate directories.)
*/


import java.util.Scanner;


public class P2_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the drive letter: ");
        String driveLetter = in.next();
        System.out.print("Please enter the path: ");
        String path = in.next();
        System.out.print("Please enter the filename: ");
        String filename = in.next();
        System.out.print("Please enter the extension: ");
        String extension = in.next();
        in.close();
        String completeFilename = driveLetter + ":" + path + "\\" + filename + "." + extension;
        System.out.println(completeFilename);
    }
}
