public class Immeuble extends Batiment {
  private int nbAppart;

  public Immeuble (String adresse, int surfaceHabitable, int nbAppart) {
    super(adresse, surfaceHabitable);
    this.nbAppart = nbAppart;
  }

  @Override
  public String toString(){
    return "Adresse : " + super.getAdresse() + " surface habitable : " + super.getSurfaceHabitable() + "Nombre appartements : " + this.nbAppart;
  }
}