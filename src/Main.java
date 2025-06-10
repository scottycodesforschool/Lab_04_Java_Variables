public class Main {
    public static void main(String[] args)
    {
        int intOperandA = 3;
        int intOperandB = 7;
        int intSum = 10;
        int intDifference = 5;
        int intProduct = 21;
        int intQuotient = 4;
        int intModulo = 3;

        double doubleOperandA = 25.50;
        double doubleOperandB = 7.21;
        double doubleSum = 32.78;
        double doubleProduct = 8.40;
        double doubleDifference = 18.30;
        double doubleQuotient = 7.80;

        System.out.println("--- Integer Operations ---");

        intSum = intOperandA + intOperandB; // Adding them together

        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intDifference = intOperandA - intOperandB; // Subracting B from A

        System.out.println("The difference of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intProduct = intOperandA * intOperandB; // Multiplying them together

        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intQuotient = intOperandA / intOperandB; // Dividing A by B

        System.out.println("The quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intModulo =  intOperandA % intOperandB; // Moduo operator

        System.out.println("The modulo of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        System.out.println("\n--- Double Operations ---");

        doubleSum = doubleOperandA + doubleOperandB;

        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleDifference = doubleOperandA - doubleOperandB;

        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        doubleProduct = doubleOperandA * doubleOperandB;

        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleQuotient = doubleOperandA / doubleOperandB;

        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        System.out.println("\n--- Questions ---");

        // The cost of my lunch
        double myLunchCost = 18.50;

        System.out.println("The cost of my lunch is: " + myLunchCost);

        // The number of kids in your family
        int numberOfKidsInFamily = 5;

        System.out.println("The number of kids in my family is: " + numberOfKidsInFamily);

        // The answer to is it raining?
        boolean isItRaining = false;

        System.out.println("Is it raining? " + isItRaining);

        // The price of a gallon of gas
        double priceOfGallonOfGas = 4.89; // Gas is expensive in Guam! Glad I got an EV :-)

        System.out.println("The price of a gallon of gas is: " + priceOfGallonOfGas);

        // Your favorite number
        int favoriteNumber = 9;

        System.out.println("My favorite number is: " + favoriteNumber);

        // Your shoe size
        double shoeSize = 10.5;

        System.out.println("My shoe size is: " + shoeSize);

        // Your birth month
        String birthMonth = "February";

        System.out.println("My birth month is: " + birthMonth);

        // Your full name
        String fullName = "Daniel Scott";

        System.out.println("My full name is: " + fullName);




    }
}