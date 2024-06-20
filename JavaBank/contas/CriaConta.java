package JavaBank.contas;

public class CriaConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();            //Instancia(Cria) o objeto
        primeiraConta.saldo = 200;
        System.out.println("O saldo da primeira conta é R$ " + primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println("O saldo da primeira conta após alteração é R$ " +primeiraConta.saldo);

        System.out.println("\n------------------- Mudando de conta -------------------\n");

        Conta segundaConta = new Conta();
        segundaConta.agencia = 10;
        segundaConta.saldo = 3000;
        System.out.println("O saldo da primeira conta é R$ " + segundaConta.saldo);
        System.out.println("A agencia da segunda conta é " +segundaConta.agencia);
    }
}
