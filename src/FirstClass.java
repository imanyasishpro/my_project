import java.util.Scanner;

public class FirstClass {
    public static void main(String[] arg){
        String year = getInputs();
        int intYear = Integer.parseInt(year);
        int age = 2025 - intYear;

        System.out.print("So you are " + age + " years old");
    }

    public static String getInputs () {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.print("What year did you born? ");
        String bornYear = scanner.nextLine();
        return  bornYear;
    }
}
