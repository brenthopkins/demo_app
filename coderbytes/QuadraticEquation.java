package coderbytes;

public class QuadraticEquation {
    public static Roots findRoots(double a, double b, double c) {
    	double root1 = 0;
    	double root2 = 0;
    	root1 = ((-1*b) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
    	root2 = ((-1*b) - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
    	
    	Roots target = new Roots(root1, root2);
    	return target;
    }
    
    public static void main(String[] args) {
        Roots roots = QuadraticEquation.findRoots(2, 10, 8);
        System.out.println("Roots: " + roots.x1 + ", " + roots.x2);		// 2 roots -1, -4
        if (Double.isNaN(roots.x1) && Double.isNaN(roots.x2)) {
        	System.out.println("Equations has no real roots");
        } else if (roots.x1 == roots.x2) {
        	System.out.println("Equations has one real root");
        } else {	
        	System.out.println("Equations has two real roots");
        }
        Roots roots1 = QuadraticEquation.findRoots(1, 0, -1);			// 2 roots 1, -1
        System.out.println("Roots: " + roots1.x1 + ", " + roots1.x2);
        if (Double.isNaN(roots1.x1) && Double.isNaN(roots1.x2)) {
        	System.out.println("Equations has no real roots");
        } else if (roots1.x1 == roots1.x2) {
        	System.out.println("Equations has one real root");
        } else {	
        	System.out.println("Equations has two real roots");
        }
        Roots roots2 = QuadraticEquation.findRoots(1,0,0);				// 1 root  0
        System.out.println("Roots: " + roots2.x1 + ", " + roots2.x2);
        if (Double.isNaN(roots2.x1) && Double.isNaN(roots2.x2)) {
        	System.out.println("Equations has no real roots");
        } else if (roots2.x1 == roots2.x2) {
        	System.out.println("Equations has one real root");
        } else {	
        	System.out.println("Equations has two real roots");
        }
        Roots roots3 = QuadraticEquation.findRoots(1,0,1);				// no root 
        System.out.println("Roots: " + roots3.x1 + ", " + roots3.x2);
        if (Double.isNaN(roots3.x1) && Double.isNaN(roots3.x2)) {
        	System.out.println("Equations has no real roots");
        } else if (roots3.x1 == roots3.x2) {
        	System.out.println("Equations has one real root");
        } else {	
        	System.out.println("Equations has two real roots");
        }
    }
}

class Roots {
    public final double x1, x2;

    public Roots(double x1, double x2) {         
        this.x1 = x1;
        this.x2 = x2;
    }
}