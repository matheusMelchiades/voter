package br.edu.ulbra.election.voter.config;

import java.security.MessageDigest;

public class PasswordConfig {

    public static String cripting(String senha) throws Exception {
        MessageDigest algorithm = MessageDigest.getInstance("MD5");
        byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));

        StringBuilder hexString = new StringBuilder();

        for (byte b : messageDigest) {
            hexString.append(String.format("%02X", 0xFF & b));
        }

        return hexString.toString();
    }

}
