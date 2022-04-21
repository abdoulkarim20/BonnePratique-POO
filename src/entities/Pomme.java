package entities;

public class Pomme extends Fruit{
    public Pomme(int p){
        this.poids=p;
        System.out.println("Creation d'une pomme de :"+poids+" grammes");
    }
    @Override
    public void affiche() {
        System.out.println("C'est une pomme");
    }

    public void affichePoids() {
        System.out.println("C'est une pomme de "+poids+" grammes");
    }
}
