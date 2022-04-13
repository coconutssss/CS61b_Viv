import java.sql.SQLOutput;

/**
 * @author Vivian
 * @create 2022-02-05 3:36 PM
 */
public class RotatingSLList <Item> extends  SLList<Item>{
//会继承所有父类的instance,variables,methods and nested classes but  members
    //but memebers maybe private and thus accessible
    public  void rotateRight(){
        Item x= removeLast();
        addFirst(x);

    }

    public static void main(String[] args) {
        RotatingSLList<Integer> rs1 = new RotatingSLList<>();
        //creating SLList:[10,11,12,13]
        rs1.addLast(10);
        rs1.addLast(11);
        rs1.addLast(12);
        rs1.addLast(13);
        //should be 13,10,11,12
        rs1.rotateRight();
        //System.out.println();
        //rs1.print();
        for(int i=0;i<rs1.size() ;i++){
            int k =rs1.get(i);
            System.out.print(k);
        }
        System.out.println();

    }

}
