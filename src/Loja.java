import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Loja {

    static ArrayList<Item> listDeItens = new ArrayList<>();
    static Item maca = new Item ( 0,  "maçã",  2.50);
    static Item banana = new Item ( 1, "banana",  2.50);
    static Item alface = new Item ( 2,  "alface", 2.50);
    static Item coentro = new Item ( 3,  "coentro",  2.50);
    static Item pera = new Item ( 4, "pera", 2.50);
    static Item cebola = new Item ( 5,  "cebola",  2.50);
    static Item melao = new Item (6,  "melão", 2.50);

    static Scanner entrada = new Scanner(System.in);

    static Carrinho carrinhoDeCompras = new Carrinho();

    public static void main(String[] args) {

        listDeItens.add(maca);
        listDeItens.add(banana);
        listDeItens.add(alface);
        listDeItens.add(coentro);
        listDeItens.add(pera);
        listDeItens.add(cebola);
        listDeItens.add(melao);
        menu();


    }

    public static void menu(){
        System.out.println(" Bem vindo a Frut mania");
        System.out.println("-------");
        System.out.println(" 1 - Comprar");
        System.out.println("2 ver carrinho");
        System.out.println("3 - sair");
        System.out.println("-------");
        int opcao = entrada.nextInt();

        switch (opcao){
            case 1:
        comprar ();
        break;
            case 2:
            carrinhoDeCompras.listar();
            menu();

        break;
            case 3:
        System.out.println("Obrigado por usar nossa loja");
        entrada.close();
        break;
            default:
        System.out.println("Digite um valor válido!");
        menu();

    }

}
    private static void comprar() {
        for (Item item : listDeItens) {
            System.out.println (item.getId() + " " + item.getNome() + " seu preço é R$" + item.getPreco());


        }
        System.out.print("Digite o número do item : ");
        int numeroItem = entrada. nextInt();
        System.out.print("\nDigite a quantidade");
        int quantidade = entrada.nextInt();

        carrinhoDeCompras.adicionarItem(listDeItens.get(numeroItem), quantidade);
        menu();

    }
}
