//javac --enable-preview --release 12 Latest.java
public class Latest {
	public static void main(String[] args) {
		var a = 10;
		
		int num = 12 % 2;
		
		String message = switch(num) {
			case 0 -> "Even";
			case 1 -> "Odd";
			default -> "WTH";
		};
		
		//Future of Java
		//String result = "Even" if num == 0 else "Odd";
		
		
		// if(num == 0) {
		// 	message = "Even";
		// }
		// else if(num == 1) {
		// 	message = "Odd";
		// }
		// else {
		// 	message = "I am growing mad";
		// }
			
		
		
		// String message = null;
// 		switch(num) {
// 			case 0:
// 			  message = "Even";
// 			  break;
// 			case 1:
// 			  message = "Odd";
// 			  break;
// 			default:
// 			  message = "Huh!! WTH is this then?";
// 		};
		System.out.println(message);
	}
}