class Main {
  public static void main(String[] args) {
    /*
     * Personne[] personnes = new Personne[3];
     * personnes[0] = new IngenieurReseau("Paul");
     * personnes[1] = new IngenieurLogiciel("Philippe");
     * personnes[2] = new IngenieurReseau("Pierre");
     * for (int i = 0; i < personnes.length; i++)
     * personnes[i].afficher();
     */
    Batiment monBatiment = new Batiment("03 rue de la paix", 50);
    System.out.println(monBatiment.toString());

    Maison maMaison = new Maison("03 rue de la paix", 50, 4, 400);
    System.out.println(maMaison.toString());

    Immeuble monImmeuble = new Immeuble("03 rue de la paix", 50, 12);
    System.out.println(monImmeuble.toString());

    Batiment[] monArrayDeBatiments = new Batiment[10];
    monArrayDeBatiments[0] = maMaison;
    monArrayDeBatiments[1] = monImmeuble;

  }
}