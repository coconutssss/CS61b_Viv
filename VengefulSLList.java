/**
 * @author Vivian
 * @create 2022-02-05 7:58 PM
 */
public class VengefulSLList<Item> extends  SLList<Item> {
    //会继承所有父类的instance,variables,methods and nested classes but  members
    //but memebers maybe private and thus accessible

        SLList<Item> deletedItems;
        public  VengefulSLList(){
            super();
            deletedItems =new SLList<Item>();
    }
        @Override
        public  Item removeLast(){
            Item x = super.removeLast();
            deletedItems.addLast(x);//要加入节点都是从后面加，前面为sentinel
            return  x;
        }
    public  void  printLostItems(){
        deletedItems.print();
    }

    public static void main(String[] args) {
        VengefulSLList<Integer> vs1 = new VengefulSLList<>();
        //creating SLList:[10,11,12,13]
        vs1.addLast(10);
        vs1.addLast(11);
        vs1.addLast(12);
        vs1.addLast(13);

        vs1.removeLast();
        vs1.removeLast();
        System.out.println("the fallen are: '");
        vs1.printLostItems();
    }
}