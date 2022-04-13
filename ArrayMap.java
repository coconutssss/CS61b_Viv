import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Vivian
 * @create 2022-02-10 4:07 PM
 */
public class ArrayMap<K,V> implements Map61B<K,V>{
    private  K[] keys;
    private  V[] values;
    int size;

    public  ArrayMap(){
        keys =(K[]) new Object[100];
        values = (V[]) new Object[100];
        size = 0;
    }
    public Iterator<K> iterator(){
        return new KeyIterator();
    }
    public  class KeyIterator implements  Iterator<K>{
        private int wizarfPosition;
        public KeyIterator(){
            wizarfPosition =0;
        }
        public boolean hasNext(){
                return wizarfPosition < size;
        }
        public K next(){
            K returnVal = keys[wizarfPosition];
            wizarfPosition +=1;
            return  returnVal;
        }
    }
    /**
     * return the index of the given key if it exists
     */
    private  int keyIndex(K  key){
        for (int i =0;i<size;i+=1){
            if (keys[i].equals(key)){
                return i;
            }
        }
        return  -1;
    }
    public  boolean constainsKey(K key){
        int index = keyIndex(key);
//        if(index > -1){
//            return true ;
//        }
//        return  false;
        return index > -1;
    }
    public  void put(K key,V value){
        int index = keyIndex(key);
        if (index == -1){
            keys[size] =key;
            values[size] =value;
            size+=1;
            return;
        }
        values[index] = value;
    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    public V get(K key){
        int index = keyIndex(key);
        return  values[index];
    }
    public  int size(){
        return size;
    }
    public List<K> keys(){
        List<K> keylist = new ArrayList<K>();
        for(int i = 0;i<keys.length;i+=1){
            keylist.add(keys[i]);
        }
        return  keylist;
    }

//    public static void main(String[] args) {
//        ArrayMap<String,Integer> m = new ArrayMap<String, Integer>();
//        m.put("horse",3);
//        m.put("fish",9);
//        m.put("house",10);
//    }
    @Test
    public void test(){
        ArrayMap<Integer,Integer> am =new ArrayMap<Integer,Integer>();

        am.put(2,5);
        int expected = 5;
        assertEquals((Integer) expected,am.get(2));
    }
}

