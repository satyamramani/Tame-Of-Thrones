package com.tameofthrones;

import java.io.IOException;
import java.util.List;

import com.tameofthrones.controller.ReadMessage;
import com.tameofthrones.dto.Messages;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {

    ReadMessage readMessage = new ReadMessage();
    List<Messages> m = readMessage.readInputMessages(args[0]);
    for(Messages ms : m) {
        System.out.println(ms.toString());
    }
  }
}
