package samples;

import java.util.*;

public class Sample {
  
  public static final int STATIC_NVAR = 999;

  private int nVar = 99;
  public int getNVar() {
    return this.nVar;
  }

  private String sVar = "The quick brown fox...";
  public String getSVar() {
    return this.sVar;
  }

  public static final void main(String[] args) {
    Sample s = new Sample();
    if (s.getNVar() > 0) {
      System.out.printf("%d %d %s\n", Sample.STATIC_NVAR, s.getNVar(), s.getSVar());
    } else {
      System.out.printf("%d < 0\n", s.getNVar());
    }
  }

  public void longString() {
    String s = "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890122345678901234567890";
  }
}