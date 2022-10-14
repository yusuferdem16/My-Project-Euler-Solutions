/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.euler;

/*The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {

    public static void main(String[] args) {
        int i;
        long number = 600851475143L;
        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number = number / i;
                System.out.println(i);
            }
        }

    }

}
