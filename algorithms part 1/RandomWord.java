import java.util.Scanner;

public class RandomWord {
    public static void main(String[] args) {
        String champ = "";
        int i = 1;
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String value = scanner.next();
            boolean flag = Math.random() < (double) 1 / i;
            if (flag) {
                champ = value;
            }
            i++;
        }
        scanner.close();
        System.out.println(champ);
    }
}
