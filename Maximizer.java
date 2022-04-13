/**
 * @author Vivian
 * @create 2022-02-07 5:31 PM
 */
public class Maximizer {
    public static Comparable max(Comparable[] items){
        int maxDex = 0;
        for(int i =0;i<items.length;i++){
//            if (items[i]  > items[maxDex]){ //  ------the operator cannot applied to object
//                maxDex =i ;
//            }
            int cmp =items[i].compareTo(items[maxDex]);
            if(cmp > 0){
                maxDex = i;
            }
        }
        return items[maxDex];
    }

    public static void main(String[] args) {
        Dog[] dogs = {new Dog("ff",3),new  Dog("gg",2)};
        Dog maxDog =(Dog)max(dogs);
        maxDog.bark();
    }
}
