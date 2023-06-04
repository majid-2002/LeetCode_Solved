package recursion;

public class SumOfAllNumbers {

    public static int recursiveSummation(int inputNumber) {
        if (inputNumber <= 1)
            return inputNumber;

        return inputNumber + recursiveSummation(inputNumber - 1);
    }

    public static void main(String[] args) {
        int res = recursiveSummation(5);
        System.out.println(res);

    }
}