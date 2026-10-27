package Arrays;

public class PassingArrayToMethods {
    static void main(String[] args) {
        int [] numbers = {1, 2};
        change(numbers);
        printArray(numbers);
    }

    static void change(int[]numbers) {
        numbers[0]=8;
        numbers[1]=6;
    }

    static void printArray(int[]numbers) {
        for (int i = 0 ; i < numbers.length; i++)
            System.out.print(numbers[i]+" ");

    }

}
