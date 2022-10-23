package JAVA.AULA05;
import java.util.Scanner;
public class Empresa {
   
        Funcionario[] funcionario; 
        String nomeEmpresa;
        String cnpj;
        int numfuncionarios = 0;
    void DadosEmpresa()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome da empresa: ");
        this.nomeEmpresa = input.next();
        System.out.print("Digite o CNPJ :");
        this.cnpj = input.next();
        System.out.println("Digite o numero de funcionarios: ");
        numfuncionarios = input.nextInt();
        funcionario = new Funcionario[numfuncionarios];
        for (int i = 0; i < funcionario.length; i++) {
            this.funcionario[i] = new Funcionario();    
        }
    }
    void printDadosFuncionarios(){
        
        System.out.println();
        System.out.println("Nome Empresa: " +  nomeEmpresa);
        System.out.println("CNPJ: " + cnpj);
       for (int i = 0; i < numfuncionarios; i++) {
        System.out.print("Funcionario posição: " + i);
        funcionario[i].DadosFuncionario();
    }
    }
}
