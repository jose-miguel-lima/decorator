public class MultiMidia extends CompraDeCarroDecorator {
    public MultiMidia(CompraDeCarro compraDeCarro){
        super(compraDeCarro);
    }

    @Override
    public String getNomeAdicional(){
        return "Multimídia";
    }

    @Override
    public float getPercentualAumentoPreco() {
        return 0.15f;
    }
}
