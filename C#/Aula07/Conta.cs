using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Aula07
{
     public class Conta
    {
        protected double saldo;

        public void depositar(double saldo){
            this.saldo = saldo;
        }
        public void sacar(double saque){
            this.saldo = saldo - saque;
        }
        public double saldoConta(){
            return saldo;
        }
        public void atualizaSaldo(double taxa) {
            this.saldo += this.saldo * taxa;
        }
    }
}
