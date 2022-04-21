package entities;
//Une class abstrait c'est plus souvent pour faire de l'heritage et ne peut etre instancier
public abstract class Fruit {
    protected int poids;
    public Fruit(){
//        System.out.println("La creation d'un fruit");
    }
    public abstract void affiche();
//    {
//        System.out.println("C'est un fruits");
//    }
    public abstract void affichePoids();

}
