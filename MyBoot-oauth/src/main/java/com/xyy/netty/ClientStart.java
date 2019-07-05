package com.xyy.netty;

import java.util.Scanner;

public class ClientStart {

	public static void main(String[] args){  
		Scanner input = new Scanner(System.in);
        //Client bootstrap = new Client(8080, "127.0.0.1");  
		Client bootstrap = new Client(11111, "10.18.32.215");
        String infoString = "";
        while (true){
        	infoString = input.nextLine();
        	RequestInfo req = new RequestInfo();  
            req.setType((byte) 1);  
            req.setInfo(infoString);
            bootstrap.sendMessage(req);  
           
        }
	}
}
