import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1347);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 877));

        placesToVisit.addFirst(new Place("Sydney", 0));

        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;

        do {
            printMenu();
            String menuItem = scanner.nextLine().toUpperCase().substring(0,1);

            switch (menuItem){
                case "F":

                    System.out.println("User wants to go forward");
                    if (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;

                case "B":
                    System.out.println("User wants to go backward");
                    if (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;

                case "M":
                    printMenu();
                    break;

                case "L":
                    System.out.println(placesToVisit);
                    break;

                default:
                    quitLoop = true;
                    break;
            }

        } while (!quitLoop);


    }

    private static void addPlace(LinkedList<Place> list, Place place){
        for (Place p : list){
            if (p.name().equalsIgnoreCase(place.name())){
                System.out.println("Duplicate Found");
                return;
            }
        }

        int matchedIndex = 0;
        for (var listPlace : list){
            if (place.distance() < listPlace.distance()){
                list.add(matchedIndex, place);
                return;

            }
            matchedIndex++;
        }
        list.add(place);
    }

    private static void printMenu(){
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit
                """);
    }
}