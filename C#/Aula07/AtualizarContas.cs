using Aula07;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AULA07
{
    internal class AtualizarContas
    {
        private double saldoTotal = 0;
        private double selic;
        public double SaldoTotal { get => saldoTotal; set => saldoTotal = value; }

        public AtualizarContas(double selic)
        { 
            this.selic = selic; 
        }
        public void Atualizar(Conta conta) 
        {
            Console.WriteLine(" Saldo antigo " + conta.saldoConta());
            Console.WriteLine("Saldo atual {0}" , conta.saldoConta() * selic + conta.saldoConta());
            this.saldoTotal = conta.saldoConta() * selic + conta.saldoConta();
        }
    }
}
