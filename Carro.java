public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    String tipoCombustivel;
    float valorDeMercado;

    Proprietario dono;

    void alteraModeloECor(String modelo, String cor){
        if (modelo != null){
            this.modelo = modelo;
        }
        if(cor != null){
            this.cor = cor;
        }
    }

    // metodo java em orientação a objeto
    void ligar() {
        System.out.println("Ligando o carro");
    }

}
