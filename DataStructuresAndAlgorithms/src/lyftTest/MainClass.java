package lyftTest;

public class MainClass {
	private static KeyValueStore keyValueVersion;
	
	public static void main(String[] args) {
		keyValueVersion = new KeyValueStore("key1", 1);
		keyValueVersion.put("key1", 2);
		keyValueVersion.put("key1", 3);
		keyValueVersion.get("key1");		
		keyValueVersion.put("key2",2);	
		keyValueVersion.get("key1",3);
	}

}
