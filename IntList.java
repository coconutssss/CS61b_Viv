/**
 * @author Vivian
 * @create 2022-02-05 3:34 PM
 */
public class IntList {
        public int first;
        public IntList rest;
        public IntList(int f,IntList r){
                first = f;
                rest =r;
        }
        public void addFirst(int x) {
            // Describe in your own words what you might put here.
        }
        //这个递归求size还是比较没掌握！
        public int size(){
                if(rest == null){
                        return 1;
                }
                return 1+this.rest.size();
        }
     //这个用遍历求size也不太熟。。。。
        public int iterativeSize(){
                IntList p =this;
                int totalSize =0;
                while(p != null){
                        totalSize++;
                        p=p.rest;
                }
                return totalSize;
        }

        public static void main(String[] args) {
                IntList L = new IntList(15,null);
                L = new IntList(10,L);
                L =new IntList(5,L);
        }

}
