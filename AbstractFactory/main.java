package AbstractFactory;

public class main {
  public static void main(String[] args) {
    Factory factory = new MailFactory();
    Sender mail = factory.produce();
    mail.send();
  }
}
