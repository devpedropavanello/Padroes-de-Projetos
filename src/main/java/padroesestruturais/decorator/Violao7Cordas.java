package padroesestruturais.decorator;

public class Violao7Cordas implements Violao {

    public float preco;

    public Violao7Cordas() {
    }

    public Violao7Cordas(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return this.preco;
    }

    public String getDescricao() {
        return "Violao 7 cordas";
    }
}
