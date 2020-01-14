package arcondicionado;

public class Luz implements LigarDesligar {
   boolean estado=false;

    @Override
    public void ligar() {
     estado = true;
     }


    @Override
    public void desligar() {
        estado = false;

    }

    @Override
    public boolean status() {
        return this.estado;
    }
}
