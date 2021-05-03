package com.coin;

import javax.swing.*;
import java.security.SecureRandom;

public class CoinTossing {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private int playerChoice;
    private static int headPoints;
    private static int tailPoints;
    private Coin coin;
    private static final int HEADS = 1;
    private static final int TAILS = 2;

    public void setPlayerChoice(int playerChoice){
        this.playerChoice = playerChoice;
    }

    public int getPlayerChoice(){
        return playerChoice;
    }

    public void setSide(Coin coinSide){
        coin = coinSide;
    }

    private int randomization(){
        int toss = 1 + randomNumbers.nextInt(2);
        return toss;
    }

    private Coin getCoinSide(){
        switch(randomization()){
            case HEADS -> {setSide(Coin.HEADS); headPoints++;}
            case TAILS -> {setSide(Coin.TAILS); tailPoints++;}
        }
        return coin;
    }

    private String flip(){
        String message = "";
        switch(getCoinSide()){
            case HEADS -> {
                message = "User tossed heads";
            }
            case TAILS -> {
                message = "User tossed tails";
            }
        }
        return message;
    }

    public int startGame(){
        return randomization();
    }

    public static void main(String[] args) {
        CoinTossing toss = new CoinTossing();

        toss.setPlayerChoice(Integer.parseInt(JOptionPane.showInputDialog("Enter any number to TOSS COIN and -1 to exit the game")));

        while(toss.getPlayerChoice() != -1){
            toss.startGame();
            System.out.println(toss.flip());
            toss.setPlayerChoice(Integer.parseInt(JOptionPane.showInputDialog("Enter any number to TOSS COIN and -1 to exit the game")));
        }

        if(headPoints > tailPoints){
            System.out.println("HEADS has " + headPoints + " points and TAILS has " + tailPoints + " points.\nHEADS wins!!!");
        }

        if(tailPoints > headPoints){
            System.out.println("TAILS has " + tailPoints + " points and HEADS has " + headPoints + " points.\nTAILS wins!!!");
        }

        if(headPoints == tailPoints){
            System.out.println("HEADS has " + headPoints + " points and TAILS has " + tailPoints + " points.\nIt is a tie!!!");
        }
    }

}
