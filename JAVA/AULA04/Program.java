package JAVA.AULA04;
public class Program 
{
    public static void main(String[] args) 
    {
        Funcionario empregado , gerente , func;
        //Inserindo os dados dos funcionarioss
        gerente = new Funcionario("Fernando", "Gerente", 30000 , 10 , 8 , 1999 , "RJ-157.033.171");
        empregado = new Funcionario("Kaio", "Caixa", 10000 , 9 , 12  , 2005 , "MG-015.287.478");
        func = gerente;
        //Lendo os dados inseridos
        gerente.DadosFuncionario();
        empregado.DadosFuncionario();
        //Aqui comprara se é o mesmo funcionario vendo se esta salvo no mesmo lugar da memoria 
        if (func == gerente) 
        {
            System.out.println("A");
        }
    }
}
