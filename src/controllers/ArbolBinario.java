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
            padre.setDerecha(insertRec(padre.getDerecha(), value));
        }

        return padre;
    }
    private void imprimir(Node nodo){
        if (nodo == null) {
            return;   
        }
        if (nodo != null) {
                    
            imprimir(nodo.getIzquierda());
            System.out.print(nodo.getValue() + ", ");
            imprimir(nodo.getDerecha());
        }
    }

    public void imprimirArbol(){
        imprimir(root);
    }

    public void buscar(int value){
        boolean res = busquedaBinaria(root, value);
        System.err.println(String.valueOf(res));
    }

    public boolean busquedaBinaria(Node nodo, int value){
    if (nodo == null) {
        return false;
    }

    if (nodo.getValue() == value){
        return true;
    } else if (value < nodo.getValue()) {
        return busquedaBinaria(nodo.getIzquierda(), value);
    } else {
        return busquedaBinaria(nodo.getDerecha(), value);
    }
}

    
}
