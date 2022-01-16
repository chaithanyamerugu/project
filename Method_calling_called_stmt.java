package methods;

public class Method_calling_called_stmt {
 static void watch() {
	System.out.println("from watch...");
	System.out.println("watching birds..");
}
	 static void listen() {
		System.out.println("listining to music");
	}
public static void main(String[] args) {
		watch();
		listen();
	}

}
