import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs" };
        List<String> list = List.of(items);

        System.out.println(list);

        System.out.println(list.getClass().getName()); // java.util.ImmutableCollections$ListN

        // list.add("yoghurt"); this is going to throw an exception

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yoghurt");

        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles" , "mustard", "cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("Third item is " + groceries.get(2));

        if (groceries.contains("mustard")){
            System.out.println("List contains mustard");
        }

        groceries.add("yoghurt");

        System.out.println("First index " + groceries.indexOf("yoghurt"));
        System.out.println("Last index " + groceries.lastIndexOf("yoghurt"));
        groceries.remove("yoghurt");
        groceries.remove(1);
        groceries.removeAll(List.of("apples", "eggs"));

        System.out.println(groceries);

        groceries.removeAll(List.of("apples", "milk", "mustard", "cheese"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty " + groceries.isEmpty());

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
    }
}
