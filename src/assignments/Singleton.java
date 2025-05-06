package assignments;

public class Singleton {

	private static volatile Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {

		if (instance == null) {

			synchronized (Singleton.class) {

				if (instance == null) {

					instance = new Singleton();
				}

			}

		}
		return instance;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Singleton.getInstance().hashCode());
		System.out.println(Singleton.getInstance().hashCode());
		

	}

}
