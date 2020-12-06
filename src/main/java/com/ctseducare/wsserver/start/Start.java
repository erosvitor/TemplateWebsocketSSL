package com.ctseducare.wsserver.start;

import com.ctseducare.wsserver.WSServer;
import com.ctseducare.wsserver.sslcertificate.SSLCertificateException;

public class Start {

  public static void main(String[] args) {
    try {
      WSServer.getInstance().start();
    } catch (SSLCertificateException e) {
      e.printStackTrace();
    }

  }

}
