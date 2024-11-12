public class Sort {
    /**
     * Sorts strings destructively.
     */
    public static void sort(String[] x) {
        sort(x, 0);
    }

    /**
     * Sorts strings destructively starting from item start.
     */
    private static void sort(String[] x, int start) {
        if (start == x.length) {
            return;
        }
        int smallestIndex = findSmallest(x,start);
        swap(x, start, smallestIndex);
        sort(x, start + 1);
    }

    /**
     * Returns the smallest string in x, and returns it.
     *
     * @source Got help with string compares from
     * https://googl/a7yBU5.
     * https://sp18.datastructur.es/materials/discussion/discussion2sol.pdf
     */
    public static int findSmallest(String[] x,int start) {
        int smallestIndex = start;
        for (int i = 0; i < x.length; i++) {
            int cmp = x[i].compareTo(x[smallestIndex]);
            if (cmp < 0) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(String[] x, int a, int b) {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
}