# Validador de Grafo Não Direcionado

Este projeto em Java verifica se uma lista de adjacência representa um **grafo não direcionado válido**, seguindo as seguintes regras:

## ✅ Regras de Validação

- Cada vértice deve estar entre `0` e `V-1`, onde `V` é o total de vértices.
- Não pode haver **auto-loops** (um nó ligado a ele mesmo).
- Não pode haver **arestas duplicadas** (arestas paralelas).
- A representação deve ser **simétrica**: se `A` é vizinho de `B`, então `B` também deve ser vizinho de `A`.

## 📄 Arquivo principal

- `GrafoValidator.java`: contém a função `ehGrafoNaoDirecionadoValido`.
