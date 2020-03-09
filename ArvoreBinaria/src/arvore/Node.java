
package arvore;
import java.io.*;
import java.util.*;
/**
 * Classe node(Nó), ela ontem o objeto node que representam os dados dos objetos
 * sendo armazenados, também referencia cada um dos filhos de um nó.
 * @author Wasller L. M. Souza
 */
public class Node {
    
    public int keyData;    //Item de dado{chave}
    public String data;       //item de dado
    public Node leftChild;    //filho à esquerda deste nó
    public Node rightChild;   //filho à direita deste nó
    
    public void displayNode(){  //exibe-nos
        System.out.print("{");
        System.out.print(this.keyData);
        System.out.print(",  ");
        System.out.print(this.data);
        System.out.print("}  ");
    }
}
