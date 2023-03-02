class EstruturaConta {

    double saldo;
    int agencia;
    int numero;
    String titular;  }
/*
>Uma classe é uma especificação de um tipo, definindo atributos e comportamentos.
>Um objeto é uma instância de uma classe onde podemos definir valores para seus atributos. 
>Para criar uma instância precisamos usar a palavra chave new.  */

public class CriaConta {

    public static void main(String[] args) {
        
        EstruturaConta primeiroCliente =  new EstruturaConta();
        primeiroCliente.saldo = 200;
        System.out.println(primeiroCliente.saldo);

        primeiroCliente.saldo += 100;  // > primeiroCliente.saldo += 100; OBS: a posição do + em relação ao = altera o valor final. ( +=  =+ )
        System.out.println(primeiroCliente.saldo);

        

    }
    
}
