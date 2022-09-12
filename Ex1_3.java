public class Ex1_3 {
    public static boolean isPrimeNumber(int n) {

        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countEven(MyLinkedList<Integer> list) {
        int count = 0;
        for (Node<Integer> n = list.getHead(); n != null; n = n.getNext()) {
            if (n.getData() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countPrime(MyLinkedList<Integer> list) {
        int count = 0;
        for (Node<Integer> n = list.getHead(); n != null; n = n.getNext()) {
            if (isPrimeNumber(n.getData())) {
                count++;
            }
        }
        return count;
    }

    static int largestElement(MyLinkedList<Integer> head) {
        int max = Integer.MIN_VALUE;

        for (Node<Integer> n = head.getHead(); n != null; n = n.getNext()) {

            if (max < n.getData())
                max = n.getData();
           // n = n.getNext();
        }
        return max;
    }

    public static void add(MyLinkedList<Integer> head, Integer item) {
        if (head.getHead().getData() % 2 == 1)
        {
            head.addFirst(item);
            return;
        }
        for (Node<Integer> n = head.getHead(); n.getNext() != null; n = n.getNext()) {
            if (n.getNext().getData() % 2 == 1)
            {
                head.addAfter(n, item);
                return;
            }
        }
        System.out.println("There is no even item. Can't insert.");
        return;
    }
}
