package Approaches.IterativeBased.New;

public class CountValley {
    public static void main(String[] args) {
        String path = "UDDDUDUU";
        int result = countValley(path);
        System.out.println(result);
    }

    public static int countValley(String path) {
        int level = 0;
        int valley = 0;

        for (char step : path.toCharArray()) {
            if (step == 'U') {
                level++;
                if (level == 0) {
                    valley++;
                }

            } else if (step == 'D') {
                level--;
            }
        }
        return valley;
    }
}
