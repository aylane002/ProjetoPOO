package classes;

public class Mesa {
    int capacidade;
    boolean estaLivre = false;
    Pessoas responsavel;
    int numOcupantes;
    int numero;
    Comando comando;

    public boolean estaLivre(){
        return estaLivre;
    }

    public void ocuparMesa(int quantidadePessoas){
       if(quantidadePessoas<= capacidade && estaLivre){
           this.numOcupantes=quantidadePessoas;
        this.estaLivre=false;
        this.comando = new Comando();
    }
       else {
           return;
       }
       public void desocupaMesa(double valorPago){
           Double total = comando.calculaPreco();
           if(valorPago>=total){
               this.numOcupantes=0;
               this.estaLivre=true;
               this.comando=null;
           }
        }

}
