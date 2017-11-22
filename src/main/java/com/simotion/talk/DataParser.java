package com.simotion.talk;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class DataParser {
    private static String key = "98y#^2o@3!n~j/w>";

    public static String encrypt(String text) {
        Base64.Encoder encoder = Base64.getEncoder();
        try {
            byte[] targetBytes = text.getBytes("UTF-8");
            byte[] encodedBytes = encoder.encode(targetBytes);
            return new String(encodedBytes);

            //SecretKeySpec skeyspec=new SecretKeySpec(key.getBytes(),"Blowfish");
            //Cipher cipher=Cipher.getInstance("Blowfish");
            //cipher.init(Cipher.ENCRYPT_MODE, skeyspec);
            //byte[] encrypted=cipher.doFinal(encodedBytes);
            //return new String(encrypted);
        }
        catch(Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        return "";
    }
    public static String decrypt(String data) {
        Base64.Decoder decoder = Base64.getDecoder();
        try {
            //SecretKeySpec skeyspec=new SecretKeySpec(key.getBytes(),"Blowfish");
            //Cipher cipher=Cipher.getInstance("Blowfish");
            //cipher.init(Cipher.DECRYPT_MODE, skeyspec);
            //byte[] decrypted=cipher.doFinal(data.getBytes());

            //byte[] encodedBytes = decoder.decode(decrypted);
            byte[] encodedBytes = decoder.decode(data);
            return new String(encodedBytes);
        }
        catch(Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        return "";
    }
}
