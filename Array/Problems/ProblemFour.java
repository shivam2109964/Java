package Array.Problems;

public class ProblemFour {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 6, 4, 5, 7, 9, 10 };
        int result = missingNumByLinearSear(array);
        System.out.println("Missing Number is: " + result);
        int resultOne = missingUsingHash(array);
        System.out.println("Missing Number By Hashing: " + resultOne);
        int resultTwo = usingSum(array);
        System.out.println("Missing Number by Formula " + resultTwo);
        int resultThree = byUsingXOR(array);
        System.out.println("Missing Number By XOR: " +  resultThree);
    }

    public static int byUsingXOR(int[] array) {
        int length = array.length + 1;
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0; i < length - 1; i++) {
            xor2 ^= array[i];
        }
        for (int i = 1; i <= length; i++) {
            xor1 ^= i;
        }

        return xor1 ^ xor2;
    }

    public static int usingSum(int[] array) {
        long length = array.length + 1;
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        long expSum = length * (length + 1) / 2;
        return (int) (expSum - sum);
    }

    public static int missingUsingHash(int[] array) {
        int length = array.length + 1;
        // Create hash array of size n + 1
        int[] hash = new int[length + 1];
        // Store frequencies of elements
        for (int i = 0; i < length - 1; i++) {
            hash[array[i]]++;
        }
        // Find the missing Number
        for (int i = 1; i <= length; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int missingNumByLinearSear(int[] array) {
        int length = array.length + 1;
        for (int i = 1; i <= length - 1; i++) {
            boolean found = false;
            for (int j = 0; j < length - 1; j++) {
                if (array[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1;
    }
}
