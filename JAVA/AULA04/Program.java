public class Program {
    public static void main(String[] args) {
        Funcionario empregado , gerente;
        gerente = new Funcionario();
        gerente.nome = "Joao";
        gerente.data_entrada = " 20/08/1999";
        gerente.departamento = "Loja Principal";
        gerente.salario = 20000.05;
        gerente.RG = "SP-000.000.000";
       
        empregado = new Funcionario();
        empregado.nome = "Felipe";
        empregado.departamento = "RH";
        empregado.salario = 1250.50;
        empregado.data_entrada = "01/10/2022";
        empregado.RG = "MG-000.000.000";
        empregado.DadosFuncionario();
        gerente.DadosFuncionario();

    }
}
