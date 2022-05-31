package classes;

public class Pizza extends MiniPizza {
    private String tamanho;

    public Pizza() {
        this.setTipo("Pizza");
    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        System.out.printf("Tamanho da pizza: %s\n", this.getTamanho());
    }

    public void setTamanho(String tamanho) {
        this.tamanho=tamanho;
    }
    public String getTamanho(){
        return this.tamanho;
    }
}
