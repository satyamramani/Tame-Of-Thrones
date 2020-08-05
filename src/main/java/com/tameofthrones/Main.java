package com.tameofthrones;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import com.tameofthrones.controller.RulerStrategy;
import com.tameofthrones.controller.RulerStrategyImp;
import com.tameofthrones.create.CreateKingdoms;
import com.tameofthrones.create.CreateKingdomsImp;
import com.tameofthrones.dto.Kingdom;
import com.tameofthrones.dto.Messages;
import com.tameofthrones.read.ReadMessage;

public class Main {
    public static void main(String[] args) throws IOException {

    ReadMessage readMessage = new ReadMessage();

    //read and store the messages in list of Messages.
    List<Messages> messages = readMessage.readInputMessages(args[0]);

    //create kingdoms
    CreateKingdoms createKingdom = new CreateKingdomsImp();

    List<Kingdom> kingdoms = createKingdom.getKingdoms();

    RulerStrategy rulerStrategy = new RulerStrategyImp();

    Set<String> wonKingdoms = rulerStrategy.getWonKingdoms(kingdoms, messages);

    for (String kingdomName : wonKingdoms) {
      System.out.print(kingdomName + " ");
      System.out.println();
    }
    
  }
}
