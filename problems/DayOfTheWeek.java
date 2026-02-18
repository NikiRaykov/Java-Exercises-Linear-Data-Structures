import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int n = Integer.parseInt(scanner.nextLine());

        switch (n) {
            case 1 -> System.out.println(daysOfTheWeek[0]);
            case 2 -> System.out.println(daysOfTheWeek[1]);
            case 3 -> System.out.println(daysOfTheWeek[2]);
            case 4 -> System.out.println(daysOfTheWeek[3]);
            case 5 -> System.out.println(daysOfTheWeek[4]);
            case 6 -> System.out.println(daysOfTheWeek[5]);
            case 7 -> System.out.println(daysOfTheWeek[6]);
            default -> System.out.println("Invalid day!");
        }
    }
}
