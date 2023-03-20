package View;

import agronegocio.Categoria;
import agronegocio.Cliente;
import agronegocio.Estoque;
import agronegocio.Marca;
import agronegocio.Produto;

public class Main {
    public static void main(String[] args) {
        Marca marca1 = new Marca(1, "Marca 1");
        Categoria categoria1 = new Categoria(1, "Categoria 1");
        Produto produto1 = new Produto(1, "Produto 1", 10.0, marca1, categoria1);
        Cliente cliente1 = new Cliente(1, "Cliente 1", "Rua A, 123", "1111-1111");
        Estoque estoque1 = new Estoque(produto1, 5);

        System.out.println("Produto:");
        System.out.println("Código: " + produto1.getCodigo());
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço: " + produto1.getPreco());
        System.out.println("Marca: " + produto1.getMarca().getNome());
        System.out.println("Categoria: " + produto1.getCategoria().getNome());

        System.out.println("Cliente:");
        System.out.println("Código: " + cliente1.getCodigo());
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Endereço: " + cliente1.getEndereco());
        System.out.println("Telefone: " + cliente1.getTelefone());

        System.out.println("Estoque:");
        System.out.println("Produto: " + estoque1.getProduto().getNome());
        System.out.println("Quantidade: " + estoque1.getQuantidade());
    }
}
