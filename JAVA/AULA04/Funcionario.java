public class Funcionario {
    String nome; 
    String departamento;
    double salario;
    String data_entrada; 
    String RG;

    void DadosFuncionario()
    {
    System.out.println("Nome funcionario: " +  nome);
    System.out.println("Departamento " +  departamento);
    System.out.println("Salario semanal" + salario);
    System.out.println("Entrou na empresa " + data_entrada);
    System.out.println("RG do funcionario " + RG);
    
    }
}

