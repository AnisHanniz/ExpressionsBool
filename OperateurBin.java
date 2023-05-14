public abstract class OperateurBin extends Noeud {
protected Noeud opGauche;
protected Noeud opDroit;
public OperateurBin(Noeud opGauche, Noeud opDroit) {
    this.opGauche = opGauche;
    this.opDroit = opDroit;
}

public String toString() {
    return "(" + opGauche.toString() + symbol() + opDroit.toString() + ")";
}

protected abstract String symbol();

public void affArbre() {
    System.out.print("(");
    opGauche.affArbre();
    System.out.print(" " + symbol() + " ");
    opDroit.affArbre();
    System.out.print(")");
}
}