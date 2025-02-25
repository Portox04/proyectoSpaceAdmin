/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectospaceadmin;

/**
 *
 * @author porto
 */
public class Parqueo {
    
    //IDEA 
    Public class Parqueo {
    private char[][] S1;
    private char[][] S2;
    private char[][] S3;
 
    public Parqueadero() {
        // Inicializar las matrices con sus dimensiones específicas (Se puede utilizar scanner)
        S1 = new char[4][5];  // Nivel 1: 4x5
        S2 = new char[5][5];  // Nivel 2: 5x5
        S3 = new char[6][5];  // Nivel 3: 6x5
        inicializarParqueos();
    }
 
    private void inicializarParqueos() {
        inicializarNivel(S1);
        inicializarNivel(S2);
        inicializarNivel(S3);
    }
 
    private void inicializarNivel(char[][] nivel) {
        for (int i = 0; i < nivel.length; i++) {
            for (int j = 0; j < nivel[0].length; j++) {
                nivel[i][j] = 'O';  // 'O' representa espacio disponible
            }
        }
    }
 
    public void mostrarParqueos() {
        System.out.println("\nNivel S1 (4x5):");
        mostrarNivel(S1);
        System.out.println("\nNivel S2 (5x5):");
        mostrarNivel(S2);
        System.out.println("\nNivel S3 (6x5):");
        mostrarNivel(S3);
    }
 
    private void mostrarNivel(char[][] nivel) {
        System.out.println("    1  2  3  4  5");  // Encabezado de columnas
        for (int i = 0; i < nivel.length; i++) {
            System.out.print((i + 1) + "  ");  // Número de fila
            for (int j = 0; j < nivel[0].length; j++) {
                System.out.print("[" + nivel[i][j] + "] ");
            }
            System.out.println();
        }
    }
 
    public void ocuparEspacio(int nivel, int fila, int columna) {
        char[][] nivelSeleccionado = getNivel(nivel);
        if (nivelSeleccionado == null) {
            System.out.println("Nivel inválido");
            return;
        }
 
        if (validarPosicion(nivelSeleccionado, fila - 1, columna - 1)) {
            if (nivelSeleccionado[fila - 1][columna - 1] == 'O') {
                nivelSeleccionado[fila - 1][columna - 1] = 'X';
                System.out.println("Espacio ocupado exitosamente");
            } else {
                System.out.println("El espacio ya está ocupado");
            }
        } else {
            System.out.println("Posición inválida");
        }
    }
 
    public void liberarEspacio(int nivel, int fila, int columna) {
        char[][] nivelSeleccionado = getNivel(nivel);
        if (nivelSeleccionado == null) {
            System.out.println("Nivel inválido");
            return;
        }
 
        if (validarPosicion(nivelSeleccionado, fila - 1, columna - 1)) {
            if (nivelSeleccionado[fila - 1][columna - 1] == 'X') {
                nivelSeleccionado[fila - 1][columna - 1] = 'O';
                System.out.println("Espacio liberado exitosamente");
            } else {
                System.out.println("El espacio ya está libre");
            }
        } else {
            System.out.println("Posición inválida");
        }
    }
 
    private char[][] getNivel(int nivel) {
        switch (nivel) {
            case 1: return S1;
            case 2: return S2;
            case 3: return S3;
            default: return null;
        }
    }
 
    private boolean validarPosicion(char[][] nivel, int fila, int columna) {
        return fila >= 0 && fila < nivel.length && columna >= 0 && columna < nivel[0].length;
    }
}
    
}
