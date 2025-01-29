//Create a class "Person" with a static member variable "count" that keeps track of the number of instances created.
package OOPs;

public class Q3 {
    private static int count = 0;

    public Q3(){
        //Increment the count whenever a new instance is created
        count++;
    }
    public static int getCount(){
        return count;
    }
    public static void main(String[] args) {
        Q3 person1 = new Q3();
        Q3 person2 = new Q3();
        Q3 person3 = new Q3();

        System.out.println("Total no. of people: "+Q3.getCount());
    }
}
