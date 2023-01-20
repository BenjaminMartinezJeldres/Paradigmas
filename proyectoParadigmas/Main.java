import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> encryptedMessages = new ArrayList<String>(); // Lista para guardar los mensajes encriptados
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra secreta: ");
        String secretWord = scanner.nextLine();
        String newWord = removeDuplicateLetters(secretWord);
        System.out.println("Palabra sin letras clonadas: " + newWord);

        while (true) {
            System.out.println("1. Encriptar un texto");
            System.out.println("2. Mostrar lista de mensajes encriptados");
            System.out.println("3. Salir");
            int option = scanner.nextInt();
            scanner.nextLine(); // limpiar el buffer
            if (option == 1) {
                System.out.print("Ingresa un texto para encriptar: ");
                String text = scanner.nextLine();
                String encryptedText = encrypt(text, newWord);
                encryptedMessages.add(encryptedText);
                System.out.println("Texto encriptado: " + encryptedText);
            } else if (option == 2) {
                if (encryptedMessages.size() == 0) {
                    System.out.println("No hay mensajes encriptados");
                } else {
                    for (int i = 0; i < encryptedMessages.size(); i++) {
                        System.out.println((i + 1) + ". " + encryptedMessages.get(i));
                    }
                    System.out.print("Ingresa el numero del mensaje a desencriptar: ");
                    int messageNumber = scanner.nextInt();
                    if (messageNumber > 0 && messageNumber <= encryptedMessages.size()) {
                        String decryptedText = decrypt(encryptedMessages.get(messageNumber - 1), newWord);
                        System.out.println("Texto desencriptado: " + decryptedText);
                    } else {
                        System.out.println("Numero invalido");
                    }
                }
            } else {
                break;
            }
        }
    }

    // Funcion para eliminar letras clonadas
    public static String removeDuplicateLetters(String word) {
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            char currentLetter = word.charAt(i);
            if (!newWord.contains(String.valueOf(currentLetter))) {
                newWord += currentLetter;
            }
        }
        return newWord;
    }

    // Funcion para encriptar el texto
    public static String encrypt(String text, String secretWord) {
        char[] textChars = text.toCharArray();
        for (int i = 0; i < textChars.length; i++) {
            int index = secretWord.indexOf(textChars[i]);
            if (index != -1) {
                 if (index == secretWord.length() - 1) {
                    textChars[i] = secretWord.charAt(0);
                } else {
                    textChars[i] = secretWord.charAt(index + 1);
                }
            }
        }
        return new String(textChars);
    }

    // Funcion para desencriptar el texto
    public static String decrypt(String text, String secretWord) {
        char[] textChars = text.toCharArray();
        for (int i = 0; i < textChars.length; i++) {
            int index = secretWord.indexOf(textChars[i]);
            if (index != -1) {
                if (index == 0) {
                    textChars[i] = secretWord.charAt(secretWord.length() - 1);
                } else {
                    textChars[i] = secretWord.charAt(index - 1);
                }
            }
        }
        return new String(textChars);
    }
}