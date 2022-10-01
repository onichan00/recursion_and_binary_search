public class Main {
    public static void main(String[] args) {
        int nummers[] = new int[10000000];
        int target = 200000;
        recursionTest(1000);
        binarySearchTest(nummers, target);

        for (int i = 0; i < nummers.length; i++) {
            nummers[i] = i;
        }

        int index = binarySearchTest(nummers, target);

        if (index == -1){
            System.out.println(target + " not found");
        } else {
            System.out.println("target found at: " + target);
        }


    }

    private static int binarySearchTest(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) /2;
            int value = array[middle];

            System.out.println(middle);

            if (value < target){
                low = middle + 1; // target is on right side
            } else if (value > target){
                high = middle -1; // target is on left side
            } else {
                return middle; // target is middle
            }
        }
        return -1; // no target in array
    }

    private static void recursionTest(int amount) {
        if (amount <= 1){
            return;
        }

        System.out.println(amount);
        recursionTest(amount - 1);
    }
}