public class Jeu {
    private int nbCartes;
    private Carte[] cartes;

    public Jeu(int nb){
        nbCartes = nb;
        cartes = new Carte[nb];
        System.out.println("on change de main");
    }
    public void joue() {
        System.out.println("Je joue une carte...");
        int i = 0;
        while((cartes[i] == null) && i< nbCartes){
            i++;
        }
        if((i< nbCartes) &&(cartes[i] == null)){
            System.out.println("La carte jouée est :");
            cartes[i].afficher();
            cartes[i] = null;
        } else {
            System.out.println("Plus de cartes");
        }
    }
    public void piocher(Carte carte){
        int i = 0;
        while((i< nbCartes) && (cartes[i] != null)){
            i++;
        }
        if(i< nbCartes){
            cartes[i] = carte;
        } else {
            System.out.println("nombre maximal de carte est atteint");
        }
    }
    public void afficher(){
        for(int i = 0; i< nbCartes;i++){
            if(cartes[i] != null){
                cartes[i].afficher();
            }
        }
    }
}
