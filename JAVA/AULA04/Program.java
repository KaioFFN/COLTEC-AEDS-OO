package JAVA.AULA04;
public class Program 
{
    public static void main(String[] args) 
    {
        Funcionario empregado , gerente , func;
        gerente = new Funcionario("Fernando", "Gerente", 2802 , 10 , 8 , 1999 , "RJ-157.033.171");
        func = gerente;
        empregado = new Funcionario("Kaio", "Caixa", 2802 , 9 , 12  , 2005 , "MG-015.287.478");
        gerente.DadosFuncionario();
        empregado.DadosFuncionario();
            if (func == gerente) 
            {
                System.out.println("A");
            }
    }
}
