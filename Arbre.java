public class Arbre<T> {

    private Node<T> racine;
    public Arbre(T data){
        racine = new Node(data);
    }

    private static class Node<T>{
        T data;

        Node<T> nG,nD;

        public Node(T data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Arbre<String> monArbre = new Arbre<>("7)");
        monArbre.addLeft("4");
        monArbre.addRight("13"); 
    }
}