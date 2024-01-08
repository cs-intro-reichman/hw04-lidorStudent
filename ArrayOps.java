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
            if (array[i] >= max) {
                secondMax = max;
                max = array[i];
            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        boolean found = false;
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                if (array1[i] == array2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
            found = false;
        }
        for (int i = 0; i < length2; i++) {
            for (int j = 0; j < length1; j++) {
                if (array2[i] == array1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        int length = array.length;
        int prev = array[0];
        for (int i = 1; i < length; i++) {
            if (prev > array[i]) {
                return false;
            } else {
                prev = array[i];
            }
        }
        return true;
    }
}
