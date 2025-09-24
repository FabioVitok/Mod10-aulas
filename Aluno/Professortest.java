
/**
 * Escreva uma descrição da classe Professortest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Professortest
{
    public static void main(String[] args){
        //System.out.println("Ola");
        // 1. Criar um objeto do tipo Professor
        Professor professor1 = new Professor(11, 1000, "Jonas", 1);
        // 2. Criar um obejto do tipo Professor
        Professor professor2 = new Professor(12, 1200, "Alice", 0);
        // 3. Imprimir o nome do professor 1 
        System.out.println(professor1.getNome());
        // 4. Imprimir o Salario do professor 2 
        System.out.println(professor2.getSalario());
        // 5. Alterar o salario do professor 1
        professor1.setSalario(1400);
        System.out.println(professor1.getSalario());
        // 6. Alterar de forma diferente pois a variavel é public
        professor1.salario = 0;
        System.out.println(professor1.getSalario());
    }
}
