package banco.ex.pratico;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if(t == "t") {
            setSaldo(50);
        }else if(t == "cp") {
            setSaldo(150);
        }
    }
    public void fecharConta() {
        if(getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        }else if(saldo < 0) {
            System.out.println("Conta em debito");
        }else
            setStatus(false);
    }
    public void depositar(double x) {
        if(isStatus() == true) {
            setSaldo(getSaldo() + x);
        }else
            System.out.println("Impossivel depositar");
    }
    public void sacar(double x) {
        if (isStatus() == true)
            if(x < getSaldo()){
                setSaldo(getSaldo() - x);
            }else
                System.out.println("Saldo insuficiente");
        else
            System.out.println("Impossivel sacar");
    }
    public void pagarMensal() {
        int x = 0;
        if(getTipo() == "cc") {
            x = 12;
        } else if(getTipo() == "cp") {
            x = 20;
        }
        if (isStatus() == true){
            if (getSaldo() > x) {
                setSaldo(getSaldo() - x);
            }else
                System.out.println("Saldo insuficiente");
        }else
            System.out.println("Impossivel pagar");
    }

    @Override
    public String toString() {
        return "ContaBanco{" +
                "numConta=" + numConta +
                ", tipo='" + tipo + '\'' +
                ", dono='" + dono + '\'' +
                ", saldo=" + saldo +
                ", status=" + status +
                '}';
    }
}
