/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bryan.powertable;

/**
 *
 * @author EL GUARDIAN
 */
public class Powertable {

    public static void main(String[] args) {
        System.out.println("N\t10*N\t100*N\t1000*N");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "\t" + 10 * i + "\t" + 100 * i + "\t" + 1000 * i);
        }
    }
}