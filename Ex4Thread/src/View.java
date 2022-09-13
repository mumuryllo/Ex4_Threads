
public class View {

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++){
			Thread sapo = new Controller(i);
			sapo.start();
		}
	}

}
