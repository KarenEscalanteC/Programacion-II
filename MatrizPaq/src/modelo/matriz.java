package modelo;

import javax.swing.JOptionPane;

public class matriz {

    public int mat[][] = new int[3][3];

    public matriz() {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = (int) (Math.random() * 99 + 1);
            }
        }
    }

    public matriz(int tec) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("mat[" + i + "" + j + "]:"));

            }
        }
    }

    public matriz(matriz tec, matriz ale) {
        int x[][] = tec.mat;
        int y[][] = ale.mat;
        for (int k = 0; k < y[0].length; k++) {
            for (int i = 0; i < x.length; i++) {
                int suma = 0;
                for (int j = 0; j < x[0].length; j++) {
                    suma += x[i][j] * y[j][k];
                }
                mat[i][k] = suma;
            }
        }
    }

    public void impri() {
        String salida = "los datos del arreglo son:\n";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                salida += " | " + mat[i][j] + " | " + " ";
            }
            salida += "\n";
        }
        JOptionPane.showMessageDialog(null, salida);
    }
}


