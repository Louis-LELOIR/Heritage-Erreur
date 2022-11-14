public class Batiment {
  private String adresse;
  private int surfaceHabitable;
  public static double tauxA = 5.6;
  public static double tauxB = 1.5;

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