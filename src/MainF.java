import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Adrian on 07.10.2016.
 */
public class MainF {
    public static void main(String[] args) {
        List<String> firme = new ArrayList<>();
        firme = Fileread.read("venituri.txt");
        Venituri line = new Venituri(firme.get(2));
        line.calculare();

    }
}
