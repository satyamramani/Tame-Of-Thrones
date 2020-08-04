package com.tameofthrones.cipher;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tameofthrones.dto.Kingdom;


public class CipherEncryptionImp implements CipherEncryption {

  //This method takes list of kingdom as argument and returns the encrypted emblem kingdom.
  public Map<String,String> encryptEmblem(List<Kingdom> kingdoms) {

    Map<String,String> encryptedEmblemKingdoms = new HashMap<String,String>();

    //iterate over each kingdom and encrypt its emblem.
    for (Kingdom kingdomEmblem : kingdoms) {

      String encryptedEmblem = cipherEncryption(kingdomEmblem.getEmblem().toUpperCase());
      encryptedEmblemKingdoms.put(kingdomEmblem.getKingdomName(), encryptedEmblem);

    }

    return encryptedEmblemKingdoms;
  }

  //This private method encrypts emblem and no other class can invoke this method.
  private String cipherEncryption(String emblem) {

    int cipherKey = emblem.length();
    String encryptedEmblem = "";

    for (int i = 0; i < cipherKey; i++) {

      int encryptedEmblemChar = emblem.charAt(i) + cipherKey;

      if(encryptedEmblemChar > 90) {

        encryptedEmblemChar = encryptedEmblemChar - 26;
        encryptedEmblem += (char)(encryptedEmblemChar);

      } else {

        encryptedEmblem += (char)(encryptedEmblemChar);
      }
      
    }

    return encryptedEmblem;
  }
}