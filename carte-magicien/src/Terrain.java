public class Terrain extends Carte{
    private char couleur;
    public Terrain(char c){
        this.couleur = c;
        System.out.println("new Terrain");
    }
    public void afficher(){

        switch(couleur){
            case 'r':
                System.out.print("un terrain rouge");
                break;
            case 'b':
                System.out.print("un terrain bleu");

                break;
            case 'v':
                System.out.println("un terrain vert");

                break;
            case 'B':
                System.out.print("un terrain blanc");


                break;
            case 'n':
                System.out.print("un terrain noir");

                break;
        }
    }

}
