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

    public static int linearSearch(int[] array, int left,int right,int x){
        if(right<left){
            return -1;
        }
        if(left==right){
            if(x==array[left]){
                return left;
            }else{
                return -1;
            }
        }
        if(x==array[left]){
            return left;
        }
        if(x==array[right]){
            return right;
        }
        return linearSearch(array,left+1,right-1,x);
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(linearSearch(a,5));
        System.out.println(linearSearch(a,0,a.length-1,5));
    }
}
