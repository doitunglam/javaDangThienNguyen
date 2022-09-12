public class Main {

    public static void main(String[] args) {
        // Fraction frac1 = new Fraction(2,9);
        // Fraction frac2 = new Fraction(4,18);
        // // System.out.println(frac1.toString());
        // // System.out.println(frac2.toString());
        // // System.out.println(frac1.equals(frac2));
        MyLinkedList<Integer> mll = new MyLinkedList<>();
        mll.addFirst(3);
        mll.addLast(6);
        mll.addFirst(8);
        mll.addAfter(mll.getHead(), 2);
        mll.print();
        System.out.println();
        System.out.println(Ex1_3.countEven(mll));
        System.out.println(Ex1_3.countPrime(mll));
        Ex1_3.add(mll, 6);
        mll.print();
        System.out.println();
        System.out.println(Ex1_3.largestElement(mll));
    }
}
