import java.util.ArrayList;
public class TreinadorTeste
{
  public static void main (string[] args){
       Monstro monstro1 = new Monstro("slugma", "Fogo", 19);
       Monstro monstro2 = new Monstro("Lucario", "Lutador", 45);
       Monstro monstro3 = new Monstro("Greninja", "Agua", 50);
       
       Treinador treinador1 = new Treinador("s");
       treinador1.capturarMonstro(monstro1);
       boolean libertou = treinador1.libertarMonstro("Slugma");
       
       System.out.println(libertou);
       
       treinador1,mostrarEquipa();
  }