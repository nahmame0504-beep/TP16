package com.example.annotations.validation;

import java.util.List;

public class MainValidation {

    public static void main(String[] args) {
        // Test 1 : Utilisateur avec des données invalides (Nom court, email null, âge hors limites)
        Utilisateur u1 = new Utilisateur("Al", null, 15);

        System.out.println("=== Test de validation pour Utilisateur 1 ===");
        List<String> erreurs = Validateur.valider(u1);

        if (erreurs.isEmpty()) {
            System.out.println("L'utilisateur est valide !");
        } else {
            System.out.println("Erreurs trouvées :");
            for (String erreur : erreurs) {
                System.out.println(" - " + erreur);
            }
        }

        // Test 2 : Utilisateur valide
        Utilisateur u2 = new Utilisateur("Jean Dupont", "jean.dupont@example.com", 25);

        System.out.println("\n=== Test de validation pour Utilisateur 2 ===");
        List<String> erreurs2 = Validateur.valider(u2);

        if (erreurs2.isEmpty()) {
            System.out.println("L'utilisateur est valide !");
        } else {
            System.out.println("Erreurs trouvées :");
            for (String erreur : erreurs2) {
                System.out.println(" - " + erreur);
            }
        }
    }
}