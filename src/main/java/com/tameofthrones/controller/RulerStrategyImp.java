package com.tameofthrones.controller;

import java.util.List;
import java.util.Map;

import com.tameofthrones.cipher.CipherEncryption;
import com.tameofthrones.cipher.CipherEncryptionImp;
import com.tameofthrones.dto.Kingdom;
import com.tameofthrones.dto.Messages;

public class RulerStrategyImp implements RulerStrategy {

  public List<String> getWonKingdoms(List<Kingdom> kingdoms, List<Messages> messages) {
  
    CipherEncryption cipherEncryption = new CipherEncryptionImp();
    Map<String,String> encryptedEmblemKigdoms = cipherEncryption.encryptEmblem(kingdoms);
    for (Messages message : messages) {
      String kingdomName = message.getKingdom();
      String encryptedMessage = message.getMessage();
      String encryptedEmblem = encryptedEmblemKigdoms.get(kingdomName);
      
    }
    return null;
  }

}