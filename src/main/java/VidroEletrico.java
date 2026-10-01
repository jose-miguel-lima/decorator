public class VidroEletrico extends CompraDeCarroDecorator {

    public VidroEletrico(CompraDeCarro compraDeCarro){
        super(compraDeCarro);
    }

    @Override
    public String getNomeAdicional(){
        return "Vidro Elétrico";
    }

    @Override
    public float getPercentualAumentoPreco() {
        return 0.2f;
    }
}
