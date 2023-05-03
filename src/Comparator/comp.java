package Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class comp {
    public static void main(String[] args){
        int[][] arr = {{1,2},{5,2},{3,9},{4,2}};

        //sorting based on the first element in each array
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        for(int[] i:arr) System.out.println(i[0]+" "+i[1]);

        List<Integer> list = new ArrayList<>(Arrays.asList(1,4,32,5,29));
        Integer[] converted = new Integer[list.size()];
        converted = list.toArray(converted);
        



    }
}
