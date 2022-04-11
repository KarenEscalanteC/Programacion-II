package vista;

import javax.swing.JOptionPane;
import modelo.matriz;

public class ppal {

    public static void main(String[] args) {

        matriz obj1 = null, obj2 = null, obj3 = null;
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Menú Principal\n1.Cargar\n2.Imprimir\n3.Salir"));
            switch (op) {
                case 1:
                    do {
                        op = Integer.parseInt(JOptionPane.showInputDialog("Menú Cargar\n1.Aleatorio\n2.Teclado\n3.Multiplicar\n4.Volver"));
                        switch (op) {
                            case 1:
                                obj1 = new matriz();
                                break;
                            case 2:
                                obj2 = new matriz(1);
                                break;
                            case 3:
                                obj3 = new matriz(obj1, obj2);
                                break;
                        }
                    } while (op != 4);
                    break;
                case 2:
                    do {
                        op = Integer.parseInt(JOptionPane.showInputDialog("Menú Imprimir\n1.Matriz aleatorio\n2.Matriz teclado\n3.Matriz multiplicaciÃ³n\n4.Volver"));
                        switch (op) {
                            case 1:
                                obj1.impri();
                                break;
                            case 2:
                                obj2.impri();
                                break;
                            case 3:
                                obj3.impri();
                                break;
                        }

                    } while (op != 4);
                    break;
            }
        } while (op != 3);
    }
}
