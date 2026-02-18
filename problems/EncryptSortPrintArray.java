    import java.util.Arrays;
    import java.util.Scanner;
    public class EncryptSortPrintArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());

            String[] names = new String[n];
            int[] arrayNumbersAnswer = new int[n];

            for (int i = 0; i < n; i++) {
                names[i] = scanner.nextLine();
            }

            for (int i = 0; i < names.length; i++) {
                String name = names[i];
                int sum1 = 0; int sum2 = 0;

                for (int j = 0; j < name.length(); j++) {
                    char c = name.charAt(j);
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    ||  c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                        sum1 += (int) c * name.length();
                    } else {
                        sum2 += (int) c / name.length();
                    }
                }
                int answer = sum1 + sum2;

                arrayNumbersAnswer[i] = answer;

            }

            Arrays.sort(arrayNumbersAnswer);

            for (int j : arrayNumbersAnswer) {
                System.out.println(j);
            }
        }
    }