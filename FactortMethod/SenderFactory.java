package FactortMethod;

public class SenderFactory {
  public Sender produceMsg() {
    return new MsgSender();
  }
  
  public Sender produceMail() {
    return new MailSender();
  }
}

