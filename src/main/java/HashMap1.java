import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("1","홍길동");
        map.put("2","둘리");
        map.put("3","고길동");

        System.out.println(map);

        map.remove("3");
        System.out.println(map);

        map.clear();
        System.out.println(map);
    }
}
