/**
 * @author Vivian
 * @create 2022-01-30 5:20 PM
 */
public class SLList <Blorp> implements  List61B<Blorp>{
    //nested class
    public  class Node{
        /** add    .last and .prev allow fast removeLast */
        public Blorp item;
        public Node next;
      //  public  IntNode prev;
        public Node(Blorp i,Node n){
         item=i;
         next=n;
        }
    }

    private Node sentinel;
  //  private  IntNode last;
    private int size;
    public SLList(){
        sentinel = new Node(null,null);
        size=0;
    }

    public SLList(Blorp x){
        size=1;
        sentinel = new Node(null,null);
        sentinel.next =new Node(x,null);

    }

    public void  addFirst(Blorp  x){
        Node oldFrontNode = sentinel.next;
        Node newNode = new Node(x,oldFrontNode);
       sentinel.next=newNode;
        size+=1;
    }
    //retrieves the front item from the list
    public Blorp getFirst(){
        return sentinel.next.item;
    }

    /**
//    public void addLast(int x){
//        IntNode p = sentinel;
//        size+=1;
//
//        while (p.next !=null){
//            p=p.next;
//        }
//        p.next = new IntNode(x,null);
//    }
  /** very slow 需要遍历一整个数组-----.>改进：加入一个last*/
//    public void addLast(int x){
//        last.next =new IntNode(x,null);
//        last =last.next;
//        size+=1;
//    }
    public void addLast(Blorp  x){
        size+=1;
        Node p = sentinel;
        /** move util reach the end */
        while(p.next !=null){
            p=p.next;
        }
        p.next = new Node(x,null);
    }
    /** returns the back node of our list*/
    public  Node getLastNode(){
        Node p= sentinel;

        while (p.next !=null){
            p=p.next;
        }
        return p;
    }
  /** return the last item  */
    public  Blorp getLast(){
        Node back =getLastNode();
        return back.item;
    }
/** delete and returns to last item*/
    public Blorp removeLast(){
        Node back =getLastNode();
        if(back == sentinel){
            return null;
        }
        size =size -1;
        Node p = sentinel;
        while (p.next != back){
            p=p.next;
        }
        p.next = null;
        return back.item;

}

    @Override
    public Blorp get(int i) {
        Node cur = sentinel;
        while(i-- >= 0){
            cur = cur.next;
        }
        return cur.item;
    }

    @Override
    public void insert(Blorp x, int position) {

    }

    public  int size() {
        return size;
}

    @Override
    public void print() {
        List61B.super.print();
    }

    public static void main(String[] args) {
        SLList x= new SLList();
        x.addLast(5);
    }
}
