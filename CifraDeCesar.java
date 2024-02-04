package strManipulator;
public class CifraDeCesar {
	
	static CifraDeCesar e = new CifraDeCesar();
	
	public String decode(int n,String code) {
		
		char[] lista = code.toCharArray();
		for(int i=0;i<lista.length;i++) {
			if(lista[i]>90-n) {
				lista[i] = (char) (lista[i] - 26 + n); // -21 = -90+64+N
			} else if(lista[i] == 32) {
				// para os espaços
			} else {
				lista[i] = (char) (lista[i] + n);
			}
		}
		return new String(lista);
	}
	
	public static void main(String[] args) {
		System.out.println(e.decode(1,"LZQHZ")); // apenas letras maiúsculas
	}
}

// A-65 -> Z-90