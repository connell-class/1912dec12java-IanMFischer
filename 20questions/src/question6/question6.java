package question6;

import java.util.HashMap;
import java.util.Map;

public class question6 {
	public static void main(String[] args) {
		wordCount("one fish two fish red fish blue fish");
	}
	public static Map<String, Integer> wordCount(String string) {
		String arr[]= string.split("\\W+");
		Map <String, Integer> map = new HashMap<String, Integer>();
		int i = 0;
		
		while (i !=arr.length)
		{
			if (map.containsKey(arr[i])==false)
				{
					map.put(arr[i],1);

				}
				else 
				{
					int oldval = map.get(arr[i]);
					int newval = oldval+1;
					map.put(arr[i],newval);

				}
				i++;
		}
		System.out.println(map);
		return map;
	}
}
