public interface Sorting<T extends  Comparable<T>>{
    T[] Sort(T[] arr);
    void swap(T[] arr,int i,int j);
}