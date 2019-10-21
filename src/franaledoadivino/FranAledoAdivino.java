/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package franaledoadivino;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class FranAledoAdivino {

   public static void main(String[] args) {
        int n = 0,cont = 0;
        int x = (int) (Math.random()*(50-10)+10);
        System.out.print(x);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt(10);
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
}
