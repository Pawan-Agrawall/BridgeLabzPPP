public class VariablesAndDataTypes {
    public static void main(String[] args) {
        // Integer types
        byte myByte = 100;         // Stores whole numbers from -128 to 127
        short myShort = 30000;     // Stores whole numbers from -32,768 to 32,767
        int myInt = 100000;        // Stores whole numbers from -2^31 to 2^31 - 1
        long myLong = 15000000000L; // Stores whole numbers from -2^63 to 2^63 - 1 (note the 'L' suffix)

        // Floating-point types
        float myFloat = 3.14f;     // Stores single-precision floating-point numbers (note the 'f' suffix)
        double myDouble = 2.71828; // Stores double-precision floating-point numbers

        // Character type
        char myChar = 'A';         // Stores a single character

        // Boolean type
        boolean myBoolean = true;  // Stores true or false values

        // Non-Primitive Data Type (String)
        String myString = "Hello, Java!"; // Stores a sequence of characters

        // Printing the values of the variables
        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Int: " + myInt);
        System.out.println("Long: " + myLong);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Char: " + myChar);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("String: " + myString);
    }
}
