package com.tameofthrones.cipher;

import java.util.List;
import java.util.Map;

import com.tameofthrones.dto.Kingdom;


/*
* This class have one method which takes kingdoms as argument
* and it uses cipher code to encrypt kingdom's emblem . 
*/

public interface CipherEncryption {
  
  Map<String,String> encryptEmblem(List<Kingdom> kingdoms);

}