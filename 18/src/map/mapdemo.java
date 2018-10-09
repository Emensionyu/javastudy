package map;

import java.util.HashMap;
import java.util.*;

public class mapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map =new HashMap<String,String>();
		map.put("1","exo");
		map.put("2", "ret velvet");
		System.out.println(map);
		Set<String > set=map.keySet();
		for(String key:set) {
			System.out.println(key);
		}
		for(String key:set) {
			System.out.println(key+"------"+map.get(key));
		}
				
	
	}

}
