package Arbre;
public class Arbre<T> {

    private Node<T> racine;
    
    public Arbre(T data){
        racine = new Node(data);
    }

    public void addLeft(T data){
        racine.addLeft(data);
    }

    public void addRight(T data){
        racine.addRight(data);
    }

    private static class Node<T>{
        T data;

        Node<T> nG,nD;

        public String prefixe(){
            StringBuilder sb = new StringBuilder();
            if(data!=null){
                sb.append(data.toString());
            }
            if(nG!=null){
                sb.append(nG.prefixe());
            }
            if(nD!=null){
                sb.append(nD.prefixe());
            }
            return sb.toString();
        }

        public void addLeft(T data){
            nG = new Node(data);
        }

        public void addRight(T data){
            nD = new Node(data);
        }

        public String toString(){
            return data.toString();
        }

        public Node(T data){
            this.data = data;
        }

        public String calcul(String expression){
            if(data.equals("+")){
                return String.valueOf(Integer.parseInt(nG.calcul()) + Integer.parseInt(nD.calcul()));
            } else if(data.equals("-")){
                return String.valueOf(Integer.parseInt(nG.calcul()) - Integer.parseInt(nD.calcul()));
            } else if(data.equals("*")){
                return String.valueOf(Integer.parseInt(nG.calcul()) * Integer.parseInt(nD.calcul()));
            } else if(data.equals("/")){
                return String.valueOf(Integer.parseInt(nG.calcul()) / Integer.parseInt(nD.calcul()));
            } else {
                return data.toString();
            }
        }
        public static void main(String[] args) {
        Arbre<String> monArbre = new Arbre<>("7");
        monArbre.addLeft("4");
        monArbre.addRight("13");
        System.out.println(monArbre.calcul("52+83")); 
    }
    }
   
}