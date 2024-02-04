package strManipulator;

public class Splitter {
	
	public String slice(String input, int i) {
		
		char[] temp = input.toCharArray();
		int inLen = temp.length;
		String res = "";
		
		if(i>0 && i<inLen) {
			for(;i<inLen;i++) res += temp[i];
		} else System.err.println("Invalid index");
		
		return res;
	}
	
	public String slice(String input, int i, int j) {
		
		char[] temp = input.toCharArray();
		int inLen = temp.length;
		String res = "";
		
		if(i>0 && i<j && j<inLen) {
			for(;i<j;i++) res += temp[i];
		} else System.err.println("Invalid index");
		
		return res;
	}
	
	public String[] split(String input, int i) {
		
		String[] res = new String[2];
		res[0] = "";
		res[1] = "";
		
		char[] temp = input.toCharArray();
		int inLen = temp.length;
		
		if(i>0 && i<inLen) {
			for(int j=0;j<i;j++) res[0] += temp[j];
			for(int j=i;j<inLen;j++) res[1] += temp[j];
		} else System.err.println("Invalid index");
		
		return res;
	}
	
}
