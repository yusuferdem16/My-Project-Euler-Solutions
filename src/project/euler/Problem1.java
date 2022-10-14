/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.euler;

/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.*/
public class Problem1 {

    public static void main(String[] args) {
        int multiplesOfThree = 0;
        int multiplesOfFive = 0;
        int multiplesOfFiftheen = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0) {
                multiplesOfThree = multiplesOfThree + i;
            }
        }
        for (int k = 0; k < 1000; k++) {
            if (k % 5 == 0) {
                multiplesOfFive = multiplesOfFive + k;
            }
        }
        for (int j = 0; j < 1000; j++) {
            if (j % 15 == 0) {
                multiplesOfFiftheen = multiplesOfFiftheen + j;
            }
        }
        System.out.println(multiplesOfFive+multiplesOfThree-multiplesOfFiftheen);
    }
}
