package arcondicionado;

public class Casa extends Luz{
    LigarDesligar[] dispositivos;

    public Casa(LigarDesligar[] dispositivos){
        this.dispositivos = dispositivos;
    }

    public void desligaTudo(){
        for(int i=0; i<dispositivos.length; i++){
            dispositivos[i].desligar();
        }

    }
}
