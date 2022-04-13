package ug.joshh.animal;

/**
 * @author Vivian
 * @create 2022-04-12 4:21 PM
 */
public class QuickFind {
//    输入数组id[]的长度为N。且每一个对象最初的id都为其本身。
//    当且仅当p和q具有相同的id时p和q才是联通的。
//    id[]数组中存储对应对象所属的联通集的root的id。
    int[] id;
    public QuickFind(int n){
        id = new int[n];
        for(int i = 0 ;i<n;i++){
            id[i] = i;
            //默认每一个数字id为其本身
        }
    }
    public void union(int p,int q){
        int pid = id[p];
        int qid = id[q];
        for(int i =0;i<this.id.length;i++){
            if(id[i] == pid){
                id[i] =qid;
            }//union 即为使其id 相同
        }
    }
    public boolean find(int p,int q){
        return id[p] ==id[q];
    }
    /**
     * find()操作的时间复杂度为O(1)。
     * union()操作的时间复杂度为O(N)
     */
}
