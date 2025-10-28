import java.util.ArrayList;
public class MonstroTeste
{
   public static void main(String[] args) {
       Monstro monstro1 = new Monstro("slugma", "Fogo", 19);
       Monstro monstro2 = new Monstro("Lucario", "Lutador", 45);
       Monstro monstro3 = new Monstro("Greninja", "Agua", 50);
   
   String infoMonstro1 = monstro1.toString();
   System.out.println(infoMonstro1);
   
   int nivelMonstro2 = monstro2.treinar();
   System.out.println(nivelMonstro2);
   
   int nivelMonstro1 = monstro1.treinar();
   System.out.println(nivelMonstro1);
   
   nivelMonstro1 = monstro1.treinar();
   System.out.println(nivelMonstro1);
   
   ArrayList<Monstro> armarioDeMonstros = new ArrayList<Monstro>();
   armarioDeMonstros.add(monstro1);
   armarioDeMonstros.add(monstro2);
   armarioDeMonstros.add(monstro3);
   System.out.println("O tamanho do armario é: " + armarioDeMonstros.size());
   
       for(Monstro monstroTemp : armarioDeMonstros){
   System.out.println("O Nivel do monstro " + monstroTemp.getNome() + " é " + monstroTemp.getNivel() );
    }
    for(Monstro monstroTemp : armarioDeMonstros){
    if(monstroTemp.getNivel() >= 40){
   System.out.println("O Nivel do monstro " + monstroTemp.getNome() + " é " + monstroTemp.getNivel() );
     
    }
    }
/*
for(int i = 0; i < armarioDeMonstros.size();i++){
    if(armarioDeMonstros.get(i).getNivel() > 50){
        armarioDeMonstros.remove(i);
    }*/
    System.out.println(armarioDeMonstros.size());
    
    ArrayList<Monstro> armarioDeMonstrosMaiorQueMil = new ArrayList<Monstro>();
    for(Monstro monstroTemp : armarioDeMonstros){
        if(monstroTemp.getNivel() > 1000){
            armarioDeMonstrosMaiorQueMil.add(monstroTemp);
        }
    }
    //Verificar se há um monstro lucario
    boolean temLucario = false;
    String nomeaProcurar = "Lucario";
    String nomeaProcurar2 = new String ("Lucario");
    
    for(Monstro monstroTemp : armarioDeMonstros){
        if(monstroTemp.getNome().equals(nomeaProcurar2)){
            temLucario = true;
        }
    }
 }
    }
