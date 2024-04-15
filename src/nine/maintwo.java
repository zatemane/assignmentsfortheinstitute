package nine;

public class maintwo {
    public static void main(String[] args) {
        int[] x = new int[] { 4, 9, 3, 2, 5, 18, 21, 7, 11, 15, 5, 17 };

        int[] sortedArr1 = sortArr1(x);
        System.out.println("Нечетные числа вначале:");
        printArray(sortedArr1);

        int[] sortedArr2 = sortArr2(x);
        System.out.println("Четные числа вначале:");
        printArray(sortedArr2);
    }

    public static int[] sortArr1(int[] array) {
        int[] sortedArray = new int[array.length];
        int oddIndex = 0;
        int evenIndex = array.length - 1;

        for (int num : array) {
            if (num % 2 != 0) {
                sortedArray[oddIndex++] = num;
            } else {
                sortedArray[evenIndex--] = num;
            }
        }

        return sortedArray;
    }

    public static int[] sortArr2(int[] array) {
        int[] sortedArray = new int[array.length];
        int oddIndex = array.length - 1;
        int evenIndex = 0;

        for (int num : array) {
            if (num % 2 != 0) {
                sortedArray[oddIndex--] = num;
            } else {
                sortedArray[evenIndex++] = num;
            }
        }

        return sortedArray;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
