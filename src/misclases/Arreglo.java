package misclases;

import javax.swing.JOptionPane;

public class Arreglo {
    int A[] = new int[5];

    public void cargar() {
        for (int i = 0; i < 5; i++) {
            A[i] = Integer.parseInt(JOptionPane.showInputDialog("A[" + i + "]:"));
        }
    }

    public void imprimir() {
        String salida = "Los datos del arreglo son:\n";
        for (int i = 0; i < 5; i++) {
            salida = salida + A[i] + " ";
        }
        JOptionPane.showMessageDialog(null, salida);
    }

    public void Invertir() {
        int fil = A.length;
        int temporal[] = new int[fil];
        int contador = 0;
        for (int i = fil - 1, x = 0; x < A.length; i--, x++) {
            temporal[contador++] = A[i];
        }
        contador = 0;
        for (int i = 0; i < fil; i++) {
            A[i] = temporal[contador++];
        }
    }

    public void Ordenar() {
        int opcion;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu Ordenar\n1.Burbuja\n2.Secuencial\n"));
        if (opcion == 1) {
            for (int i = 0; i < 5; i++) {
                for (int x = 0; x < 5; x++) {
                    if (A[i] < A[x]) {
                        int r = A[i];
                        A[i] = A[x];
                        A[x] = r;
                    }
                }
            }
        } else if (opcion == 2) {
            for (int i = 0; i < 5; i++) {
                for (int x = 0; x < 5; x++) {
                    if (A[i] > A[x]) {
                        int r = A[i];
                        A[i] = A[x];
                        A[x] = r;
                    }
                }
            }
        }

    }
}


