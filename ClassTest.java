class Calculator {
    // Method definition - here, numberOne and numberTwo are formal parameters or arguments
    int calculateSum(int numberOne, int numberTwo) {
        return numberOne+numberTwo;
    }
}
public class ClassTest {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();

        int numberOne=11;
        int numberTwo=1;

        //Method call - here, numberOne and numberTwo are actual parameters or arguments
        int sum=calculator.calculateSum(numberOne, numberTwo);
        System.out.println("The sum is "+sum);
    }
}