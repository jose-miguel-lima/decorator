public abstract class CompraDeCarroDecorator implements CompraDeCarro {

    private CompraDeCarro compraDeCarro;
    public String descricao;

    public CompraDeCarroDecorator(CompraDeCarro compraDeCarro){
        this.compraDeCarro = compraDeCarro;
    }

    public abstract String getNomeAdicional();

    public abstract float getPercentualAumentoPreco();

    @Override
    public float getPreco() {
        return this.compraDeCarro.getPreco() * ( 1 + (this.getPercentualAumentoPreco()));
    }

    @Override
    public String getDescricao() {
        return (this.compraDeCarro.getDescricao() + " + " + this.getNomeAdicional() );
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public CompraDeCarro getCompraDeCarro(){
        return this.compraDeCarro;
    }

    public void setCompraDeCarro(CompraDeCarro compraDeCarro){
        this.compraDeCarro = compraDeCarro;
    }
}
