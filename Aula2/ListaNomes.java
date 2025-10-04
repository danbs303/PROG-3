import java.util.ArrayList;
import java.util.Iterator;

public class ListaNomes {
    ArrayList<String> nomes = new ArrayList<String>();

    public void adicionarNome(String nome) {
        nomes.add(nome);
    }
    public void exibirNomes() {
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void removerNome(String nome) {
        nomes.remove(nome);
    }
    public static void main(String[] args) {
        ListaNomes lista = new ListaNomes();
        lista.adicionarNome("Carimbo Miguel");
        lista.adicionarNome("Xerox Maria");
        lista.adicionarNome("Xerolaine");
        lista.exibirNomes();
        lista.removerNome("Xerox Maria");
        System.out.println("Após remover Xerox Maria:");
        lista.exibirNomes();
    }
}
