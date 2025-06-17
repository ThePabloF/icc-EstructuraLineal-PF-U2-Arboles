package controllers;

import modelo.Node;

public class ArbolBinario {
    private Node root;

    public ArbolBinario(){
        this.root = null;
    }

    public void insert(int value){
        root = insertRec(root, value);
    }

    private Node insertRec(Node padre, int value){
        if (padre==null) {
            return new Node(value);
            
        }
        if (value < padre.getValue()) {
            //Me voy a la izquierda
            padre.setIzquierda(insertRec(padre.getIzquierda(), value));
            
        }else if (value > padre.getValue()) {
            //Me voy a la derecha
            padre.setDerecha(insertRec(padre.getIzquierda(), value));
        }

        return padre;
    }
    private void imprimir(Node nodo){
        if (nodo == null) {
                    
        }
        if (nodo != null) {
                    
            imprimir(nodo.getIzquierda());
            System.out.println(nodo.getValue() + ", ");
            imprimir(nodo.getDerecha());
        }
    }

    public void imprimirArbol(){
        imprimir(root);
        
    }
    
}
