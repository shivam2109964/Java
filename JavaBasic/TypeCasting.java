public class TypeCasting {
    public static void main(String[] args) {
        // Widening Casting (automatic)
        int myInt = 54;
        double myDouble = myInt;
        System.out.println("Integer " + myInt + " into double " + myDouble);

        // Narrowing Casting (manually)
        double myDoubleValue = 584.99;
        int intValue = (int) myDoubleValue;

        System.out.println("The Double value " + myDoubleValue + " to Integer " + intValue);

    }
}
