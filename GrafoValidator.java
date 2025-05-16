import java.util.*;

public class GrafoValidator {

    public static boolean ehGrafoNaoDirecionadoValido(List<List<Integer>> grafo) {
        int V = grafo.size();

        for (int no = 0; no < V; no++) {
            Set<Integer> vizinhos = new HashSet<>();

            for (int adj : grafo.get(no)) {
                if (adj < 0 || adj >= V) return false;
                if (adj == no) return false;
                if (!vizinhos.add(adj)) return false;
                if (!grafo.get(adj).contains(no)) return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Grafo válido
        List<List<Integer>> grafoValido = new ArrayList<>();
        grafoValido.add(Arrays.asList(1, 2)); // 0
        grafoValido.add(Arrays.asList(0, 2)); // 1
        grafoValido.add(Arrays.asList(0, 1)); // 2

        // Grafo inválido (auto-loop em 1)
        List<List<Integer>> grafoInvalido = new ArrayList<>();
        grafoInvalido.add(Arrays.asList(1));    // 0
        grafoInvalido.add(Arrays.asList(1, 2)); // 1
        grafoInvalido.add(Arrays.asList(1));    // 2

        System.out.println("Grafo válido? " + ehGrafoNaoDirecionadoValido(grafoValido));
        System.out.println("Grafo inválido? " + ehGrafoNaoDirecionadoValido(grafoInvalido));
    }
}
