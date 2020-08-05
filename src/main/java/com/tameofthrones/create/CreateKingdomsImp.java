package com.tameofthrones.create;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.tameofthrones.dto.Kingdom;

public class CreateKingdomsImp implements CreateKingdoms {

  List<Kingdom> kingdoms = new ArrayList<Kingdom>();

  final String filePath = "src/main/java/com/tameofthrones/resources/kingdom.txt";

  public List<Kingdom> getKingdoms() throws IOException {

    String line;
    //read file path
    File file = new File(filePath);
    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);

    //read each line in the input file and seperate kingdom and its emblem using first space.
    while((line = br.readLine()) != null) {

      String kingdomName = line.substring(0,line.indexOf(' '));
      String emblem = line.substring(line.indexOf(' ')+1).toUpperCase();

      kingdoms.add(new Kingdom(kingdomName, emblem));

    }
    
    br.close();

    return kingdoms;
  }

}