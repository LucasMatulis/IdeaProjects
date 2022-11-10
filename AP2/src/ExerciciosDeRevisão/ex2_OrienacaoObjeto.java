package ExerciciosDeRevisão;

public class ex2_OrienacaoObjeto {

    int qtd=0;
    float preco=0;
    String descricao="";



    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int setQtd(){
        return qtd;
    }

    public void getQtd(int qtd){
        this.qtd=qtd;
    }

    public String setDescricao(){
        return descricao;
    }

    public void getDescricao(String descricao){
        this.descricao=descricao;
    }


    public ex2_OrienacaoObjeto(){

        super();

    }

    @Override
    public String toString(){

        return "Descrição: "+descricao+"\t Quantidade vendida ="+qtd+"\t Preço do produto= "+preco;


    }


}
