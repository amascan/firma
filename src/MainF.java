import java.util.*;

/**
 * Created by Adrian on 07.10.2016.
 */
public class MainF {
    public static void main(String[] args) {

        System.out.println("Introduceti codul firmei!");
        Scanner scan= new Scanner(System.in);
        String text= scan.nextLine();

        List<String> firme = new ArrayList<>();
        firme = Fileread.read("venituri.txt");
        for(int i=1;i<firme.size();i++){
           Venituri line = new Venituri(firme.get(i));
            if (text.equals(line.getCod())) {
                line.calculare();
            }
        }

    }
}
