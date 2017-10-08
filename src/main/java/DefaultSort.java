import java.util.Arrays;

public class DefaultSort<T extends Comparable<T>> implements Sorting<T>{
    public T[] Sort(T[] arr){
        Arrays.sort(arr);
        return arr;
    }
    public void swap(T[] arr,int i,int j){
        T tmp = arr[j];
        arr[j]=arr[i];
        arr[i]=tmp;
    }
}
