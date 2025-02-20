import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your movie name or q to quite - ");
            String title = scanner.nextLine();
            if (Objects.equals(title, "q")){
                break;
            } else {
                Movie movie = new Movie(title);
                System.out.println(movie.theMovie());
            }
        }

    }
}
