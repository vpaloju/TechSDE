package arrays.search;

public class BinarySearch {

    public static int binarySearch(int[] array, int elementToBeSearch) {
        int left=0,right=array.length;
        while(left<=right){
            int mid=(left+right)/2;
            if(elementToBeSearch==array[mid]){
                return mid;
            }
            if(elementToBeSearch>array[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array,int l,int r,int x){
        if(l==r){
            if(x==array[l]){
                return l;
            }else{
                return -1;
            }
        }
        if(r<l){
            return -1;
        }
        int mid=(l+r)/2;
        if(x==array[r]){
            return r;
        }
        if(x<array[mid]) {
            return binarySearch(array, l, mid - 1, x);
        }else {
            return binarySearch(array, mid+1, r, x);
        }
    }
}
