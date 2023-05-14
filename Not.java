public class Not extends Noeud {
private Noeud operateur;

public Not(Noeud operateur) {
    this.operateur = operateur;
}

public boolean evaluer(boolean[] values) {
    return !operateur.evaluer(values);
}

public String toString() {
    return "(!" + operateur.toString() + ")";
}

public void affArbre() {
    System.out.print("NOT ");
    operateur.affArbre();
}
}