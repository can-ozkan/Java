import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        for (int i=1; i<=5; i++){
            PojoStudent pojoStudent = new PojoStudent(i,
                    switch (i){
                case 1 -> "can";
                case 2 -> "betul";
                case 3 -> "yakup";
                case 4 -> "nafiye";
                case 5 -> "hakan";
                        default -> "unknown";
                    },
                    "05/11/1985", new ArrayList<String>());
            System.out.println(pojoStudent);

        }

        for (int i=1; i<=5; i++){
            RecordStudent recordStudent = new RecordStudent(i,
                    switch (i){
                        case 1 -> "can";
                        case 2 -> "betul";
                        case 3 -> "yakup";
                        case 4 -> "nafiye";
                        case 5 -> "hakan";
                        default -> "unknown";
                    },
                    "05/11/1985", new ArrayList<String>());
            System.out.println(recordStudent);

        }

        PojoStudent ps1 = new PojoStudent(1, "can", "05/11/1985", new ArrayList<String>());
        RecordStudent rs1 = new RecordStudent(2, "betul", "05/11/1984", new ArrayList<String>());

        System.out.println(ps1.getName());
        System.out.println(rs1.name());
    }
}