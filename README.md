# TP 16 : Les Annotations et la Réflexion en Java (AnnotationsLab)

 Ce projet explore la création, l'utilisation et le traitement des **annotations personnalisées** en Java à l'aide de l'**API Reflection** (`java.lang.reflect`). Il met en œuvre un moteur de validation dynamique ainsi que des exemples complets d'annotations répétables.

---

##  Structure du Projet

```text
AnnotationsLab/
└── src/
    └── com/
        └── example/
            └── annotations/
                ├── Author.java                  # Annotation personnalisée pour l'auteur (Class Level)
                ├── Version.java                 # Annotation pour la version
                ├── MethodInfo.java              # Annotation pour documenter les méthodes
                ├── Bug.java                     # Annotation répétable pour recenser les bugs
                ├── Bugs.java                    # Annotation conteneur pour @Bug
                ├── AnnotatedClass.java          # Classe de test utilisant @Author, @Version et @MethodInfo
                ├── BuggyClass.java              # Classe de test utilisant les annotations répétables @Bug
                ├── AnnotationProcessor.java     # Moteur d'inspection d'annotations via la Réflexion
                ├── StandardAnnotationsDemo.java # Démonstration de @Override, @Deprecated et @SuppressWarnings
                └── validation/
                    ├── NotNull.java             # Annotation de validation : champ non null
                    ├── Length.java              # Annotation de validation : longueur de chaîne
                    ├── Range.java               # Annotation de validation : borne numérique
                    ├── Utilisateur.java         # Modèle avec contraintes de validation
                    ├── Validateur.java          # Moteur de validation fondé sur la Réflexion
                    └── MainValidation.java      # Classe d'exécution des tests de validation
```
<img width="1192" height="357" alt="Affichage5tp16" src="https://github.com/user-attachments/assets/c6dc816f-7673-4eaf-a174-0743af786c69" />
<img width="1157" height="267" alt="Affichage4tp16" src="https://github.com/user-attachments/assets/8b3757ee-13ed-4567-bb92-865353d92943" />
<img width="1167" height="867" alt="Affichage3tp16" src="https://github.com/user-attachments/assets/a41c1c45-7778-4215-88c4-7a48aa4e5c2c" />
<img width="1175" height="441" alt="Affichage2tp16" src="https://github.com/user-attachments/assets/02ddcb7a-ac9e-4408-b447-a8ecffbcf3ad" />
<img width="1332" height="332" alt="Affichage1tp16" src="https://github.com/user-attachments/assets/dd864c54-552e-4b00-b342-d26781770889" />
