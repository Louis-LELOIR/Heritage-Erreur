public class Batiment {
  private String adresse;
  private int surfaceHabitable;

  public Batiment(String adresse, int surfaceHabitable) {
    this.adresse = adresse;
    this.surfaceHabitable = surfaceHabitable;
  }

  public String toString(){
    return "Adresse : " + this.adresse + " surface habitable : " + this.surfaceHabitable;
  }

  public String getAdresse(){
    return this.adresse;
  }
  public int getSurfaceHabitable(){
    return this.surfaceHabitable;
  }
}