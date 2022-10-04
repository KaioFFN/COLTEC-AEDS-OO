package JAVA.AULA04;

import JAVA.AULA04.Funcionario;;

public class Program 
{
    public static void main(String[] args) 
    {
        Funcionario empregado , gerente , func;
        Data data = new Data();
        gerente = new Funcionario("Kaio", "RH", 2802 , data , "MG-000.000.000");
        func = gerente;
        empregado = new Funcionario("Kaio", "RH", 2802 , data , "MG-000.000.000");
        gerente.DadosFuncionario();
        empregado.DadosFuncionario();
            if (func == gerente) 
            {
                System.out.println("A");
            }
    }
}
