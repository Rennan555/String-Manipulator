package strManipulator;

public class Swapper {
	
	public String charArrayToString(char[] arr) {
		
		String res = "";
		int len = arr.length;
		
		for(int i=0;i<len;i++) res += arr[i];
		
		return res;
	}

	public String swap(String str, char in, char out) {
		
		Swapper w = new Swapper();
		char[] temp = str.toCharArray();
		int inLen = temp.length;
		
		for(int i=0;i<inLen;i++) {
			if(temp[i] == out) temp[i] = in;
		}
		
		str = w.charArrayToString(temp);
		
		return str;
	}

}
