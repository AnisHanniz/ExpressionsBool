public class EB {
    private Noeud racine;
    
    public EB(Noeud racine) {
        this.racine = racine;
    }
    
    public boolean evaluer(boolean[] values) {
        return racine.evaluer(values);
    }
    
    public String toString() {
        return racine.toString();
    }
    
    public void affArbre() {
        racine.affArbre();
    }
}