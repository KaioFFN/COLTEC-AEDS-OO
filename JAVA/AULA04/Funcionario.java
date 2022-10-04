package JAVA.AULA04;

import JAVA.AULA04.Data;

public class Funcionario {

    String nome; 
    String departamento;
    double salario;
    Data dataEntrada; 
    String RG;
    public Funcionario()
    {
        dataEntrada = new Data();
    }
    void DadosFuncionario()
    {
        System.out.println();
        System.out.println("Nome funcionario: " +  nome);
        System.out.println("Departamento " +  departamento);
        System.out.println("Salario semanal " + salario);
        System.out.println("Entrou na empresa " + dataEntrada.dia + "/" + dataEntrada.mes + "/" + dataEntrada.ano);
        System.out.println("RG do funcionario " + RG);
    }
    public Funcionario(String nome, String departamento, double salario, Data dataEntrada, String rG) {
        new Data();
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.RG = rG;
    }
}

