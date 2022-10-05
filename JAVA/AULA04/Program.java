package JAVA.AULA04;
public class Program 
{
    public static void main(String[] args) 
    {
        Funcionario empregado , gerente , func;
        //Inserindo os dados dos funcionarioss
        gerente = new Funcionario("Fernando", "Gerente", 30000 , 10 , 8 , 1999 , "RJ-157.033.171");
        empregado = new Funcionario("Fernando", "Gerente", 30000 , 10 , 8  , 1999 , "RJ-157.033.171");
        func = gerente;
        //Lendo os dados inseridos
        gerente.DadosFuncionario();
        empregado.DadosFuncionario();
        //Aqui comprara se é o mesmo funcionario vendo se esta salvo no mesmo lugar da memoria 
        if (func == gerente) 
        {
            System.out.println("SALVO NO MESMO LUGAR");
        }
        //Mesmos dados porem não é uma compraração de damos mas sim de local que foi salvo
        if(gerente == empregado)
        {
            System.out.println("SALVO NO MESMO LUGAR");
        }else
        {
            System.out.println("NÃO SALVO NO MESMO LUGAR");
        }
    }
}
