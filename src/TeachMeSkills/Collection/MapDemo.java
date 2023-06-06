package TeachMeSkills.Collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("1", "Lek");
        map.put("2", "Leo");
        map.put("2", "Leos"); // обновится значение с ключем 2
        map.put("4", "Slaw");
        map.put("6", "Lob");

        map.remove("4");

        String a = map.get("3");
        System.out.println(a);

        for (Map.Entry<String, String> mapp : map.entrySet()) {
            System.out.println(mapp);
        }
    }
}
