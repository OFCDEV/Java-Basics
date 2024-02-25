package Stack_Queue;

public class stackK {
    protected int[] data;
    private static final int DEFAULT_SIZE = 200;

    int ptr = -1;

    public stackK(){
        this(DEFAULT_SIZE);
    }
    public stackK(int size){
        this.data = new int[size]; 
    }

    public boolean  push(int item){
        if(isFull()){
            System.out.println("Cannot push a full stack!");
            return false;
        }
        data[ptr++] = item;
        return true;
    }
    private boolean isFull() {
        return ptr == data.length-1;
    }
    private boolean isEmpty(){
        return ptr == -1;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty stack cannot be popped!");
        }
        return data[ptr--];
    }
}
