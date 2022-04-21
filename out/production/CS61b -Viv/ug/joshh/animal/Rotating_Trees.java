package ug.joshh.animal;

import javax.xml.soap.Node;

/**
 * @author Vivian
 * @create 2022-04-21 12:56 PM
 */
public class Rotating_Trees {
    public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    private TreeNode rotateRight(TreeNode h){
        //对某一个点进行优选操作就是把这个点的子左节点提起来让原来的点
        //落在右边
        TreeNode  x = h.left;
        h.left = x.right;//且把原来子左节点的子右节点 连接在下落后的原节点上
        x.right = h;
        return x;
    }
    private TreeNode rotateLeft(TreeNode h){
        TreeNode x = h.left;
        h.left = x.right;
        x.left =h ;
        return x;//return x 的原因是此时x 为顶点了
    }
}
