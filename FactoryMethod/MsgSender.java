package FactoryMethod;

public class MsgSender implements Sender{
  @Override
  public void send() {
    System.out.println("send msg");
  }
}
