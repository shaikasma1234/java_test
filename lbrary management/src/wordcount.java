import java.util.HashMap;
import java.util.Map;

public class wordcount {
    public static void main(String[] args) {
        wordcount wcount = new wordcount();
        wcount.word_count("some are blue and some black");
    }

    public void word_count(String n) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        if (n != null) {
            String[] splitword = n.split(" ");
            for (String str : splitword) {
                if (map.containsKey(str)) {
                    int count = map.get(str);
                    map.put(str, count + 1);
                } else {
                    map.put(str, 1);
                }
            }
        }
        System.out.println("count:" + map);
    }
}