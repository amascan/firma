import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 20.09.2016.
 */
public class Fileread {
    public static List<String> read(String tmp) {
        BufferedReader bufIn = null;
        List<String> templist = new ArrayList<String>();
        try {
            bufIn = new BufferedReader(new FileReader(tmp));

            String e;
            while ((e = bufIn.readLine()) != null) {
                templist.add(e);
            }
        } catch (IOException var11) {
            System.err.println(var11);
        } finally {
            if (bufIn != null) {
                try {
                    bufIn.close();
                } catch (IOException var10) {
                    System.err.println(var10);
                }
            }

            return templist;
        }

    }
}
