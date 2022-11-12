using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Aula07
{
    public class ContaCorrente : Conta
    {
        public void depositarCorrente(double saldo)
        {
            this.saldo = saldo - 0.10;
        }
        public void atualizaSaldoCorrente(double taxa)
        {
            this.saldo += this.saldo * taxa * 2;
        }
    }
}
