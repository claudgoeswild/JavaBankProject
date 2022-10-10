
package banco2;
//classe Conta que tem gets e sets para as variaveis do tipo Conta.
public class Conta {
    private String NumConta;
    private String Nome;
    private String RG;
    private String CPF;
    private double Saldo;
    private String Password;

    public Conta(String NumConta, String Nome, String RG, String CPF, double Saldo, String Password) {
        this.NumConta = NumConta;
        this.Nome = Nome;
        this.RG = RG;
        this.CPF = CPF;
        this.Saldo = Saldo;
        this.Password = Password;
    }

    Conta() {
    }

    public String getNumConta() {
        return NumConta;
    }

    public void setNumConta(String NumConta) {
        this.NumConta = NumConta;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
            
}
