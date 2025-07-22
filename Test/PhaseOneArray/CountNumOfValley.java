package Test.PhaseOneArray;

public class CountNumOfValley {
    public static void main(String[] args) {
        String path = "UDDDUDUU";
        int result = numOfValley(path);
        System.out.println(result);
    }

    public static int numOfValley(String path) {
        int level = 0;
        int valley = 0;

        for (char step : path.toCharArray()) {
            if (step == 'D') {
                level--;
            } else if (step == 'U') {
                level++;
                if (level == 0) {
                    valley++;
                }
            }
        }
        return valley;
    }
}
