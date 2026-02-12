/*
 * File Name : DataTypes.java
 * Purpose   : Complete Revision of Java Data Types
 * Author    : Akhlaque Ansari
 *
 * This file contains:
 * - Primitive Data Types
 * - Non-Primitive Data Types
 * - Rules
 * - Examples
 * - Type Casting
 * - Memory Info
 */

public class DataTypes {

  public static void main(String[] args) {

    /*
     * ==========================================
     * 1. PRIMITIVE DATA TYPES (8 Types)
     * ==========================================
     * 
     * Primitive types store SIMPLE values.
     * They do NOT have methods.
     * They store actual data.
     * 
     * Total = 8
     */

    // 1. byte (1 byte = 8 bits)
    // Range: -128 to 127
    byte b = 100;

    // 2. short (2 bytes)
    // Range: -32,768 to 32,767
    short s = 20000;

    // 3. int (4 bytes) [MOST USED]
    // Range: -2^31 to 2^31-1
    int i = 100000;

    // 4. long (8 bytes)
    // Must use 'L' at end
    long l = 10000000000L;

    // 5. float (4 bytes)
    // Must use 'f' at end
    float f = 12.5f;

    // 6. double (8 bytes) [DEFAULT for decimals]
    double d = 99.99;

    // 7. char (2 bytes)
    // Stores single character (Unicode)
    char ch = 'A';

    // 8. boolean (1 bit approx)
    // Stores true or false
    boolean isJavaFun = true;

    /*
     * ==========================================
     * 2. NON-PRIMITIVE DATA TYPES
     * ==========================================
     * 
     * Also called: Reference Types
     * They store ADDRESS of data.
     * They can have methods.
     * 
     * Examples:
     * - String
     * - Arrays
     * - Classes
     * - Objects
     * - Interfaces
     */

    // String (Most Common Non-Primitive)
    String name = "DataTypes Revision";

    // Array
    int[] marks = { 90, 80, 85, 95 };

    // Object (Example)
    DataTypes obj = new DataTypes();

    /*
     * ==========================================
     * 3. SIZE TABLE (IMPORTANT)
     * ==========================================
     * 
     * Data Type Size
     * ----------------------
     * byte 1 byte
     * short 2 bytes
     * int 4 bytes
     * long 8 bytes
     * float 4 bytes
     * double 8 bytes
     * char 2 bytes
     * boolean ~1 bit
     */

    /*
     * ==========================================
     * 4. VARIABLE RULES
     * ==========================================
     * 
     * Rules for Naming Variables:
     * 
     * 1. Must start with letter, _ , or $
     * 2. Cannot start with number
     * 3. No spaces
     * 4. Cannot use keywords
     * 5. Case-sensitive
     * 
     * Valid:
     * int age;
     * int _num;
     * int $money;
     * int myValue;
     * 
     * Invalid:
     * int 2num;
     * int my value;
     * int class;
     */

    int age = 20;
    int _num = 10;
    int $money = 500;

    /*
     * ==========================================
     * 5. DEFAULT VALUES (For Fields)
     * ==========================================
     * 
     * Data Type Default Value
     * -------------------------
     * byte 0
     * short 0
     * int 0
     * long 0L
     * float 0.0f
     * double 0.0
     * char '\u0000'
     * boolean false
     * Object null
     * 
     * NOTE:
     * Local variables have NO default value.
     * Must initialize.
     */

    /*
     * ==========================================
     * 6. TYPE CASTING
     * ==========================================
     * 
     * Converting one type to another.
     * 
     * Two Types:
     * 1. Widening (Automatic)
     * 2. Narrowing (Manual)
     */

    // 1. WIDENING (Small -> Big) [Automatic]
    int x = 10;
    double y = x; // int -> double

    // 2. NARROWING (Big -> Small) [Manual]
    double p = 99.99;
    int q = (int) p; // double -> int (Data loss)

    /*
     * ==========================================
     * 7. TYPE PROMOTION
     * ==========================================
     * 
     * During expressions, Java promotes types.
     * 
     * Rule:
     * byte, short, char -> int
     * then -> long -> float -> double
     */

    byte a1 = 10;
    byte a2 = 20;

    // a1 + a2 becomes int
    int result = a1 + a2;

    /*
     * ==========================================
     * 8. FINAL KEYWORD
     * ==========================================
     * 
     * final variable = Constant
     * Cannot be changed
     */

    final double PI = 3.14159;
    // PI = 5.5; // ERROR (Not allowed)

    /*
     * ==========================================
     * 9. MEMORY LOCATION
     * ==========================================
     * 
     * Primitive -> Stack Memory
     * Object -> Heap Memory
     * Reference -> Stack (address)
     * 
     * Example:
     * int n = 10; -> Stack
     * String s = "Hi"; -> Heap
     */

    /*
     * ==========================================
     * 10. IMPORTANT INTERVIEW POINTS
     * ==========================================
     * 
     * - int is most used integer type
     * - double is default decimal type
     * - char uses single quotes
     * - String uses double quotes
     * - boolean has only true/false
     * - long & float need suffix (L, f)
     * - String is immutable
     */

    /*
     * ==========================================
     * 11. OUTPUT EXAMPLES
     * ==========================================
     */

    System.out.println("Byte: " + b);
    System.out.println("Short: " + s);
    System.out.println("Int: " + i);
    System.out.println("Long: " + l);
    System.out.println("Float: " + f);
    System.out.println("Double: " + d);
    System.out.println("Char: " + ch);
    System.out.println("Boolean: " + isJavaFun);

    System.out.println("Name: " + name);
    System.out.println("Type Casting: " + q);
    System.out.println("Result: " + result);
    System.out.println("PI: " + PI);

  }
}
