package access.reino;
import access.Vassalo;

public class Rei extends access.imperador.Imperador {
	@Override
	protected void metodoProtected(){
		Vassalo v = new Vassalo();
	}
	
	@Override
	public void metodoPublico(){
		
	}
}
