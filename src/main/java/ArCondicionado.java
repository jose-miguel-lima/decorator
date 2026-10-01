public class ArCondicionado extends CompraDeCarroDecorator {

    public ArCondicionado(CompraDeCarro compraDeCarro){
        super(compraDeCarro);
    }

    @Override
    public String getNomeAdicional(){
        return "Ar Condicionado";
    }

    @Override
    public float getPercentualAumentoPreco() {
        return 0.1f;
    }
}
