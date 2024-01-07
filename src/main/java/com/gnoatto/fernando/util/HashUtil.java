package com.gnoatto.fernando.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HashUtil {
    public static String stringToMd5(String senha) {
        String md5 = null;

        if (senha == null) {
            return null;
        }

        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");

            digest.update(senha.getBytes(), 0, senha.length());

            md5 = new BigInteger(1, digest.digest()).toString(16);
            
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(HashUtil.class.getName()).log(Level.SEVERE, null, ex);
        }

        return md5;
    }
}
