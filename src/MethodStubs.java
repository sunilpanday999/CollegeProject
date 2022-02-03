public class MethodStubs {
    /* Your solution goes here  */
    public static int getUserNum() {
        System.out.println("FIXME: Finish getUserNum()");
        return -1;
    }

    public static int computeAverage(int userNum1, int userNum2) {
        System.out.println("FIXME: Finish computeAvg()");
        return -1;
    }



    public static void main(String [] args) {
        int userNum1;
        int userNum2;
        int avgResult;
        MethodStubs stubTester = new MethodStubs();

        userNum1 = stubTester.getUserNum();
        userNum2 = stubTester.getUserNum();
        avgResult = stubTester.computeAverage(userNum1, userNum2);

        System.out.println("Avg: " + avgResult);
    }
}
