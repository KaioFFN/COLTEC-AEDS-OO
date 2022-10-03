package JAVA.AULA04;

import JAVA.AULA04.Data;

public class Funcionario {

    String nome; 
    String departamento;
    double salario;
    Data data_entrada; 
    String RG;
    public Funcionario()
    {
        data_entrada = new Data();
    }
    void DadosFuncionario()
    {
    System.out.println("Nome funcionario: " +  nome);
    System.out.println("Departamento " +  departamento);
    System.out.println("Salario semanal " + salario);
    System.out.println("Entrou na empresa " + data_entrada.dia + "/" + data_entrada.mes + "/" + data_entrada.ano);
    System.out.println("RG do funcionario " + RG);
    }
}

