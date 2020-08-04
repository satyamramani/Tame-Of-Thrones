package com.tameofthrones.cipher;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.tameofthrones.create.CreateKingdoms;
import com.tameofthrones.create.CreateKingdomsImp;
import com.tameofthrones.kingdom.Kingdom;

import org.junit.jupiter.api.Test;

public class CipherEncryptionTest {

  @Test
  public void encryptionTest() {
    CreateKingdoms createkingdoms = new CreateKingdomsImp();
    CipherEncryption cipherEncryption = new CipherEncryption();
    List<Kingdom> kingdoms = createkingdoms.creatKingdoms();
    List<Kingdom> encryptedEmblemKingdoms = cipherEncryption.encryptEmblem(kingdoms);
    assertEquals("RZO", encryptedEmblemKingdoms.get(4).getEmblem());
    assertEquals("OWL", kingdoms.get(4).getEmblem());
  }

}