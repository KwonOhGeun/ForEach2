import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEach2 {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);

        }
    }
}