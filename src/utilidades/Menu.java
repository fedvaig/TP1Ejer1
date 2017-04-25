package utilidades;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class Menu {

    private String titulo;
    private Item[] opciones;
    private int cantOp;
    private Scanner leer;
    protected int op;    

    public Menu() {
        titulo = "Sin Opciones";
        cantOp = 1;
        opciones = new Item[cantOp];
        opciones[0] = new Item("Salir");
        leer = new Scanner(System.in);
    }

    public Menu(String titulo, int elementos) {
        this.titulo = titulo;
        this.cantOp = elementos + 1;
        opciones = new Item[this.cantOp];
        opciones[0] = new Item("Salir");
        leer = new Scanner(System.in);
    }

    public void ejecutar() {

//        Scanner leer = new Scanner(System.in);
//        do {
//            dibujarMenu();
//            op = leer.nextInt();      
//        } while (op != 0);
        dibujarMenu();
        op = leer.nextInt();
    }

    public void agregar(int pos, String nomItem) throws Exception {
        if (pos > 0 && pos < cantOp) {
            opciones[pos] = new Item(nomItem);
        } else {
            throw new Exception("Posicion no utilizada.");
        }
    }

    private void dibujarMenu() {
        // dibujar el titulo
        System.out.println("           " + titulo);
        System.out.print("           ");
        for (int i = 0; i < titulo.length(); i++) {
            System.out.print("=");
        }
        System.out.println("");
        System.out.println("");
        // dibujar el menu empieza desde la Segunda posisción
        for (int i = 1; i < opciones.length; i++) {
            System.out.print(i + " - ");
            opciones[i].visualizar();
        }
        // Dibujo la Primera posición
        System.out.print("0 - ");
        opciones[0].visualizar();
        System.out.println();
        System.out.print("Opción: ");
    }
}
