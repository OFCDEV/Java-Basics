package OOPs;

public class inherit_main {
    public static void main(String[] args) {
        inheritance i1 = new inheritance();
        inheritance i2 = new inheritance(4.9);
        inheritance i3 = new inheritance(1.2,3.2,4.5);

        System.out.println(i1.h+" "+i1.l+" "+i1.w);
        System.out.println(i2.h+" "+i2.l+" "+i2.w);
        System.out.println(i3.h+" "+i3.l+" "+i3.w);
    }
}
