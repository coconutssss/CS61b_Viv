package ug.joshh.animal;

/**
 * @author Vivian
 * @create 2022-04-11 9:25 PM
 */
public interface DisjointSets {
    /** connects two items P and Q */
    void connect(int p, int q);

    /** checks to see if two items are connected */
    boolean isConnected(int p, int q);
}
