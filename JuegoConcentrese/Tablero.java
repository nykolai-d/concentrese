package JuegoConcentrese;

import java.util.ArrayList;
import java.util.Random;

public class Tablero {

    public String[][] tablero = new String[3][4];
    public int aciertos = 0;
    public int vidas = 6;

    public String[] naipe = {"AS", "AH", "AD", "AC", "2S", "2H", "2D", "2C", "3S", "3H", "3D", "3C", "4S", "4H", "4D", "4C", "5S", "5H", "5D", "5C", "6S", "6H", "6D", "6C", "7S", "7H", "7D", "7C", "8S", "8H", "8D", "8C", "9S", "9H", "9D", "9C", "10S", "10H", "10D", "10C", "JS", "JH", "JD", "JC", "QS", "QH", "QD", "QC", "KS", "KH", "KD", "KC"};
    public ArrayList<Integer> array1 = new ArrayList();
    public ArrayList<Integer> array2 = new ArrayList();
    public ArrayList<String> vector = new ArrayList();

    public String[][] getTablero() {
        return tablero;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public String[][] repartirCartas() {
        int posicion = 0;
        array1.clear();
        vector.clear();
        array2.clear();
        aciertos = 0;
        vidas = 6;

        for (int i = 0; i < 6; i++) {
            array1.add(generarCartasAleatorias1(array1));
            vector.add(naipe[array1.get(i)]);
            vector.add(naipe[array1.get(i)]);
        }
        for (int i = 0; i < 12; i++) {
            array2.add(generarCartasAleatorias2(array2));
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                tablero[i][j] = vector.get(array2.get(posicion));
                posicion++;
            }
        }
        return tablero;

    }

    public static int generarCartasAleatorias1(ArrayList<Integer> arreglo) {
        Random numeroAleatorio = new Random();
        int n = numeroAleatorio.nextInt(52);
        if (!arreglo.contains(n)) {
            return n;
        } else {
            return generarCartasAleatorias1(arreglo);
        }
    }

    public static int generarCartasAleatorias2(ArrayList<Integer> arreglo) {
        Random numeroAleatorio = new Random();
        int n = numeroAleatorio.nextInt(12);
        if (!arreglo.contains(n)) {
            return n;
        } else {
            return generarCartasAleatorias2(arreglo);
        }
    }

    public static String convertirEtiquetaAString(String etiqueta) {
        String etiquetaString = null;
        switch (etiqueta) {
            case "C":
                etiquetaString = "tréboles";
                return etiquetaString;
            case "H":
                etiquetaString = "corazones";
                return etiquetaString;
            case "D":
                etiquetaString = "diamantes";
                return etiquetaString;
            case "S":
                etiquetaString = "picas";
                return etiquetaString;
            default:
                break;
        }
        return etiquetaString;
    }

}
