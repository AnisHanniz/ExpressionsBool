public class And extends OperateurBin {
public And(Noeud opGauche, Noeud opDroit) {
super(opGauche, opDroit);
}

public boolean evaluer(boolean[] values) {
    return opGauche.evaluer(values) && opDroit.evaluer(values);
}

protected String symbol() {
    return "&&";
}
}