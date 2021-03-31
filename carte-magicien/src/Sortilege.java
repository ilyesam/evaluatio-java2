public class Sortilege extends Carte{
    private String nom;
    private String description;
    public Sortilege(int cout, String nom, String description){
        super(cout);
        this.nom = nom;
        this.description = description;
        System.out.println("un sortillage est plus");

    }
    public void afficher(){
        System.out.println("Un sortillage" +nom+ "/n ");

    }
}
