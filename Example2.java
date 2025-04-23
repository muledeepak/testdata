public class Example2 {

    public static void main(String[] args) {
        System.out.println("Inside the main method");
        myOtherMethod(); // Calling the other method
        int result = addTwoNumbers(5, 3); // Calling a method that returns a value
        System.out.println("The result of addition is: " + result);
    }

    public static void myOtherMethod() {
        System.out.println("Inside my other method");
    }

    public static int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }
}
