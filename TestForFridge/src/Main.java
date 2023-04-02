import java.util.List;
import javax.smartcardio.CardException;
import javax.smartcardio.CardTerminal;
import javax.smartcardio.TerminalFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        try {
            foo();
        } catch(Exception e) {
            System.err.println(e.getStackTrace());
        }
    }

    public static void foo() throws CardException {
        TerminalFactory factory = TerminalFactory.getDefault();
        List<CardTerminal> terminals = factory.terminals().list();
        System.out.println("Terminals: " + terminals);
    }
}