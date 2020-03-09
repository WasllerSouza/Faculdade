package arvore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Wasller L.M. Souza
 */
public class main {

    public static void main(String[] args) throws IOException {
        int value;
        Tree theTree = new Tree();
        theTree.insert(5, "Luziania");
        theTree.insert(3, "Dados");
        theTree.insert(2, "de");
        theTree.insert(4, "campus");
        theTree.insert(1, "Estrutura");
        theTree.insert(7, "sistemas");
        theTree.insert(6, "2019");
        theTree.insert(9, "informacao");
        theTree.insert(8, "de");
        while (true) {
            System.out.println("Digite a primeira letra da ação que deseja, ");
            System.out.println("insert, find, delete ou traverse: ");
            int choice = getChar();
            switch (choice) {
                case 's':
                    theTree.displayTree();
                    break;
                case 'i':
                    System.out.println("Entre com a chave de insert: ");
                    value = getInt();
                    System.out.println("Entre com o valor do No: ");
                    String str = getString();
                    theTree.insert(value, str);
                    break;
                case 'f':
                    System.out.println("Entre com o valor de find(procura): ");
                    value = getInt();
                    Node found = theTree.find(value);
                    if (found != null) {
                        System.out.println("Found: ");
                        found.displayNode();
                        System.out.println("\n");
                    } else {
                        System.out.println("Não consegui encontrar ");
                        System.out.println(value + "\n");
                    }
                    break;
                case 'd': 
                    System.out.println("Entre com o valor de delete: ");
                    value = getInt();
                    boolean didDelete = theTree.delete(value);
                    if(didDelete){
                        System.out.println("Deletado " + value + "\n");
                    }else{
                        System.out.println("Não foi possivel deletar ");
                        System.out.println(value + "\n");
                    }
                    break;
                case 't':
                    System.out.println("Digite o tipo 1, 2 ou 3: ");
                    value = getInt();
                    theTree.traverse(value);
                    break;
                default: 
                    System.out.println("Entrada Invalida\n");
            }
        }
    }
    public static String getString()throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        return str;
    }
    
    public static char getChar()throws IOException{
        String str = getString();
        return str.charAt(0);
    }
    
    public static int getInt()throws IOException{
        String s =getString();
        return Integer.parseInt(s);
    }
}
