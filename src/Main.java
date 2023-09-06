public class Main {

    public static void main(String[] args) {
        int addTwo = add(4,6);
        System.out.println(addTwo);
        int addFour = add(1,2,3,4);
        System.out.println(addFour);
        String morningHi = morningGreeting("Pointman Moses");
        System.out.println(morningHi);
        String afternoonHi = afternoonGreeting("Tired Pointman Moses");
        System.out.println(afternoonHi);
        String triple = triple("I like to sleep and dream");
        System.out.println(triple);
        double splitHalf = half(5673.5);
        System.out.println(splitHalf);
        int roundPos = roundPositiveValueToNearestInteger(6.3);
        System.out.println(roundPos);
        int roundNeg = roundNegativeValueToNearestInteger(-1.3);
        System.out.println(roundNeg);



    }
    // 1. add
    public static int add (int a, int b)  {
        return (a + b);
    }
    // 2. add
    public static int add (int a, int b, int c, int d ) {

        return (add(d, add (c, (add(a,b)))));
    }

    // 3. morningGreeting
    public static String morningGreeting (String name) {

        return ("早上好, " + name + "!" );
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting (String name2) {
        return ("下午好, " + name2 + "!");
    }
    // 5. triple
    public static String triple (String inputForTriple) {
        return (inputForTriple + inputForTriple + inputForTriple);
    }

    // 6. half
    public static double half (double splitHalf){
        return (splitHalf / 2 );
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger (double roundPos){
        int roundPositiveValueToNearestInteger = (int) (roundPos + 0.5);
        return (roundPositiveValueToNearestInteger);
    }

    // 8. roundNegativeValueToNearestInteger

    public static int roundNegativeValueToNearestInteger (double roundNeg) {
        int roundNegativeValueToNearestInteger = (int) (roundNeg - 0.5);
        return (roundNegativeValueToNearestInteger);
    }

    }

    // 1. add
    
    // 2. add

    // 3. morningGreeting

    // 4. afternoonGreeting

    // 5. triple

    // 6. half

    // 7. roundPositiveValueToNearestInteger

    // 8. roundNegativeValueToNearestInteger


