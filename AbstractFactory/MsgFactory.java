package AbstractFactory;

public class MsgFactory {
  public Sender produce() {
    return new MailSender();
  }
}
