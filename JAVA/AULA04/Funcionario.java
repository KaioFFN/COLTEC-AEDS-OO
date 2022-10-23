package JAVA.AULA04;

import java.util.Scanner;

// Aqui temos uma classe para pegarmos os dados dos usuarios
public class Funcionario 
{
    private String nome; 
    private String departamento;
    private double salario;
    private Data dataEntrada; 
    private String RG;
    //Aqui é para imprimir esses dados do funcionario 
    void DadosFuncionario()
    {
        System.out.println();
        System.out.println("Nome funcionario: " +  nome);
        System.out.println("Departamento " +  departamento);
        System.out.println("Salario semanal " + salario);
        System.out.println("Entrou na empresa " + dataEntrada.dia + "/" + dataEntrada.mes + "/" + dataEntrada.ano);
        System.out.println("RG do funcionario " + RG);
    }
    // Aqui é para pegarmos os dados do funcionario
    public Funcionario(String nome, String departamento, double salario , int dia , int mes  , int ano, String rG) 
    {
        //Aqui é para criarmos o tipo data
        dataEntrada = new Data();
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada.dia = dia;
        this.dataEntrada.mes = mes;
        this.dataEntrada.ano = ano;
        this.RG = rG;
    }
    public Funcionario()
    {
        Scanner input = new Scanner(System.in);
        dataEntrada = new Data();
        System.out.print("Nome do funcionario: ");
        nome = input.nextLine();
        System.out.print("Nome do departamento: ");
        departamento = input.nextLine();
        System.out.print("Salario funcionario: ");
        salario = input.nextDouble();
        System.out.print("Dia de entrada: ");
        dataEntrada.dia = input.nextInt();
        System.out.print("Mes de entrada: ");
        dataEntrada.mes = input.nextInt();
        System.out.print("Ano de entrada: ");
        dataEntrada.ano = input.nextInt();
        System.out.print("RG funcionario ");
        RG = input.next();
        System.out.println("");
    }
}

