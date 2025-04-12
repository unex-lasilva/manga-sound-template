package br.com.mangarosa.collections;

public class No {

    private Object value;
    private No prox;

    public No(){
    }

    public No(Object value){
        this.value = value;
        this.prox = null;
    }

    public Object getValue(){
        return this.value;
    }

    public void setValue(Object value){
        this.value = value;
    }

    public No getProx(){
        return this.prox;
    }

    public void setProx(No prox){
        this.prox = prox;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        } else if(obj instanceof No){
            No aux = (No) obj;
            return this.value.equals(aux.getValue());
        }
        return false;
    }

    @Override
    public String toString(){
        return "No { value : " + value + "}";
    }
}
