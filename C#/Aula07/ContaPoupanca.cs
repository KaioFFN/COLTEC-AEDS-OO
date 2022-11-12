using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Aula07
{
    public class ContaPoupanca : Conta
    {
        public void atualizaSaldoPoupanca(double taxa)
        {
            this.saldo += this.saldo * taxa * 3;
        }
    }
}
