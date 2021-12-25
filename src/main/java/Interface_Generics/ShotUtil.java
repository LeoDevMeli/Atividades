package Interface_Generics;

public class ShotUtil {

    public static <T> Procedente<T>[] sort(Procedente<T>[] arr){

        int arrLength = arr.length;
        Procedente<T> temp;

        for (int i = 0; i < arrLength - 1; i++) {
            for (int j = 0; j < arrLength - i - 1; j++) {
                if (arr[j].precedeA((T) arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
