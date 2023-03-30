package Identidad;

import java.util.Scanner;

/**
 *
 * @author Stilo
 */
public class Puntos {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void CrearPuntos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la posicion del eje x e y del primer objeto: ");
        this.x1 = leer.nextInt();
        this.y1 = leer.nextInt();
        System.out.println("Ingrese la posicion del eje x e y del segundo objeto: ");
        this.x2 = leer.nextInt();
        this.y2 = leer.nextInt();
    }

    public double Calcular() {
        
        
        
        return Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2)));

        
    }
}
