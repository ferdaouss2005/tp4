package ma.projet.test;

import ma.projet.bean.Article;
import ma.projet.bean.Categorie;

public class TestApp {

    public static void main(String[] args) {

        // Creation des categories
        Categorie c1 = new Categorie("Ordinateur Portable", "O PR");
        Categorie c2 = new Categorie("Ordinateur Poste", "O PO");

        Categorie[] categories = {c1, c2};

        // Creation des articles
        Article a1 = new Article(14, "DELL INSPIRON", c1);
        Article a2 = new Article(4, "SONY VAIO", c1);
        Article a3 = new Article(74, "TERRA", c2);
        Article a4 = new Article(785, "HP Compaq", c2);

        Article[] articles = {a1, a2, a3, a4};

        // Affichage des articles par categorie
        for (int i = 0; i < categories.length; i++) {

            System.out.println(categories[i].getLibelle() + " :");

            for (int j = 0; j < articles.length; j++) {

                if (articles[j].getCategorie().getId()
                        == categories[i].getId()) {

                    System.out.println("  - " + articles[j]);
                }
            }

            System.out.println();
        }
    }
}
