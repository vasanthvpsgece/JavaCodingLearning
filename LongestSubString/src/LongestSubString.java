import java.util.HashSet;

class FindLongestSubString {
	
	private String inputString;
	
	FindLongestSubString(String input) {
		
		this.inputString = input;
		
	}
	
	public String findSubString() {
		
		HashSet<Character> localSet = new HashSet<>();
		String longestTillNow = "";
		String longestOverall = "";
		
		for(int i=0; i< this.inputString.length(); i++) {
			for(int j=i; j< this.inputString.length(); j++) {
			
				Character c = this.inputString.charAt(j);
			
				if(localSet.contains(c)) {
					localSet.clear();
					longestTillNow = "";
					break;
				}
			
				localSet.add(c);
				longestTillNow = longestTillNow + c;
			
				if(longestOverall.length() < longestTillNow.length()) {
					longestOverall = longestTillNow;
				}
				
				System.out.println(longestOverall);
			}
		}
		
		return longestOverall;
		
	}
}


public class LongestSubString {

	public static void main(String[] args) {
		
		FindLongestSubString strObj = new FindLongestSubString("Vasanth");
		
		System.out.println(strObj.findSubString());

	}

}
