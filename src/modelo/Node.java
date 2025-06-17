package modelo;

public class Node {
    private int value;
    Node derecha;
    Node izquierda;
    public Node(int value){
        this.value=value;
        this.derecha= null;
        this.izquierda= null;
    
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public Node getDerecha() {
        return derecha;
    }
    public void setDerecha(Node derecha) {
        this.derecha = derecha;
    }
    public Node getIzquierda() {
        return izquierda;
    }
    public void setIzquierda(Node izquierda) {
        this.izquierda = izquierda;
    }
    
}
