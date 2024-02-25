package Stack_Queue;


public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 100;

    int ptr = -1;

    public customStack(){
        this(DEFAULT_SIZE);
    }
    public customStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isFUll()){
            System.out.println("Stack is full");
            return false;
        }

        //ptr++;
        data[ptr++] = item;
        return true;
    }
    private boolean isFUll() {
        return ptr == data.length-1;
    }
    private boolean isEmpty(){
        return ptr == -1;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cant pop from an empty stack!");
        }
        return data[ptr--];
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack");
        }
        return data[ptr];
    }
    
}
