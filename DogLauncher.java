import java.util.Comparator;

/**
 * @author Vivian
 * @create 2022-02-07 6:07 PM
 */
public class DogLauncher {
    public static void main(String[] args) {
        Dog d1 =new Dog("eee",3);
        Dog d2 =new Dog("ss",9);
        Dog d3 =new Dog("bes",15);

        Dog[] dogs = new Dog[]{d1,d2,d3};
        System.out.println(Maximizer.max(dogs));
        Dog d = (Dog) Maximizer.max(dogs);
        d.bark();

        Comparator<Dog> nc = Dog.getNameComparator();
        if(nc.compare(d1,d3) >0){//if d1 comes later than d3 in the alphabet
            d1.bark();
        }else{
            d3.bark();
        }

    }
}
