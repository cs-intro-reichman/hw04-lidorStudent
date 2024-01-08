public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        int length = array.length;
        int[] count = new int[length + 1];
        for (int i = 0; i < length; i++) {
            count[array[i]]++; 
        }
        for (int i = 0; i < length + 1; i++) {
            if (count[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        int length = array.length;
        int max = array[0];
        int secondMax = array[0];
        for (int i = 1; i < length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
