package com.tameofthrones.cipher;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.tameofthrones.create.CreateKingdoms;
import com.tameofthrones.create.CreateKingdomsImp;
import com.tameofthrones.dto.Kingdom;

import org.junit.jupiter.api.Test;

public class CipherEncryptionTest {

  @Test
  public void encryptEmblemTest() {

    CreateKingdoms createkingdoms = new CreateKingdomsImp();
    CipherEncryption cipherEncryption = new CipherEncryptionImp();
    List<Kingdom> kingdoms = createkingdoms.getKingdoms();
    Map<String,String> encryptedEmblemKingdoms = cipherEncryption.encryptEmblem(kingdoms);

    
    assertEquals("RZO", encryptedEmblemKingdoms.get("AIR"));
    assertEquals("UFSIF", encryptedEmblemKingdoms.get("LAND"));

  }

  @Test
  public void checkOriginalKingdom() { // for kingdom after encryption

    List<String> kingdomEmblem = new ArrayList<String>();
    
    CreateKingdoms createkingdoms = new CreateKingdomsImp();
  
    List<Kingdom> kingdoms = createkingdoms.getKingdoms();

    CipherEncryption cipherEncryption = new CipherEncryptionImp();

    cipherEncryption.encryptEmblem(kingdoms);

    for (Kingdom kingdom : kingdoms) {
      kingdomEmblem.add(kingdom.getEmblem());
    }

    Collections.sort(kingdomEmblem);

    List<String> expectedKingdomEmblem = new ArrayList<String>();
    expectedKingdomEmblem.add("GORILLA");
    expectedKingdomEmblem.add("PANDA");
    expectedKingdomEmblem.add("MAMMOTH");
    expectedKingdomEmblem.add("OCTOPUS");
    expectedKingdomEmblem.add("OWL");
    expectedKingdomEmblem.add("DRAGON");

    Collections.sort(expectedKingdomEmblem);

    assertEquals(expectedKingdomEmblem, kingdomEmblem);
    
  }

  @Test
  public void checkStringEncryptionTest() {

    CipherEncryptionImp cipherEncryption = new CipherEncryptionImp();

    String encryptedString1 = cipherEncryption.cipherEncryptionString("PANDA");
    String encryptedString2 = cipherEncryption.cipherEncryptionString("OWL");

    assertEquals("UFSIF", encryptedString1);
    assertEquals("RZO", encryptedString2);

  }

}