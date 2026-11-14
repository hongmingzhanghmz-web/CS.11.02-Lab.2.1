/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honoring the CIS academic honesty pledge
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Devin Gu
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args){
        System.out.println(add(5,7));
        System.out.println(add(5,7,6,6));
        System.out.println(morningGreeting("Toby Fox"));
        System.out.println(afternoonGreeting("Mac Miller"));
        System.out.println(triple("oohbaby"));
        System.out.println(half(19));
        System.out.println(roundPositiveValueToNearestInteger(8.5));
        System.out.println(roundPositiveValueToNearestInteger(8.49));
        System.out.println(roundNegativeValueToNearestInteger(-8.5));
        System.out.println(roundNegativeValueToNearestInteger(-8.49));
    }

    // 1. add
public static int add(int num1, int num2) {
        return num1 + num2;
}
    
    // 2. add
public static int add(int num1, int num2, int num3, int num4) {
        return add(add(add(num1, num2),num3),num4);
}
    // 3. morningGreeting
public static String morningGreeting(String name) {
        return "早上好，" + name + "!";
}
    // 4. afternoonGreeting
public static String afternoonGreeting(String name){
        return "下午好，" + name + "!";
}
    // 5. triple
public static String triple(String input){
        return input + input + input;
    }
    // 6. half
public static double half(int number){
        return (double) number/2;
}
    // 7. roundPositiveValueToNearestInteger
public static int roundPositiveValueToNearestInteger(double integer){
        return (int) (integer + 0.5);
    }
    // 8. roundNegativeValueToNearestInteger
public static int roundNegativeValueToNearestInteger(double negativeInteger){
    return (int) (negativeInteger - 0.5);
}
}