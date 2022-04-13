import java.util.List;

/**
 * @author Vivian
 * @create 2022-02-10 3:07 PM
 */
public interface Map61B<K,V> {

    boolean containsKey(K key);

    V get(K key);

    int size();

    void put(K key,V value);

    List<K> keys();


}
