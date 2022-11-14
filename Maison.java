public class Maison extends Batiment {
  private int nbPieces;
  private int surfaceJardin;

  public Maison(String adresse, int surfaceHabitable, int nbPieces, int surfaceJardin) {
    super(adresse, surfaceHabitable);
    this.nbPieces = nbPieces;
    this.surfaceJardin = surfaceJardin;
  }

  @Override
  public String toString() {
    return "Adresse : " + super.getAdresse() + " surface habitable : " + super.getSurfaceHabitable() + " Nombre pieces" + this.nbPieces + " Surface Jardin : " + this.surfaceJardin;
  }

  public int getSurfaceJardin(){
    return this.surfaceJardin;
  }
}