package l03_array_and_method_in_java.exercise.gop_mang;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int[] newArray = mergeTowArray(arr1,arr2);
        System.out.println("Array after merging: ");
        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + "\t");
        }
    }

    public static int[] mergeTowArray(int[] arr1, int[] arr2){
        int length = arr1.length + arr2.length;
        int[] newArr = new int[length];
        int pos = 0;
        for (int i = 0; i < arr1.length; i++){
            newArr[pos] = arr1[i];
            pos++;
        }
        for (int i = 0; i < arr2.length; i++){
            newArr[pos] = arr2[i];
            pos++;
        }

        return newArr;
    }
}
