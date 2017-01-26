package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by АНТ on 19.01.2017.
 */
/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/
public class Solution
{

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
       map = createMap();
        //for (Map.Entry<String, String> pair : map.entrySet()) System.out.println(pair);
       map = removeTheFirstNameDuplicates(map);
       for (Map.Entry<String, String> pair : map.entrySet()) System.out.println(pair);


    }
    public static HashMap<String, String> createMap()
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("nam0", "nam0");
        map.put("nam1", "nam1"); //1
        map.put("nam2", "nam2"); //1
        map.put("nam3", "nam3");
        map.put("nam4", "nam3");
        map.put("nam5", "nam4"); //1
        map.put("nam6", "nam5");
        map.put("nam7", "nam6"); //1
        map.put("nam8", "nam5");
        map.put("nam9", "nam0");
        return (HashMap<String, String>) map;
    }

    public static HashMap<String, String> removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy1 = new HashMap<String, String>(map);
        HashMap<String, String> copy2 = new HashMap<String, String>(map);

        Iterator<Map.Entry<String, String>> iterator = copy1.entrySet().iterator();


        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            copy2.remove(pair.getKey());
            if (copy2.containsValue(pair.getValue())) map = removeItemFromMapByValue(map, pair.getValue());
            }
        return  map;
           // System.out.println(pair.getKey() + " - " + pair.getValue());

    }
    public static HashMap<String, String> removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);

        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
        return map;
        //for (Map.Entry<String, String> pair : map.entrySet()) System.out.println(pair);
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getValue().equals(name)) count++;
        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getKey().equals(lastName)) count++;
        }
        return count;
    }
}