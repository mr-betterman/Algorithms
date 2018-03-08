/**
 * Created by Kai on 2018/3/8.
 */
import java.util.Arrays;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
public class BinarySearch {
    public static int rank(int key, int[] a){
        // 数组必须是有序的
        int lo = 0;
        int hi = a.length -1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(key < a[mid]){
                hi = mid -1;
            }
            if(key > a[mid]){
                hi = mid +1;
            }
            else
                return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if(rank(key, whitelist) < 0){
                System.out.println(key);
            }
        }
    }
}

