import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Write a program that replaces each line of a file with its reverse. For example, if you
 run
 java Reverse HelloPrinter.java
 then the contents of HelloPrinter.java are changed to
 retnirPolleH ssalc cilbup
 {
 )sgra ][gnirtS(niam diov citats cilbup
 {
 wodniw elosnoc eht ni gniteerg a yalpsiD //
 ;)"!dlroW ,olleH"(nltnirp.tuo.metsyS
 }
 }
 Of course, if you run Reverse twice on the same file, you get back the original file.*/

public class P7_08 {
    public static void main(String[] args) throws FileNotFoundException {
        String filename;
        if (args.length == 1) {
            filename = args[0];
        } else {
            System.out.print("File name: ");
            Scanner console = new Scanner(System.in);
            filename = console.next();
            console.close();
        }

        Scanner fileRead = new Scanner(new File(filename));
        while (fileRead.hasNextLine()) {
            String line = fileRead.nextLine();
            line = reverse(line);
            System.out.println(line);
        }
        fileRead.close();
    }

    public static String reverse(String line) {
        return new StringBuilder(line).reverse().toString();
    }
}
