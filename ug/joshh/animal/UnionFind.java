package ug.joshh.animal;

/**
 * @author Vivian
 * @create 2022-04-11 9:18 PM
 * @description:In this lab, you’ll create UnionFind which will be used to solve the dynamic connectivity problem.
 * As mentioned in discussion “Union Find” is a synonym for “Disjoint Sets”.
 */
/*通过以上的分析，我们得到了一个稍快的算法_Quick union_，但其时间复杂度会随着联通集所对应的树越来越高而变差。我们是否可以进一步优化这个算法呢？

//答案是可以的。既然其表现随着树的高度增长而变差，那么我们就需要找出一些方法来使联通集所构造的树更加扁平。通过以下两种方法，我们可以大大减少树的高度。*/
public class UnionFind  {
    private int[] parent;
    private int[] size;

    /**
     * Creates a UnionFind data structure holding n vertices.
     * Initially, all vertices are in disjoint sets.
     * @param n
     */
    public UnionFind(int n){
        parent= new int[n];
        for (int i:parent){
            parent[i] =i;
        }
        for(int i:size){
            size[i]=i;
        }
    }


    /**
     *  Throws an exception if v1 is not a valid index.
     * @param v1
     */
    public void validate(int v1){

    }

    /**
     * Returns the size of the set v1 belongs to.
     * @param v1
     * @return
     */
    public int sizeOf(int v1){

            return size[v1] ;
    }

    /**
     * Returns the parent of v1. If v1 is the root of a tree,
     * returns the negative size of the tree for which v1 is the root.
     * @param v1
     * @return
     */
    public int parent(int v1){
        if(parent[v1] >=0){
            v1= parent[v1];
        }
        return v1;
    }

    /**
     * Returns true if nodes v1 and v2 are connected.
     * @param v1
     * @param v2
     * @return
     */
    public boolean connected(int v1, int v2){
        return  find(v1) == find(v2);
    }

    /**
     * Connects two elements v1 and v2 together. v1 and v2 can be any valid elements,
     * and a union-by-size heuristic is used. If the sizes of the sets are equal,
     * tie break by connecting v1’s root to v2’s root.
     * Unioning a vertex with itself or vertices that are already connected should not change the sets
     * , but it may alter the internal structure of the data structure.
     * @param v1
     * @param v2
     */
    public void union(int v1, int v2){

    }

    /**
     * Returns the root of the set v1 belongs to.
     * Path-compression is employed allowing for fast search-time.
     * @param v1
     * @return
     */
    public int find(int v1){
        if(parent[v1] >=0){
            v1= parent[v1];
        }
        return v1;
    }
/**
 * path compression
 * getRoot() 其实我觉得不需要上面的parent() 和find()直接用getRoot()
 */
public int getRoot(int i ){
    while(i != parent[i]){
      parent[i] =parent[parent[i]] ; //这里就是pathcompression
      i= parent[i];
    }
    return i;
}



}
