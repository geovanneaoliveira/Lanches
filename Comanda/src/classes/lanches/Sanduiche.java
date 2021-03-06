package classes.lanches;

public abstract class Sanduiche extends Lanche {
    private String[] adicionais = new String[10];

    public Sanduiche() {
        this.adicionarIngrediente("Pão");
    }

    public void adicionarAdicional(String adicional) {
        for (int i = 0; i < 10; i++) {
            if (this.adicionais[i] == null) {
                this.adicionais[i] = adicional;
                break;
            }
        }
    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.adicionais[0] != null) {
            System.out.println("-ADICIONAIS-");
            int cont = 1;
            for (String adicional: this.adicionais) {
                if (adicional == null) {
                    break;
                }
                System.out.printf("%d - %s\n", cont, adicional);
                cont++;
            }
            System.out.println("----------------");
        }
    }
}
