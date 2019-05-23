/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author moxes
 */
import java.util.Scanner;
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*char[] n = new char[5];//declared array
        n[0] = 'h';
        n[1] = 'e';
        n[2] = 'l';
        n[3] = 'l';
        n[4] = 'o';
        for(int i = 0 ; i<n.length; i++){
            System.out.print(n[i]);
    }
        System.out.println()*/;
    Scanner in = new Scanner(System.in);
    String word = in.next();
    //declared array
    char[] name = new char[word.length()];
    System.out.println(name.length);
    for(int i = 0; i <word.length(); i ++){
    name[i] = word.charAt(i);
    }
    for(int i = name.length-1; i>=0;i--){
        System.out.print(name[i]);
    }
    System.out.println();
    }
    
    
}
