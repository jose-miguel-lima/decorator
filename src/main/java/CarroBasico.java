public class CarroBasico implements CompraDeCarro{

    public float preco;

    public CarroBasico(float preco){
        this.preco = preco;
    }

    @Override
    public float getPreco() {
        return this.preco;
    }

    @Override
    public String getDescricao() {
        return "Carro básico";
    }
}
