import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*Get the data for names in prior decades from the Social Security Administration.
 Paste the table data in files named babynames80s.txt , etc. Modify the worked_example_1/
 BabyNames.java program so that it prompts the user for a file name. The numbers in
 the files have comma separators, so modify the program to handle them. Can you
 spot a trend in the frequencies?*/

public class P7_10 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> babyNames = scrapeBabyNames("http://www.ssa.gov/oact/babynames/");

        ArrayList<String> maleNames = new ArrayList<String>();
        ArrayList<String> femaleNames = new ArrayList<String>();
        for (int i = 0; i < babyNames.size(); i++) {
            if (i % 2 == 0) {
                maleNames.add(babyNames.get(i));
            } else {
                femaleNames.add(babyNames.get(i));
            }
        }
        System.out.println(maleNames.toString());
        writeBabyNames("male_names.txt", maleNames);
        System.out.println(femaleNames.toString());
        writeBabyNames("female_names.txt", femaleNames);
    }

    public static ArrayList<String> scrapeBabyNames(String url) throws IOException {
        ArrayList<String> babyNames = new ArrayList<String>();
        Document site = Jsoup.connect("http://www.ssa.gov/oact/babynames/").userAgent("Mozilla").get();
        Elements tables = site.select("td");
        for (Element element : tables) {
            String name = element.text();
            if (!isNumeric(name)) {
                babyNames.add(name);
            }
        }
        return babyNames;
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public static void writeBabyNames(String filename, ArrayList<String> names) throws FileNotFoundException {
        PrintWriter fileWrite = new PrintWriter(new File(filename));
        for (int i = 0; i < names.size(); i++) {
            fileWrite.println(names.get(i));
        }
        fileWrite.close();
    }
}
