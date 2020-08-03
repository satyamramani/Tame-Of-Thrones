package com.tameofthrones.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.tameofthrones.messages.Messages;

/*
* This class have one function readInputMessages which reads the input messages.
* it takes argument filePath as a String (path to the input file).
* returns List of messages for each kingdom.
*/

public class ReadMessage {

  public List<Messages> readInputMessages(String filePath) throws IOException {

    List<Messages> messages = new ArrayList<Messages>();
    String line;
    //read file path
    File file = new File(filePath);
    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);

    //read each line in the input file and seperate kingdom and its message using first space.
    while((line = br.readLine()) != null) {

      String kingdom = line.substring(0,line.indexOf(' '));
      String message = line.substring(line.indexOf(' '));

      Messages encryptedMessages = new Messages(kingdom, message);
      messages.add(encryptedMessages);

    }
    
    br.close();

    return messages;

  }

}