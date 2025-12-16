package proxyNetwork;


import java.io.IOException;
import java.io.FileInputStream;
import java.security.cert.X509Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateException;

/**
 * o wrapper para criar certificados;
 */
public class Certificate {

    /**\/ [FAZER] retornar certificação x509; */
    public static X509Certificate getCertObject(String filePath) 
    throws IOException, CertificateException {
        try (FileInputStream is = new FileInputStream(filePath)) {
            CertificateFactory certificateFactory = CertificateFactory
            .getInstance("X.509");
            return (X509Certificate) certificateFactory.generateCertificate(is);
        }
    }

}