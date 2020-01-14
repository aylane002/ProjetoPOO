package arcondicionado;

public class Main {
    public static void main(String[] args) {
       LigarDesligar luz1= new Luz();
       LigarDesligar luz2= new Luz();
       LigarDesligar luz3= new Luz();
       LigarDesligar luz4= new Luz();
       LigarDesligar arc1= new Ar();
       LigarDesligar arc2= new Ar();

      LigarDesligar[] disp = {
              luz1,luz2,luz3,luz4,arc1,arc2
        };

        Casa casa = new Casa(disp);
      luz1.ligar();
      arc1.ligar();

      for(int i=0; i< disp.length;i++){
          System.out.println(disp[i].status());
      }
        System.out.println();

    }
}
