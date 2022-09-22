package twoPointer.removeDuplicates;

public class Main {
    public static int removeDuplicate(int[] array){
        int nextNonRepeat = 1;
        for (int i = 1; i < array.length; i++){
            if (array[nextNonRepeat - 1] != array[i]){
                array[nextNonRepeat] = array[i];
                nextNonRepeat++;
            }
        }
        return nextNonRepeat;
    }

    public static void main(String[] args) {
        int result = removeDuplicate(new int[] {2, 3, 3, 3, 5, 7, 8, 8});
        System.out.println(result);
    }
}
