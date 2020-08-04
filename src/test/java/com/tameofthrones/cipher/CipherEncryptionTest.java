package com.tameofthrones.cipher;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;

import com.tameofthrones.create.CreateKingdoms;
import com.tameofthrones.create.CreateKingdomsImp;
import com.tameofthrones.dto.Kingdom;

import org.junit.jupiter.api.Test;

public class CipherEncryptionTest {

  @Test
  public void encryptionTest() {
    CreateKingdoms createkingdoms = new CreateKingdomsImp();
    CipherEncryption cipherEncryption = new CipherEncryptionImp();
    List<Kingdom> kingdoms = createkingdoms.getKingdoms();
    Map<String,String> encryptedEmblemKingdoms = cipherEncryption.encryptEmblem(kingdoms);
    assertEquals("RZO", encryptedEmblemKingdoms.get("AIR"));
    assertEquals("OWL", kingdoms.get(4).getEmblem());
  }

}