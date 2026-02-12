// No import needed for basic printing

public class TypeConversion {

  public static void main(String[] args) {

    // 1. Variable declarations (your original variables)
    int Age = 35;
    String Name = "Shameer";
    float Weight = 77.6f; // Added 'f' for float
    double Salary = 21500.65;

    System.out.println("Age: " + Age);
    System.out.println("Name: " + Name);
    System.out.println("Weight: " + Weight + " kg");
    System.out.println("Salary: " + Salary);

    System.out.printf("Name: %s, Age: %d, Salary: %.2f\n", Name, Age, Salary);

    int intVal = 100;
    double doubleVal = intVal;
    System.out.println("int to double: " + intVal + " → " + doubleVal);

    double bigNum = 99.99;
    int smallInt = (int) bigNum;
    System.out.println("double to int: " + bigNum + " → " + smallInt);

    String numStr = "250";
    int parsedInt = Integer.parseInt(numStr);
    System.out.println("String to int: " + numStr + " → " + parsedInt);

    int score = 95;
    String scoreStr = String.valueOf(score);
    System.out.println("int to String: " + score + " → " + scoreStr);

    System.out.println("\n--- Type Conversion Demo Complete ---");
  }
}
