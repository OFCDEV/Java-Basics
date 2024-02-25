package Stack_Queue;

public class q {
    protected int[] data;
    private static final int DEFAULT_SIZE =10;

    int end =0;

    public q(){
        this(DEFAULT_SIZE);
    }
    public q(int size){
        this.data = new int[size];
    }
    public boolean isEmpty(){
        return end == -1;
    }
    public boolean isFull(){
        return end == data.length;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }
    public int removed() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!");
        }
        int removed = data[0];
        //Shifting elements
        for(int i=1; i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Q is empty");
        }
        return data[0];
    }
    public void display(){
        for(int i=0; i<end;i++){
            System.out.print(data[i] +" ");
        }
        System.out.println("End");
    }
}
