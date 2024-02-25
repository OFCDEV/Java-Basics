package Stack_Queue;
import java.util.*;
public class q_using_stack {
    public static void main(String[] args) {
        
    }
    class QueueUsingStack{
        private Stack<Integer> first;
        private Stack<Integer> second;

        public QueueUsingStack(){
            first = new Stack<>();
            second = new Stack<>();
        }

        public void add(int item){
            first.push(item);
        }
        public int removed(){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            int removed = second.pop();

            while(!second.isEmpty()){
                first.push(second.pop());
            }
            return removed;
        }
        public int peek(){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            int peeked = second.peek();

            while(!second.isEmpty()){
                first.push(second.pop());
            }
            return peeked;
        }

        public boolean isEmpty(){
            return first.isEmpty();
        }
    }
}
