package FactortMethod;

public class main {
  public static void main(String[] args) {
    SenderFactory factory = new SenderFactory();
    Sender mail = factory.produceMail();
    mail.send();
    Sender msg = factory.produceMsg();
    msg.send();
    
    Sender mail1 = StaticSenderFactory.produceMail();
    mail1.send();
    Sender msg1 = StaticSenderFactory.produceMsg();
    msg1.send();
  }
}
