import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

/**
 * @author Vivian
 * @create 2022-01-22 4:50 PM
 */
public class Sort {
    public static void sort(String[] x) {
        sort(x, 0);

    }
    // to create a private helper method that has an additional parameter (or parameters) that delineate which part of the array to consider. For example, we might write a private helper method also called sort that consider only the items starting with item start.
    private static void sort(String[] x,int start){
        if(start == x.length)  return;
        int smallIndex =findSmallest(x,start);
        swap(x,start,smallIndex);
        sort(x,start+1);
    }


    /** Returns the smallest string in x.
     *
     * @param x
     * @return
     * @source Got help with string compares from https://goo.gl/a7yBU5.
     */
    //return the index of the smallest string in x,starting at start.
    public static int findSmallest(String[] x,int start) {
//        String smallest =x[0];
//       for(int i=0;i<x.length;i++){
//           int cmp=x[i].compareTo(smallest);
//           if(cmp <0) {
//               smallest = x[i];
//           }
//       }
//       return  smallest;
        int smallestIndex = start;
        for (int i = start; i < x.length; i++) {
            int cmp = x[i].compareTo(x[smallestIndex]);
            if (cmp < 0) {
                smallestIndex = i;
            }
        }
        return  smallestIndex;
    }
        public static void swap (String[] x,int a, int b){
            String temp = x[a];
            x[a] = x[b];
            x[b] = temp;
        }

}

