package test;

import java.lang.Thread;
import java.io.IOException;
import java.lang.InterruptedException;

import test.ProxyNetworkSetupTest;
import test.client.ClientAPIExample;
import test.receiver.ReceiverAPIExample;

/**
 * classe para rodar todos os testes paralelamente;
 */
public class RunAll extends Thread {
    private int teste;
    private String[] args;

    public RunAll(int teste, String[] args) {
        this.teste = teste;
        this.args = args;
    }

    @Override public void run() {
        System.out.printf("        >>> Run teste [%d] <<<<\n", teste);
        try{
            if(teste == 0)new ProxyNetworkSetupTest().main(args);
            if(teste == 1)new ClientAPIExample().main(args);
            if(teste == 2)new ReceiverAPIExample().main(args);
        }catch(IOException e){}
    }
}
