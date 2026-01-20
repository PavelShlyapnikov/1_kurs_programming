package LR9.example3.example1;

// public class Example5 {
//    public static int fib(int x) {
//        System.out.println(x);
//        if (x == 0) {
//            return 0;
//        } else if (x == 1) {
//            return 1;
//        } else {
//            return fib(x - 1) + fib(x - 2);
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(fib(8));
//    }
//}

public class Example5 {
    public static void main(String[] args) {
        System.out.println(fact1(5));
    }

    public static int fact1(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fact1(n - 2) + fact1(n - 1);
        }

    }
}