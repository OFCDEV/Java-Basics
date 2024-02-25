package Stack_Queue;

public class main {
    public static void main(String[] args) throws Exception {
        customStack s1 = new customStack();
        s1.push(21);
        s1.push(1);
        s1.push(121);
        s1.push(91);
        s1.push(29);

        System.out.println(s1.pop());
    }
}
