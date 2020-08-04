package com.tameofthrones.cipher;

import java.util.ArrayList;
import java.util.List;

import com.tameofthrones.dto.Kingdom;


public class CipherEncryptionImp implements CipherEncryption {

  //This method takes list of kingdom as argument and returns the encrypted emblem kingdom.
  public List<Kingdom> encryptEmblem(List<Kingdom> kingdoms) {

    //making copy of original kingdom so that original kingdom remain same(not encrypted).
    List<Kingdom> kingdomsCopy = new ArrayList<Kingdom>(kingdoms.size());
    for (Kingdom kingdom : kingdoms) kingdomsCopy.add(new Kingdom(kingdom));

    //iterate over each kingdom and encrypt its emblem.
    for (Kingdom kingdomEmblem : kingdomsCopy) {

      String emblem = cipherEncryption(kingdomEmblem.getEmblem().toUpperCase());
      kingdomEmblem.setEmblem(emblem);

    }

    return kingdomsCopy;
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