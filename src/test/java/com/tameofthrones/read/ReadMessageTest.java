package com.tameofthrones.read;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.tameofthrones.dto.Messages;

import org.junit.jupiter.api.Test;

public class ReadMessageTest {

    final String filePath = "src/test/java/com/tameofthrones/resources/input.txt";

    @Test
    public void readInputEncryptedMessagesTest() throws IOException {
    
    ReadMessage readMessage = new ReadMessage();
    List<Messages> messages = readMessage.readInputMessages(filePath);

    List<String> encryptedMessages = new ArrayList<String>();
    
    for (Messages message : messages) {
      encryptedMessages.add(message.getMessage());
    }

    Collections.sort(encryptedMessages);

    List<String> expectedMessages = new ArrayList<String>();
    expectedMessages.add("ROZO");
    expectedMessages.add("FAIJWJSOOFAMAU");
    expectedMessages.add("STHSTSTVSASOS");

    Collections.sort(expectedMessages);

    assertEquals(expectedMessages, encryptedMessages);
  }

  @Test
  public void readInputRecieverTest() throws IOException {
    
    ReadMessage readMessage = new ReadMessage();
    List<Messages> messages = readMessage.readInputMessages(filePath);

    List<String> receiver = new ArrayList<String>();
    
    for (Messages message : messages) {
      receiver.add(message.getKingdom());
    }

    Collections.sort(receiver);

    List<String> expectedReceiver = new ArrayList<String>();
    expectedReceiver.add("AIR");
    expectedReceiver.add("LAND");
    expectedReceiver.add("ICE");

    Collections.sort(expectedReceiver);

    assertEquals(expectedReceiver, receiver);
  }

}