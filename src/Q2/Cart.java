package Q2;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Publication> listItens = new ArrayList<>();

    public void add(Publication material) {

        if (material.getQuantity() <= 0) {
            System.out.println("Material indisponível");
            return;
        }

        if (listItens.size() >= 5) {
            System.out.println("Carrinho cheio");
            return;
        }

        listItens.add(material);
    }

    public void remove(Publication material) {
        listItens.remove(material);
    }

    public void printListItens() {
        for (Publication item : listItens) {
            System.out.println(item);
        }
    }

    public void finish() {
        if (listItens.isEmpty()) {
            System.out.println("Carrinho vazio");
            return;
        }

        for (Publication item : listItens) {
            item.lendBook(1);
        }

        listItens.clear();
    }
}
