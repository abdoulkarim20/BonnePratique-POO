package main;

import entities.Fruit;
import entities.Orange;
import entities.Pomme;

public class Main {
    public static void main(String[] args) {
        /**Nb si une class herite d'une class a chaque fois
         * que l'instance de classe et creer l'autre qui a ete creer aussi sera
         * creer implictement.
         * en un mot quand on cree une instance d'une classe il ya instanciation de la class parente
         * Autrement di Si A herite de B et B herite de C
         * Si on cree un objet de A il ya automatiquement creation de objet de B et C*/
//        Pomme pomme=new Pomme(80);
//        Orange orange=new Orange(40);
        /**Le sur caching des objet
         * il peu se faire implicitment exemple
         *          Fruit fruit;
         *         fruit=new Pomme(70);
         *         fruit.affiche();
         *dans ce cas on peut ne peut que appler les meme class qui se trouve dans la class parent et fille*/
        /**Le sur caching des objet
         * il peu se faire explicitment exemple
         *          Fruit fruit;
         *         fruit=(Fruit)new Pomme(56);
         *         ((Pomme)fruit).affichePoids();
         *Dans ce cas on peut appeler toutes les methodes qu'elle se trouve dans la class parent ou fille
         * Donc sur cashing explicite nous permet d'appler particulierement toutes methode de la class fille qui ne se trouve pas dans la class parent*/
        //Les tableau en java je vais declarer un tableau d'objet de fruit
        Fruit[]fruits;
        fruits=new Fruit[3];
        fruits[0]=new Pomme(34);
        fruits[1]=new Orange(15);
        fruits[2]=new Pomme(60);
        for (int i=0;i<fruits.length;i++){
            fruits[i].affiche();
            /*maintant si je veux savoir si un fruit est pomme ou orange la il me faut un test
            * pour cela java possede une methode de nom de instanceof voir exemple*/
//            if (fruits[i] instanceof Pomme){
//                /*d'ou le sur cashing de chaque test*/
//                ((Pomme)fruits[i]).affichePoids();
//            }else if (fruits[i] instanceof Orange){
//                ((Orange)fruits[i]).affichePoids();
//            }
            //Pour palier ce probleme il faut penser a la meilleur facon de faire d'ou la notin de polymorphysme
            //Puisque affichePoids est appeler partout donc on va la mettre dans la class abstrait de fruit comme methode abstrait
            fruits[i].affichePoids();
        }

        /**
         *
         * */
    }
}
