package AbstractFactory;

public class MailFactory implements Factory{
  public Sender produce() {
    return new MailSender();
  }
}
