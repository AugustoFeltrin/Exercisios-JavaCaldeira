package com.exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Atividade2 {
    public static void main(String[] args) {
        List<Produto> produtos = criarListaDeProdutos();

        // a) Encontre o produto mais caro na lista.
        produtos.stream()
                .max((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
                .ifPresent(p -> System.out.println("Produto mais caro: " + p.getNome()));

        // b) Calcule o preço total de todos os produtos na lista.
        double precoTotal = produtos.stream()
                .mapToDouble(Produto::getPreco)
                .sum();

        System.out.println("Preço total dos produtos: " + precoTotal);

        // c) Filtre os produtos com quantidade superior a 10 e crie uma nova lista com eles.
        List<Produto> produtosQuantidadeMaiorQue10 = produtos.stream()
                .filter(p -> p.getQuantidade() > 10)
                .toList();

        System.out.println("Produtos com quantidade maior que 10: " +
                produtosQuantidadeMaiorQue10.stream()
                        .map(Produto::getNome)
                        .collect(Collectors.joining(" e ")));
    }

    private static List<Produto> criarListaDeProdutos() {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Produto1", 20.0, 5));
        produtos.add(new Produto("Produto2", 30.0, 15));
        produtos.add(new Produto("Produto3", 25.0, 8));
        produtos.add(new Produto("Produto4", 35.0, 12));
        return produtos;
    }
}
