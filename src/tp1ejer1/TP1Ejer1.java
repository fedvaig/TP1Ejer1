package tp1ejer1;

import utilidades.Menu;

/**
 *
 * @author Federico
 */
public class TP1Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//        System.out.println("Aplicacion de Menu");
//        System.out.println("==================");
//        System.out.println("");
        Menu m = new Menu("Aplicacion de Menú", 4);
        m.agregar(1, "Alta Cliente");
        m.agregar(2, "Modificar CLiente");
        m.agregar(3, "Baja Cliente");
        m.agregar(4, "Configuracion");
        m.ejecutar();
    }

}
