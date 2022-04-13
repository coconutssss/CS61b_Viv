import org.junit.Test;

import javax.lang.model.SourceVersion;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * @author Vivian
 * @create 2022-02-10 3:57 PM
 */
public class MapHelper {
    public static <K,V>  V get(Map61B<K,V> sim,K key){
        if (sim.containsKey(key)){
            return sim.get(key);
        }
        return null;
    }
    public  static <K extends Comparable<K>,V>  K  getMax(Map61B<K,V> map){
        List<K> keylist = map.keys();
        K largest =keylist.get(0);
        for(K k:keylist){
            if(k.compareTo(largest) > 0){
                largest =k;
            }
        }
        return largest;

    }
    @Test
    public void testGet(){
        Map61B<String,Integer> m = new ArrayMap<String,Integer>();
        m.put("horse",3);
        m.put("fish",9);
        m.put("house",10);

        Integer actual = MapHelper.get(m,"fish");
        Integer expected = 9;

        //assertEquals(expected,actual);
        assertEquals(null,MapHelper.get(m,"adfgshj"));

    }
    @Test
    public void testMaxKey(){
        Map61B<String,Integer> m =new ArrayMap<String,Integer>();
        m.put("horse",3);
        m.put("fish",9);
        m.put("house",10);
    }

}
