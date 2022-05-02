import com.unipe.TE.ContaCorrente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaCorrenteTeste {
    @Test
    public void DeveAdicionarSaldoAContaEVerificarOValorFinal() {
        // Cenário (supondo que ja tenha mil na conta) //
        ContaCorrente conta01 = new ContaCorrente(1000);
        // Ação (depositar 500 na conta) //
        conta01.depositar(500);
        double resultado = conta01.getSaldo();
        // Verificação (o resultado deverá ser 1500) //
        Assertions.assertEquals(1500, resultado);
    }
    @Test
    public void DeveRemoverSaldoDaContaEVerificarOValorFinal() {
        // Cenário (supondo que haja 5000 na conta) //
        ContaCorrente conta02 = new ContaCorrente(5000);
        // Ação (sacar 1000 da conta) //
        conta02.sacar(1000);
        double resultado = conta02.getSaldo();
        // Verificação (o resultado deverá ser 4000) //
        Assertions.assertEquals(4000, resultado);
    }
    @Test
    public void DeveSacarComSaldoZeroESaldoPermanecerZero() {
        // Cenário (supondo que não haja saldo) //
        ContaCorrente conta03 = new ContaCorrente(0);
        // Ação (sacar 200 da conta)
        conta03.sacar(200);
        double resultado = conta03.getSaldo();
        // Verificação (o resultado deverá retornar uma mensagem no console!) //
        Assertions.assertEquals(0, resultado);
    }
}
