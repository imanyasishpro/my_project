import java.util.Scanner;

public class FirstClass {
    public static void main(String[] arg){

        boolean isDataValid = checkData();
        if (isDataValid) {
            System.out.print("So, you are " + calAge(2025) + " years old");
        }else {
            checkData();
        }
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

    public static int calAge(int currentYear) {

        String year = getInputs();
        int intYear = Integer.parseInt(year);
        int age = currentYear - intYear;

        return age;
    }
    public static boolean checkData () {

        int age = calAge(2025);

        if ( 0<age && age < 125 ){
            return true;
        }else {
            return false;
        }
    }
}
