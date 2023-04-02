import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> placesToVisit = new ArrayList<>();
        addMoreElement(placesToVisit);

        System.out.println(placesToVisit);

        testIterator2(placesToVisit);

        System.out.println(placesToVisit);

    }

    public static void addMoreElement(ArrayList<String> list){
        list.add("Alice Springs");
        list.add("Brisbane");
        list.add("Darwin");
        list.add("Canberra");
        list.add("Sydney");
        list.add("Hobart");
        list.add("Melbourne");
        list.add("Toowoomba");

    }

    public static void testIterator(ArrayList<String> list){
        var iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void testIterator2(ArrayList<String> list){
        var iterator = list.listIterator();
        while (iterator.hasNext()){
            // System.out.println(iterator.next());
            if (iterator.next().equals("Brisbane")){
                iterator.add("Lake Wivenhoe");
            }
        }
    }
}