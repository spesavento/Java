import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class ListsSetsMaps {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addLast("firstAdded");
        list.addLast("second");
        list.addLast("3rd");
        list.addLast("4th");
        list.addLast("Fifth");
        System.out.println(list);
        System.out.println(list.size());

        //create an iterator
        ListIterator<String> iter = list.listIterator(); 
        //|12345  --> has next - yes, 1
        while(iter.hasNext()) {
            //get element 
            String element = iter.next();  //1|2345  returns 1
            //12|345 //123|45 //1234|5 //12345| 
            System.out.println(element);
            if(element.length() < 4) {
                iter.remove(); //removes the last traversed element
            }
        }

        Map<String, Integer> scores = new TreeMap<>();
        scores.put("Sara", 96);
        scores.put("Joe", 87);
        scores.put("Gerald", 92);
        System.out.println(scores); //treemap sorts by Gerald, Joe, Sara
        int n = scores.get("Joe");
        System.out.println(n);
        System.out.println(scores.keySet());


        Set<String> keySet = scores.keySet();
        for(String key : keySet) {
            int value = scores.get(key);
            System.out.println(key + "->" + value);
        }

    }
}
