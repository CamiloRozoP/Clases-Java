/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;

import java.io.*;

class Repetidos {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escriba algun String : ");
        String s = br.readLine();
        char ch;
        String letras = "";
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch != ' ') {
                letras = letras + ch;
                System.out.println(letras+" iteracion"+i);
            }
            s = s.replace(ch, ' ');
            
        }
        System.out.println("Los valores que se encuentran repetidos son : " + letras);
    }
}
