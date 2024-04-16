/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 * programa que coge una matriz bidimensional de tamaño 9x9,llena cada elemento de la matriz
 * con números aleatorios en el rango de 500 a 900,
 * y devuelve en pantalla el número máximo,minino y la media aritmetica de los elementos en la diagonal principal
 *
 * @author Laura
 * @version 1.0
 */
import java.util.Random;

public class Ejercicio12       
{
    public static void main(String[]args){
        Random random= new Random();
  //declaración e inicialización de la matriz de 9x9
        int[][] arrays= new int[9][9];
 // Llenar la matriz con números aleatorios en el rango de 500 a 900 e imprimirlos
        for(int a=0;a<arrays.length;a++){
            for(int r=0;r<arrays[a].length;r++){
                arrays[a][r]=random.nextInt(500,901); //rango de [500 a 900]
                System.out.printf("%4d ",arrays[a][r]);//imprimir en elemento de la matriz
            }
            System.out.println();//salto de línea en cada fila
        }
        //Llamar al método mostrar para mostrar la diagonal principal de la matriz
        mostrar(arrays);
        //Llamar al método minYMax para encontrar el mínimo, máximo y la media aritmética de la diagonal principal
        minYMax(arrays);
    }
     // Método para mostrar la diagonal principal de la matriz
    public static void mostrar(int[][]arrays){
        int mindig= Math.min(arrays.length,arrays[0].length);
        for(int m=mindig-1;m>=0;m--){
                System.out.printf("Diagonal: %d%n",arrays[m][m]);// Imprimir elementos de la diagonal
        }
    }
     // Método para encontrar el mínimo, máximo y la media aritmética de la diagonal principal
    public static void minYMax(int[][]arrays){
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        int suma=0;
        for(int q=0;q<Math.min(arrays.length,arrays[0].length)/2;q++){
            suma+= arrays[q][q];
            if(arrays[q][q]<min){
                min=arrays[q][q];
            }
            if(arrays[q][q]>max){
                max=arrays[q][q];
            }
        }
        double mAr=(double)suma/Math.min(arrays.length,arrays[0].length);
        // Imprimir el mínimo, máximo y la media aritmética de la diagonal principal
        System.out.printf("MÍNIMO: %d, MÁXIMO:%d,Media Aritmética: %.2f%n",min,max,mAr);
    }
}
