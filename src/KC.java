public class KC {
//
//    private double myValue = 0;
//
//    public void setValue(double myValue) {
//        this.myValue = myValue;
//
//    }
//    public double getValue() {
//        return myValue;
//    }
//
//    @Override
//    public String toString() {
//        return "KC{" +
//                "myValue=" + myValue +
//                '}';
//    }
//
//    public static void main(String[] args) {
//        int x = 10;
//        KC one = new KC();
//        KC two = new KC();
//        double y = x/2;
//        one.setValue(x);
//
//        one.setValue(y);
//        two.setValue(one.getValue());
//
//        System.out.println(one);
//        System.out.println(two);
//
//        String str = "Raven" + ' '+ "Never";
////        String number = 10 + 'x';
////        int number = 10 + "x";
////        String joe = 'joe';
//        int val = 'x' + 2;
//        char xa = 67;
//        System.out.println(val);
//        System.out.println(xa);
//    }

    public static double getAnswer(int first, int second) {
        return 4 * first * second;
    }

    public static void main(String[] args) {
        int val = 4;
        int val2 = 7;
        System.out.println(getAnswer(val, val2));

        int neverMore = 'R' + 'a'+'v'+'e'+'n';
        System.out.println(neverMore);
    }

}
