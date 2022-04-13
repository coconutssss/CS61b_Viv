/**
 * @author Vivian
 * @create 2022-02-09 10:11 PM
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
        return index > -1
    }
    public  void put(K key,V value){
        int index = keyIndex(key);
        if (index == -1){
                key[size] =key;
                value[size] =value;
                size+=1;
                return;
         }
        value[index] = value;
    }

    public V get(K key){
        int index = keyIndex(key);
        return  values[index];
    }
    pubilic int size(){

    }
    public list<K> keys(){
        List<K> keylist = new ArrayList<K>();
        for(int i = 0;i<keys.length;i+=1){
            keylist.add(keys[i]);
        }
        return  keylist;
    }

    public static void main(String[] args) {
        ArrayMap<String,Integer> m = new ArrayMap<String, Integer>();
        m.put("horse",3);
        m.put("fish",9);
        m.put("house",10);
    }
    @Test
    public void test(){
        ArrayMap<Integer,Integer> am =new ArrayMap<Integer,Integer>;
        am.put(2,5);
        int expected = 5;
        assertEquals(expected,am.get(2));
    }
}
