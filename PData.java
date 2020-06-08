package PlenaDataAssessment;
import java.util.*;

public class PData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			String input = sc.nextLine();
			char[] inputArray = input.toCharArray();
			Map<String, String> occurences = new LinkedHashMap<>();
			for(char a: inputArray) {
				String key = String.valueOf(a);
				if(!occurences.containsKey(key.toLowerCase())) {
					occurences.put(key.toLowerCase(), key);
				}else {
					occurences.put(key.toLowerCase(), occurences.get(key.toLowerCase()) + key);
				}
			}
			List<String> values = new ArrayList<>(occurences.values());
			Map<Integer, String> countString = new LinkedHashMap<>();
			for(String value: values) {
				Integer length = value.length();
				if(!countString.containsKey(length)) {
					countString.put(length, value);
				} else {
					countString.put(length, countString.get(length) + value);
				}
			}
			Set<Integer> keys = new HashSet<>(countString.keySet());
			for(Integer key: keys) {
				System.out.print(countString.get(key));
			}
		}
	}
		
			
	}


