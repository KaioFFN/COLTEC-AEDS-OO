package JAVA.AULA05;
import java.util.Scanner;
public class Empresa {
   
        Funcionario[] funcionario; 
        String nomeEmpresa;
        String cnpj;
        int numfuncionarios = 0;
    void DadosEmpresa()
    {
        
        Empresa empresa = new Empresa();
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome da empresa: ");
        this.nomeEmpresa = input.next();
        System.out.print("Digite o CNPJ :");
        this.cnpj = input.next();
        System.out.println("Digite o numero de funcionarios: ");
        numfuncionarios = input.nextInt();
        empresa.funcionario = new Funcionario[numfuncionarios];
        for (int i = 0; i < empresa.funcionario.length; i++) {
            empresa.funcionario[i] = new Funcionario();    
        }
    }
    void printDadosFuncionarios(){
        Empresa empresa = new Empresa();
        System.out.println();
        System.out.println("Nome Empresa: " +  nomeEmpresa);
        System.out.println("CNPJ: " + cnpj);
       for (int i = 0; i < numfuncionarios; i++) {
        empresa.funcionario[i].DadosFuncionario();
    }
    }
}
