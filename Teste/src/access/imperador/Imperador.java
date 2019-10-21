package access.imperador;

public class Imperador {
	protected void metodoProtected(){
		System.out.println("Protected Method");
	}
	private void metodoPrivate(){
		System.out.println("Private Method");
	}
	public void metodoPublico(){
		System.out.println("Public Method");
	}
	void metodoPackageDefault(){
		System.out.println("Default Method");
	}
}
