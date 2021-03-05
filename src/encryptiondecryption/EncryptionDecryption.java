
package encryptiondecryption;

import java.util.Scanner;
import java.io.*;

public class EncryptionDecryption {

    
    public static void main(String[] args) throws IOException {
     //variables
        Scanner probe = new Scanner(new File("F:\\11th Grade\\Computer Programming\\DecryptionProject\\NonEncrypted.txt"));
        PrintWriter pen = new PrintWriter(new File("F:\\11th Grade\\Computer Programming\\DecryptionProject\\Encrypt.txt"));
        String file;
        
        file = probe.nextLine();
        
        for(int i = 0; i < file.length(); i++){
            switch(file.charAt(i)){
                case ' ': pen.print("Toast");
                    break;
                case 'A': pen.print("Pineapple");
                    break;
                case 'B': pen.print("Tree");
                    break;
                case 'C': pen.print("Movie");
                    break;
                case 'D': pen.print("Elephant");
                    break;
                case 'E': pen.print("Sugar");
                    break;
                case 'F': pen.print("Telegraph");
                    break;
                case 'G': pen.print("Fun");
                    break;
                case 'H': pen.print("Prison");
                    break;
                case 'I': pen.print("Era");
                    break;
                case 'J': pen.print("Joke");
                    break;
                case 'K': pen.print("Smooth");
                    break;
                case 'L': pen.print("Plain");
                    break;
                case 'M': pen.print("T-Rex");
                    break;
                case 'N': pen.print("Flute");
                    break;
                case 'O': pen.print("North");
                    break;
                case 'P': pen.print("Cucumber");
                    break;
                case 'Q': pen.print("Shame");
                    break;
                case 'R': pen.print("Music");
                    break;
                case 'S': pen.print("Peace");
                    break;
                case 'T': pen.print("Soup");
                    break;
                case 'U': pen.print("Buffalo");
                    break;
                case 'V': pen.print("Cat");
                    break;
                case 'W': pen.print("Dog");
                    break;
                case 'X': pen.print("Moose");
                    break;
                case 'Y': pen.print("Envelope");
                    break;
                case 'Z': pen.print("Catastrophe");
                    break;
                case 'a': pen.print("11001");
                    break;
                case 'b': pen.print("11010");
                    break;
                case 'c': pen.print("00001");
                    break;
                case 'd': pen.print("00010");
                    break;
                case 'e': pen.print("00011");
                    break;
                case 'f': pen.print("00100");
                    break;
                case 'g': pen.print("00101");
                    break;
                case 'h': pen.print("00110");
                    break;
                case 'i': pen.print("00111");
                    break;
                case 'j': pen.print("01000");
                    break;
                case 'k': pen.print("01001");
                    break;
                case 'l': pen.print("01010");
                    break;
                case 'm': pen.print("01011");
                    break;
                case 'n': pen.print("01100");
                    break;
                case 'o': pen.print("01101");
                    break;
                case 'p': pen.print("01110");
                    break;
                case 'q': pen.print("01111");
                    break;
                case 'r': pen.print("10000");
                    break;
                case 's': pen.print("10001");
                    break;
                case 't': pen.print("10010");
                    break;
                case 'u': pen.print("10011");
                    break;
                case 'v': pen.print("10100");
                    break;
                case 'w': pen.print("10101");
                    break;
                case 'x': pen.print("10110");
                    break;
                case 'y': pen.print("10111");
                    break;
                case 'z': pen.print("11000");
                    break;
                case '1': pen.print("A");
                    break;
                case '2': pen.print("D");
                    break;
                case '3': pen.print("G");
                    break;
                case '4': pen.print("J");
                    break;
                case '5': pen.print("M");
                    break;
                case '6': pen.print("P");
                    break;
                case '7': pen.print("S");
                    break;
                case '8': pen.print("U");
                    break;
                case '9': pen.print("W");
                    break;
                case '0': pen.print("Y");
                    break;
                default: pen.print (file.charAt(i));
                    break;
            }
            pen.print(" ");
        }
        
        System.out.println("Encryption Complete!! :) Have a nice day!");
        
        pen.close();
        
    }
    
}
