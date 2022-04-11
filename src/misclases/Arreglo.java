package misclases;

import javax.swing.JOptionPane;

public class Arreglo {
    int V[] = new int[5];

    public void cargar() {
        for (int i = 0; i < 5; i++) {
            V[i] = Integer.parseInt(JOptionPane.showInputDialog("V[" + i + "]:"));
        }
    }

    public void imprimir() {
        String salida = "Los datos del arreglo son:\n";
        for (int i = 0; i < 5; i++) {
            salida = salida + V[i] + " ";
        }
        JOptionPane.showMessageDialog(null, salida);
    }

    public void Invertir() {
        int filas = V.length;
        int temporal[] = new int[filas];
        int contador = 0;
        for (int i = filas - 1, x = 0; x < V.length; i--, x++) {
            temporal[contador++] = V[i];
        }
        contador = 0;
        for (int i = 0; i < filas; i++) {
            V[i] = temporal[contador++];
        }
    }

    public void Ordenar() {
        int opcion;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu Ordenar\n1.Burbuja\n2.Secuencial\n"));
        if (opcion == 1) {
            for (int i = 0; i < 5; i++) {
                for (int x = 0; x < 5; x++) {
                    if (V[i] < V[x]) {
                        int r = V[i];
                        V[i] = V[x];
                        V[x] = r;
                    }
                }
            }
        } else if (opcion == 2) {
            for (int i = 0; i < 5; i++) {
                for (int x = 0; x < 5; x++) {
                    if (V[i] > V[x]) {
                        int r = V[i];
                        V[i] = V[x];
                        V[x] = r;
                    }
                }
            }
        }

    }
}


