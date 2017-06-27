
public class Assignment1 {

	public static void main(String[] args) {
		
		String s = "Omar Malik";
		String str = "Hello my name is Omar Malik and I work at GM";
		
			int start = str.indexOf(s);
			
			if (start == -1){
				System.out.println("Not a valid search key");
				
			}else{
				int len = s.length();
				String r = str.substring(start, start+len);
				System.out.println(r+ " - found at position: "+ start);
			}
	}
}
