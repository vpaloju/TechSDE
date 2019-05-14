package arrays.search;

public class LinearSearch {

    public static int linearSearch(int[] array, int elemenToBeSearch) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] == elemenToBeSearch) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] array, int l,int r,int x){
        if(r<l){
            return -1;
        }
        if(x==array[l]){
            return l;
        }
        if(x==array[r]){
            return r;
        }
        return linearSearch(array,l+1,r-1,x);
    }
}
