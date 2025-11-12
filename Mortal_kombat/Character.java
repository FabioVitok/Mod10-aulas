import java.util.Random;
public class Character
{
    //Variaveis de Classe
    private static final int MAX_ENERGY = 100;
    private static final int DAMAGE = 20;
    private static final String[] attacks = {"Strong Punch", "Light Punch" , "Strong Kick", "Light Kick"};
    
    //Variaies de instancia
    private String name;
    private String weapon;
    private String homeland;
    private String fightingStyles;
    private double height;
    private int energy;
    
    /**
     * Construtor do persoangem
     * 
     * @return character
     */
    public Character(String name, String weapon, String homeland,
                        String fightingStyles, double height)
    {
        this.name = name;
        this.weapon = weapon;
        this.homeland = homeland;
        this.fightingStyles = fightingStyles;
        this.height = height;
        this.energy = MAX_ENERGY;
    }
    
    /**
     * Mostra quanta vida tem o personagem
     * 
     * @return this.energy
     */
    public int getEnergy()
    {
        return this.energy;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getAttack ()
    {
        Random random = new Random();
        return attacks[random.nextInt(attacks.length)];
    }
    
    /**
     * Simula um ataque sofrido por um personagem
     * Retira Energia a energia do personagem
     * 
     * @retrun void
     */
    public void sufferAttack()
    {
        this.energy = this.energy - this.DAMAGE;
    }
    public Character clone()
    {
        Character clone = new Character (
            this.name, 
            this.weapon, 
            this.homeland, 
            this.fightingStyles, 
            this.height
        );
        
        return clone;
    }

    /**
     * Mostra todos os detalhes do personagem
     * Mostra cada variavel da classe e o seu nome
     * 
     * @retrun stringBuilder
     */
    @Override
    public String toString ()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("----CHARACTER----\n");
        sb.append("-------Name------\n");
        sb.append(this.name).append("\n");
        sb.append("------Weapon-----\n");
        sb.append(this.weapon).append("\n");
        sb.append("-----Homeland-----\n");
        sb.append(this.homeland).append("\n");
        sb.append("--FightingStyles--\n");
        sb.append(this.fightingStyles).append("\n");
        sb.append("------Height------\n");
        sb.append(this.height).append("\n");
        sb.append("------Energy------\n");
        sb.append(this.energy).append("/").append(this.MAX_ENERGY).append("\n");
        
        return sb.toString();
        
    }
}
