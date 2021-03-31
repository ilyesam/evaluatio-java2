public class Creature extends Carte{
    private String nom;
    private int nb_degat;
    private int nb_vie;
    public Creature(int cout, String nom, int nb_degat, int nb_vie){
        super(cout);
        this.nom = nom;
        this.nb_degat = nb_degat;
        this.nb_vie = nb_vie;
        System.out.println("une nouvelle creature");
    }
    public void afficher(){
        System.out.println("Une créature" +nom+ " " +nb_degat+ "/" +nb_vie+ " ");
    }
}
