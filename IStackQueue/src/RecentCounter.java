import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    Queue<Integer> myQueue = new LinkedList<>();
    public RecentCounter() {

    }
    public int ping(int t) {
       myQueue.add(t);
       while(myQueue.peek()<(t-3000)){
           myQueue.remove();
       }
       return myQueue.size();
    }
    public static void main(String[] args) {

    }
}
