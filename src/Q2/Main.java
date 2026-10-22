package Q2;

public class Main {
    public static void main(String[] args) {
        Book livro = new Book("Clean Code", "123456", 10, "sei la","Não oq e ISBN");
        Magazine revista = new Magazine("Avengers", "654321", 10, 1, "January");
        Magazine revistaTeste = new Magazine("teste", "teste", 0, 0, "teste");
        Cart carrinho = new Cart();

        Book testeTamanho1 = new Book("testeTamanho", "0000000", 10, "teste", "teste");
        Book testeTamanho2 = new Book("testeTamanho", "0000000", 10, "teste", "teste");
        Book testeTamanho3 = new Book("testeTamanho", "0000000", 10, "teste", "teste");
        Book testeTamanho4 = new Book("testeTamanho", "0000000", 10, "teste", "teste");

        carrinho.add(testeTamanho1);
        carrinho.add(testeTamanho2);
        carrinho.add(testeTamanho3);
        carrinho.add(testeTamanho4);

        carrinho.add(livro);
        carrinho.add(revista);
        carrinho.printListItens();
        carrinho.add(revistaTeste);
        carrinho.finish();
        System.out.println(livro);
        livro.returnBook(1);
        System.out.println(livro);
    }
}
