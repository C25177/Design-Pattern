package MediatorMode;

public class SectionMediator {
  private SectionA A = new SectionA();
  private SectionB B = new SectionB();
  public void SectionArequest() {
    A.request();
    B.show();
  }
  public void SectionBrequest() {
    B.request();
    A.show();
  }
}
