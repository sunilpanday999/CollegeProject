package Lab3;

public class ConditionLab {
    // Step 1, 2, 3
    /* write self-explanation here
     *
     *
     * Step 1:
     * In laneCheck method if we pass argument value less than 50 than
     * it will execute and print "Slow lane".
     *
     * Step 2:
     * In laneCheck method if we pass argument value greater than 100 than
     * it will execute and print "Jail Lane".
     *
     * Step 3:
     * In laneCheck method if we pass argument value greater than 50 than
     * it will execute and print "Fast Lane".
     *
     */
    public static String laneCheck(int value) {
        if (value <= 50) {
            return "Slow Lane";
        }
        if (value > 100) {
            return "Jail Lane";
        }
        if (value > 50) {
            return "Fast Lane";
        }
        return "";
    }

    private static void testLaneCheck() {
        System.out.println("Testing laneCheck");
        String test1 = laneCheck(45);
        String test2 = laneCheck(50);
        String test3 = laneCheck(120);
        String test4 = laneCheck(60);
        System.out.printf("Test 1 should return Slow Lane: Returned: %s%n", test1);
        System.out.printf("Test 2 should return Slow Lane: Returned: %s%n", test2);
        System.out.printf("Test 3 should return Jail Time: Returned: %s%n", test3);
        System.out.printf("Test 4 should return Fast Lane: Returned: %s%n", test4);
        System.out.println();
    }


    // Step 4
    /*
     * Self explanation on reason for changes here
     *
     *
     */
    public static String streetLight1(String color) {
        if (color == "red") {
            return "Stop";
        } else if (color == "yellow") {
            return "Slow";
        } else if (color == "green") {
            return "Go";
        }
        return "ERROR";

    }

    private static void testStreetLight1() {
        System.out.println("Testing streetLight1");
        String test1 = streetLight1("red");
        String test2 = streetLight1("yellow");
        String test3 = streetLight1("green");
        String test4 = streetLight1("blue");
        // note we use the "new String()" above to force java to
        // not use the same memory address
        System.out.printf("Test1 should return Stop: %b (%s)%n",
                "Stop".equals(test1), test1);
        System.out.printf("Test2 should return Slow: %b (%s)%n",
                "Slow".equals(test2), test2);
        System.out.printf("Test3 should return Go: %b (%s)%n",
                "Go".equals(test3), test3);
        System.out.printf("Test4 should return ERROR: %b (%s)%n",
                "ERROR".equals(test4), test4);
        System.out.println();
    }


    public static String streetLight2A(String color) {
        String instruction = "Go";
        if (color.equalsIgnoreCase("red")) {
            instruction = "Stop";
        }
        if (color.equalsIgnoreCase("yellow")) {
            instruction = "Slow";
        }
        return instruction;
    }
    /*
                    if (color.equalsIgnoreCase("red"))              if(color.equalsIgnoreCase("yellow"))
                                /\                                              /\
                           yes /  \No                                      yes /  \no
                              /    \                                          /    \
             instruction = "Stop"   instruction = "Go"         instruction = "Slow"   instruction = "Go"

     */

    public static String streetLight2B(String color) {
        if (color.equalsIgnoreCase("red")) {
            return "Stop";
        }
        if (color.equalsIgnoreCase("yellow")) {
            return "Slow";
        }
        return "Go";
    }

    /*
                    if (color.equalsIgnoreCase("red"))              if(color.equalsIgnoreCase("yellow"))
                                /\                                              /\
                           yes /  \No                                      yes /  \no
                              /    \                                          /    \
                    return "Stop"   return "Go"                     return "Slow"   return "Go"

     */

    public static String streetLight2BContain(String color) {
        if (color.contains("red")) {
            return "Stop";
        }
        if (color.contains("yellow")) {
            return "Slow";
        }
        return "Go";
    }

    // STEP 5
    /*
     *      In streetLight2A and streetLight2B method, we don't have else condition or for green color condition which
     * will execute when we pass the argument as a "green". There whatever argument we will pass except red and yellow
     * on those method that will return Go so we have to make one condition where if we pass Green then I will return
     * Go otherwise return Error. Both methods functionality are same.
     */
    public static void testStreetLight2AB() {
        System.out.println("Testing streetLight2A");
        String test1 = streetLight2A("red");
        String test2 = streetLight2A("yellow");
        String test3 = streetLight2A("green");
        String test4 = streetLight2A("blue");
        System.out.printf("Test1 should return Stop: %b (%s)%n",
                "Stop".equals(test1), test1);
        System.out.printf("Test2 should return Slow: %b (%s)%n",
                "Slow".equals(test2), test2);
        System.out.printf("Test3 should return Go: %b (%s)%n",
                "Go".equals(test3), test3);
        System.out.printf("Test4 should return ERROR: %b (%s)%n",
                "ERROR".equals(test4), test4);
        System.out.println();


        System.out.println("Testing streetLight2B");
        String test5 = streetLight2B("red");
        String test6 = streetLight2B("yellow");
        String test7 = streetLight2B("green");
        String test8 = streetLight2B("blue");
        System.out.printf("Test5 should return Stop: %b (%s)%n",
                "Stop".equals(test5), test5);
        System.out.printf("Test6 should return Slow: %b (%s)%n",
                "Slow".equals(test6), test6);
        System.out.printf("Test7 should return Go: %b (%s)%n",
                "Go".equals(test7), test7);
        System.out.printf("Test8 should return ERROR: %b (%s)%n",
                "ERROR".equals(test8), test8);
        System.out.println();


        System.out.println("Testing streetLight2BContain");
        String test9 = streetLight2BContain("red");
        String test10 = streetLight2BContain("yellow");
        String test11 = streetLight2BContain("green");
        String test12 = streetLight2BContain("blue");
        System.out.printf("Test9 should return Stop: %b (%s)%n",
                "Stop".equals(test9), test9);
        System.out.printf("Test10 should return Slow: %b (%s)%n",
                "Slow".equals(test10), test10);
        System.out.printf("Test11 should return Go: %b (%s)%n",
                "Go".equals(test11), test11);
        System.out.printf("Test12 should return ERROR: %b (%s)%n",
                "ERROR".equals(test12), test12);
        System.out.println();

        System.out.println();
    }


    public static String streetLight3(String color) {
        String instruction;

        if (color.equalsIgnoreCase("red")) {
            instruction = "Stop";
        } else if (color.equalsIgnoreCase("yellow")) {
            instruction = "Slow";
        } else if (color.equalsIgnoreCase("green")) {
            instruction = "Go";
        } else {
            instruction = "Invalid color";
        }
        return instruction;
    }
        /*
                    if (color.equalsIgnoreCase("red"))
                                /\
                           yes /  \No
                              /    \
            instruction = "Stop"    else if(color.equalsIgnoreCase("yellow"))
                                            /\
                                       yes /  \no
                                          /    \
                        instruction = "Slow"    else if(color.equalsIgnoreCase("green"))
                                                        /\
                                                   yes /  \no
                                                      /    \
                                     instruction = "Go"    instruction = "Invalid color"

     */



    public static void testStreetLight3() {
        System.out.println("Testing streetLight2A");
        String test1 = streetLight3("red");
        String test2 = streetLight3("yellow");
        String test3 = streetLight3("green");
        String test4 = streetLight3("blue");
        System.out.printf("Test1 should return Stop: %b (%s)%n",
                "Stop".equals(test1), test1);
        System.out.printf("Test2 should return Slow: %b (%s)%n",
                "Slow".equals(test2), test2);
        System.out.printf("Test3 should return Go: %b (%s)%n",
                "Go".equals(test3), test3);
        System.out.printf("Test4 should return ERROR: %b (%s)%n",
                "ERROR".equals(test4), test4);
        System.out.println();
    }



    /**
     * The following main method is the entry point to your program.
     * We are using the main method simply to 'test' the code
     * in this file. A very common technique.
     *
     * @param args
     */
    public static void main(String[] args) {
        testStreetLight1();
        testLaneCheck();
        testStreetLight2AB();
        testStreetLight3();

    }
}
