import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static sun.java2d.cmm.ColorTransform.In;

/**
 * @author Vivian
 * @create 2022-02-08 7:37 PM
 */
public class DemoCollections {
    public static String cleanString(String s){
        return s.toLowerCase().replaceAll("[^a-z]","");
    }

    public static List<String> getWords(String inputFilename){
        List<String> lst =new ArrayList<String>();
      //  In in =new In();
//        while(!in.isEmpty()){
//            lst.add(in.readString());
//        }
        return lst;
    }
    public static int countUniqueWords(List<String> words){
        Set<String> ss =new HashSet<>();
        for(String s:words){
            ss.add(s);
        }
        return ss.size();
    }
}
