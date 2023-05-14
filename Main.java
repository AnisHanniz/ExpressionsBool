import java.util.*;

public class Main {
public static void main(String[] args) {
    
boolean[] valeurs = {false, true, false};


Variable a = new Variable('A', 0,99);
Variable b = new Variable('B', 1,90);
Variable c = new Variable('C', 2,20);
Variable d = new Variable('D', 4,20);
Noeud notA = new Not(a);
Noeud notC = new Not(c);
Noeud notD = new Not(d);
//Noeud notB = new Not(b);
Noeud and1 = new And(b, c);
Noeud or1 = new Or(notA,and1);
Noeud racine = new And(or1, notC);
//Noeud or2 = new Or(notB, c);
//Noeud racine = new And(or1, or2);
EB expression1 = new EB(racine);
expression1.affArbre();
System.out.println("\n");
System.out.println("E : Evaluation avec les valeurs " + Arrays.toString(valeurs) + ": " + expression1.evaluer(valeurs));


/////////////////////////
/*
Noeud racine2 = new Or(a, notD);
EB expression2 = new EB(racine2);
System.out.println("\n");
System.out.println("\n");
expression2.affArbre();
System.out.println("\n");
System.out.println("G : Evaluation avec les valeurs " + Arrays.toString(valeurs) + ": " + expression2.evaluer(valeurs));
}*/
}}