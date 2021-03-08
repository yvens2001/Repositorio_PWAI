//Yvens Friedrich de Oliveira RA:1201900155
package cifraDeCesar;

import java.util.Scanner;

public class CifraDeCesar {

private static Scanner entrada;

public static String encriptar(int chave, String texto) {
    StringBuilder textoCifrado = new StringBuilder();
    int tamanhoTexto = texto.length();

    for (int c = 0; c < tamanhoTexto; c++) {
        int letraCifradaASCII = ((int) texto.charAt(c)) + chave;

        while (letraCifradaASCII > 126) {
            letraCifradaASCII -= 94;
        }

        textoCifrado.append((char) letraCifradaASCII);
    }

    return textoCifrado.toString();
}

public static String decriptar(int chave, String textoCifrado) {
    StringBuilder texto = new StringBuilder();
    int tamanhoTexto = textoCifrado.length();

    for (int c = 0; c < tamanhoTexto; c++) {
        int letraDecifradaASCII = ((int) textoCifrado.charAt(c)) - chave;

        while (letraDecifradaASCII < 32) {
            letraDecifradaASCII += 94;
        }

        texto.append((char) letraDecifradaASCII);
    }

    return texto.toString();
}

public static void main(String[] args) {
        entrada = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = entrada.nextLine();
        int chave = 3;

        String textoCriptografado = encriptar(chave, texto);

        System.out.println("\nTexto criptografado: " + textoCriptografado);
}
}

