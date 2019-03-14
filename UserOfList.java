/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inArraySlots list = new List_inArraySlots();

        list.add(1);
	list.add(3.14);
	list.add("hello");
	list.add(true);

	System.out.println(list);
    }
}
