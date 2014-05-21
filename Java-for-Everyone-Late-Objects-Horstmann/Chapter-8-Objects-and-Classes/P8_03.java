import java.util.Scanner;

/*Reimplement the Menu class so that it stores all menu items in one long string.
Hint: Keep a separate counter for the number of options. When a new option is
added, append the option count, the option, and a newline character.*/

public class P8_03 {
    private String options;
    private int optionsCount = 0;
    
    public P8_03() {
        this.options = "";
    }
    
    public void addOption(String option) {
        this.optionsCount += 1;
        this.options += String.format("%s%d)%s\n", this.options, this.optionsCount, option);
    }
    
    public void getOptions() {
        System.out.println(options);
    }
    
    public void getInput() {
        Scanner console = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Choice: ");
            choice = console.nextInt();
        } while (choice < 1 || choice > optionsCount);
        console.close();
    }
}
