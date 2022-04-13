/**
 * @author Vivian
 * @create 2022-02-12 6:55 PM
 */
public class IterationDemo {
    public static void main(String[] args){
        ArrayMap<String,Integer> am = new ArrayMap<String,Integer>();

        am.put("hello",5);
        am.put("sss",10);
        am.put("kin",10);

        ArrayMap.KeyIterator ami =am.new KeyIterator();//!!!!!

        while (ami.hasNext()){
            System.out.println(ami.next());
        }

    }
}
