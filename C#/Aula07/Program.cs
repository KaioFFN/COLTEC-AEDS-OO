using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Aula07
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Conta c = new Conta();
            ContaCorrente cc = new ContaCorrente();
            ContaPoupanca cp = new ContaPoupanca();
            c.depositar(1000);
            cc.depositarCorrente(1000);
            cp.depositar(1000);

            c.atualizaSaldo(0.01);
            cc.atualizaSaldoCorrente(0.01);
            cp.atualizaSaldoPoupanca(0.01);

            Console.WriteLine(c.saldoConta());
            Console.WriteLine(cc.saldoConta());
            Console.WriteLine(cp.saldoConta());

        }
    }
}
