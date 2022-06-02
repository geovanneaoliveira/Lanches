package classes.pedido;

import classes.lanches.Lanche;

public class Pedido {
    private Lanche[] lanches = new Lanche[10];

    public void imprimirComanda() {

    }

    public double calcularValorTotal() {
        double valTotal = 0;
        for(int i =0; i<10; i++){
            if(this.lanches[i]!=null){
                valTotal += this.lanches[i].getValor();
            }
        }
        return valTotal;
    }
    public void adicionarLanche(Lanche lanche) {
        for (int i = 0; i < 10; i++) {
            if (this.lanches[i] == null) {
                this.lanches[i] = lanche;
                break;
            }
        }
    }

    public Lanche[] getLanches() {
        return this.lanches;
    }
}
