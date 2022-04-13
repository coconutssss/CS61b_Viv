import java.util.Comparator;

/**
 * @author Vivian
 * @create 2022-02-07 5:36 PM
 */
public class Dog implements Comparable <Dog>{
    private int size;
    private String name;
    public  Dog(String n,int s){
        name =n;
        size =s;
    }
    public  void bark(){
        System.out.println(name+" says:bark!");
    }

/**   when i do not use OurComparable
 * and use Comparable<></>
 *
 *
 *  @Override
 *  return -1 if this dog is less than the dog pointed  at by o

    public int compareTo(Object o) {
        Dog uddaDog =(Dog)o;
        return this.size -uddaDog.size;//相比较下面的方法更简洁

//        if(this.size <uddaDog.size){
//            return -1;
//        }else if(this.size == uddaDog.size){
//            return 0;
//        }
//        return 1;
    }
    */

    @Override
    public int compareTo(Dog uddaDog) {
        return this.size -uddaDog.size;
    }
  //build a nested class
    private   static class NameComparator implements Comparator<Dog>{
        public int compare(Dog a,Dog b){//直接传入类！
                    return a.name.compareTo(b.name);
        }
    }
    public static  Comparator<Dog> getNameComparator(){
        return new NameComparator();
    }

}
