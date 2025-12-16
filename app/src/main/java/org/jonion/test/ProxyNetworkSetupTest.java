package test;

import proxyNetwork.Proxy;

import java.io.IOException;

/**
 * Build up a simulated network of specified number of nodes
 */
public class ProxyNetworkSetupTest {

    private static final int PROXY_NET_NUMBER = 10;
    public static void main(String[] args) {

        /**\/
         * testes com endereço de loopback;
         * é um endereço importante usado para testar e solucionar problemas
         * de conectividade de rede na máquina local.
         * Este intervalo inclui endereços de 127.0.0.0 a 127.255.255.255;
         */
        // Setup proxies
        for(int i = 0; i < PROXY_NET_NUMBER; i++) {

            new Thread(() -> {
                try {
                    Proxy node = new Proxy();
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
