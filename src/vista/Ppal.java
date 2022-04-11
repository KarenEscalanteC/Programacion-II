package vista;

import javax.swing.JOptionPane;
import misclases.Arreglo;

public class Ppal {

    public static void main(String[] args) {
        Arreglo object = new Arreglo();
        int opc;

        do {

            opc = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1.Cargar\n2.Imprimir\n3.Invertir\n4.Ordenar\n5.Salir\nDigite opcion:"));

            switch (opc) {
                case 1:
                    object.cargar();
                    break;
                case 2:
                    object.imprimir();
                    break;
                case 3:
                    object.Invertir();
                    break;
                case 4:
                    object.Ordenar();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                    break;

            }
        } while (opc != 5);
    }
}
