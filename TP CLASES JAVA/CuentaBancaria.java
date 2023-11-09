public class CuentaBancaria {
    private Integer saldo;
    private Integer num_de_cuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(Integer saldo, Integer num_de_cuenta) {
        this.saldo = saldo;
        this.num_de_cuenta = num_de_cuenta;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public Integer getNum_de_cuenta() {
        return num_de_cuenta;
    }

    public void setNum_de_cuenta(Integer num_de_cuenta) {
        this.num_de_cuenta = num_de_cuenta;
    }

    public static void Depositar(int saldo, int saldo_en_banco){
        saldo_en_banco = saldo_en_banco + saldo;
        System.out.println("La plata que posee ahora es: " +saldo_en_banco);
    }

    public static void Retirar(int saldo_en_banco, int saldo_a_retirar){
        saldo_en_banco = saldo_en_banco - saldo_a_retirar;
        System.out.println("El saldo dispoible es: " + saldo_en_banco);
    }
}
