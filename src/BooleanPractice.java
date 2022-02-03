public class BooleanPractice {
    // GROUP PRACTICE 1 - here (only this part for one!)
    // conditional statement
    // first discuss what the condition should be given the examples in main
    // then type it out
    public static boolean quickPractice1(int value) {
        if(value >= 100){
            return true;
        }
        return false; // just write the line of code that goes here!
    }


    public static void main(String[] args) {

        System.out.println(quickPractice1(100));  // prints true
        System.out.println(quickPractice1(101));  // prints true
        System.out.println(quickPractice1(99));   // prints false

        System.out.println(quickPractice2(100));  // prints YES, at min
        System.out.println(quickPractice2(101));  // prints YES, over
        System.out.println(quickPractice2(99));   // prints NO, under

    }

    /// GROUP PRACTICE 2 - here
    // same as above, but you will need an if/else statement to do it!
    // discuss and design before doing it
    public static String quickPractice2(int value) {
        String tmp = "";
        // just write the lines of code that go here!
        if(value >= 100){
            return "YES";
        }else if (value < 100) {
            return "NO";
        }
        return tmp;
    }
}
