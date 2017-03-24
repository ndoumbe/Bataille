


public class Paquet {
	private int nbCarte;
    private  Carte[] carte ;
	public Paquet(int nbCarte) {
	
	}
	public  Paquet(Carte[] carte,int nbCarte){
		this.nbCarte=nbCarte;
		this.carte= new Carte[nbCarte];
	}
	public boolean estVide(){
		if(this.carte.length==0)
		return true;
		return false;
	  }
	public void melanger(){
		
	    }
		
	
   public void distribuer(Carte c){
		
	}

}
