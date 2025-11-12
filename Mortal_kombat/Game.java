import java.util.Random;
public class Game
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private static final int NUMBER_OF_ATTACKS = 5;
    private Character[] characters;
    private Character player1;
    private Character player2;
    private String[] gameMoves;
    public Game()
    {
        Character personagem1 = new Character
        ("Goro", "presas de Dragão", "Ilha shokan", "shoakn kuatan", 4.30);
        Character personagem2 = new Character
        ("Sub-Zero", "Clava de Gelo", "China", "shotokan", 1.88);
        Character personagem3 = new Character
        ("Scorpion", "kunai spear", "Japão", "Hapkido", 1.88);
        
        characters = new Character[]{
            personagem1.clone(), 
            personagem2.clone(), 
            personagem3.clone()
        };
        
        this.player1 = this.characters[this.selectPlayer()].clone();
        this.player2 = this.characters[this.selectPlayer()].clone();
        
        this.gameMoves = new String[this.NUMBER_OF_ATTACKS];
    }
    
    public int selectPlayer()
    {
        Random random = new Random();
        
        return random.nextInt(characters.length);
    }
    
    public Character getPlayer1()
    {
        return this.player1;
    }
    
    public Character getPlayer2()
    {
        return this.player2;
    }
    
    public void play()
    {
        Random random = new Random();
        
        //while(player1.getEnergy() != 0 || player1.getEnergy() != 0)
        for(int i = 0; i < this.NUMBER_OF_ATTACKS; i++)
        {
            if(random.nextInt(2) == 0)
            {
                player2.sufferAttack();
                this.gameMoves[i] = "O Player 1: " +this.player1.getName()+ " atacou o Player 2 com um " + player1.getAttack();
                System.out.println(this.gameMoves[i]);
            }
            else
            {
                player1.sufferAttack();
                this.gameMoves[i] = "O Player 2: " +this.player2.getName()+ " atacou o Player 1 com um " + player2.getAttack();
                System.out.println(this.gameMoves[i]);
            }
        }
        /*
        if(player1.getEnergy() == 0)
        {
            System.out.println("O Player 2 Venceu");
        }
        
        if(player2.getEnergy() == 0)
        {
            System.out.println("O Player 1 Venceu");
        }
        */
    } 
}