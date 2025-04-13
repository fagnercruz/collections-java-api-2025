package main.list.operacoesBasicas.desafio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> lista;

    public CarrinhoDeCompras() {
        this.lista = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        this.lista.add(item);
    }
    public void removerItem(Item item) {
        this.lista.remove(item);
    }
    public Double calcularValorTotal() {
        double total = 0.0;
        for (Item item : this.lista) {
            total += item.getPreco() * item.getQuantidade();
        }
        return Math.round(total * 100.0) / 100.0;
    }
    public void exibirLista() {
        if (this.lista.isEmpty()) {
            System.out.println("Lista vazia");
        }
        for (Item item : this.lista) {
            System.out.println("Item:" + item.getNome() + " Preco:" + item.getPreco()
                    + " Quantidade:" + item.getQuantidade());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.exibirLista();
        System.out.println(carrinho.calcularValorTotal());
        System.out.println("---");
        carrinho.adicionarItem(new Item("Macarrão",2.49, 3));
        carrinho.adicionarItem(new Item("Feijão", 6.89, 5));
        carrinho.exibirLista();
        System.out.println(carrinho.calcularValorTotal());
        System.out.println("---");

    }


}
