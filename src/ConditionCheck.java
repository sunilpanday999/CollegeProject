public class ConditionCheck {
        public static boolean signCheck(int val) {
        return 0 != val;
    }


    public static void main(String[] args) {
        System.out.printf("%b, %b, %b", signCheck(10), signCheck(0), signCheck(-10));
    }
    /*
    public static void main(String[] args) {


        int i = 1;
        String tmp = "";
        while (i <= 9) {
            tmp += (i + ",");
            i = i + 1;
        }
        System.out.println(tmp.length());
    }


     */

/*
    public static void simpleLoop(int total) {
        String tmp = "";
        for (int x = 0; x < total; x++) {
            tmp += (x + ",");
        }
        System.out.println(tmp);
        System.out.println(tmp.length());
    }

    public static void main(String[] args) {
        simpleLoop(9);
    }

 */

    /*
    public static void printIt(int value) {
        if(value <= 10) {
            if (value > 0) {
                System.out.println("Play a paladin");
            }else {
                System.out.println("Play a white mage");
            }
        }else if (value <= 15) {
            System.out.println("Play a black mage");
        } else {
            System.out.println("Play a monk");
        }
    }

    public static void main(String[] args) {
        printIt(5);
        printIt(10);
        printIt(15);
    }


     */
}
