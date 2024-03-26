package FactoryMethod;

public class StaticSenderFactory {
  public static Sender produceMsg() {
    return new MsgSender();
  }
  
  public static Sender produceMail() {
    return new MailSender();
  } 
}
