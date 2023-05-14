public class Variable extends Noeud {
private char nom;
private int index;
private double contenu;

public Variable(char nom, int index,double contenu) {
    this.nom = nom;
    this.index = index;
    this.contenu = contenu;
}

public boolean evaluer(boolean[] values) {
    return values[index];
}

public String toString() {
    return String.valueOf(nom);
}

public void affArbre() {
    System.out.print(nom);
    //+";"+contenu
}
}