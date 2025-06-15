public class DooBeeDo {
    public static void main(String[] args) {
        int x = 1;
        while (x < 3) { // ✅ loop runs when x = 1, 2
            System.out.print("Doo"); // ✅ no println — all on same line
            System.out.print("Bee");
            x = x + 1;
        }
        if (x == 3) { // ✅ after loop ends, x == 3
            System.out.print("Do");
        }
    }
}
