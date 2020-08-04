package com.tameofthrones;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import com.tameofthrones.controller.ReadMessage;
import com.tameofthrones.controller.RulerStrategy;
import com.tameofthrones.controller.RulerStrategyImp;
import com.tameofthrones.create.CreateKingdoms;
import com.tameofthrones.create.CreateKingdomsImp;
import com.tameofthrones.dto.Kingdom;
import com.tameofthrones.dto.Messages;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {

    ReadMessage readMessage = new ReadMessage();
    List<Messages> messages = readMessage.readInputMessages(args[0]);
    CreateKingdoms createKingdom = new CreateKingdomsImp();
    RulerStrategy rulerStrategy = new RulerStrategyImp();
    List<Kingdom> kingdoms = createKingdom.getKingdoms();
    Set<String> wonKingdoms = rulerStrategy.getWonKingdoms(kingdoms, messages);
    System.out.println(wonKingdoms);
  }
}
