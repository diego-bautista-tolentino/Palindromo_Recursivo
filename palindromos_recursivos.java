/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura.de.datos.practicas;

/**
 *
 * @author Diego
 */
public class palindromos_recursivos {
    //metodo publico (Wrapper)
    public static boolean esPalindromo(String palabra) {
        return esPalindromo(palabra, 0, palabra.length() - 1);
    }
    
    //metodo privado (Recursivo)
    private static boolean esPalindromo(String palabra, int inicio, int fin) {
        if (inicio >= fin) {
            return true;
        }
        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }
        return esPalindromo(palabra, inicio + 1, fin - 1);
    }
       public static void main(String[] args) {
        System.out.println(esPalindromo("reconocer"));
        System.out.println(esPalindromo("radar"));
        System.out.println(esPalindromo("java"));
    }   
}
