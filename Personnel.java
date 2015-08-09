package domaine;

public abstract class Personnel {

	public abstract float moisTravailles();
	public abstract float nbCongesMois();
	
	public float vacances(){
		return moisTravailles()*nbCongesMois();
	}
	
	
}
