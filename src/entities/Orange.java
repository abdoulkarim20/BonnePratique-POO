package entities;

public class Orange extends Fruit {
    public Orange(int poids){
        /** ca sera a rien de definir super() sans argument car
         * java le fait pour toi*/
        this.poids=poids;
        System.out.println("Creation d'une orange de :"+poids+" grammes");
    }

    @Override
    public void affiche() {
        System.out.println("C'est une Orange");
    }

    public void affichePoids() {
        System.out.println("C'est une Orange de "+poids+" grammes");
    }
}
