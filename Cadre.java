package domaine;

public abstract class Cadre extends Personnel {

	@Override
	public float nbCongesMois() {
		return 1.5f;
	}
	
	@Override
	public float moisTravailles() {
		return 12;
	}

	public abstract int bonusAnnuel();
}
