public class Array {
    public static void main(String[] args) {
        /* Array declaration */
        int[] myFirstArray;

        /* Memory allocation */
        myFirstArray = new int[5];

        /* Array declaration and memory allocation */
        int[] mySecondArray = new int[3];

        /* Array declaration, memory allocation, and initialization */
        int[] myThirdArray = {10, 20, 30, 40};

        // Array index -> Position of elements/Values
        // Starts with zero
        mySecondArray[0] = 10;
        mySecondArray[1] = 20;
        mySecondArray[2] = 100;

        // Access/Store in new variable
        int arrayElements = mySecondArray[0];
        System.out.println("First index: " + arrayElements);
        System.out.println("Second index: " + mySecondArray[1]);
    }
}

