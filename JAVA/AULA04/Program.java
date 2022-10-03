package JAVA.AULA04;

import JAVA.AULA04.Funcionario;;

public class Program 
{
    public static void main(String[] args) 
    {
        Funcionario empregado , gerente , func;
        gerente = new Funcionario();
        func = gerente;
        gerente.nome = "Joao";
        gerente.data_entrada.dia = 20;
        gerente.data_entrada.mes = 10;
        gerente.data_entrada.ano = 2005;
        gerente.departamento = "Loja Principal";
        gerente.salario = 20000.05;
        gerente.RG = "SP-000.000.000";
       
        empregado = new Funcionario();
        empregado.nome = "Jose";
        empregado.departamento = "RH";
        empregado.salario = 1250.50;
        empregado.data_entrada.dia = 20;
        empregado.data_entrada.mes = 10;
        empregado.data_entrada.ano = 2005;
        empregado.RG = "MG-000.000.000";
        empregado.DadosFuncionario();
        gerente.DadosFuncionario();
        if (func == gerente) {
            System.out.println("A");
        }
    }
}
