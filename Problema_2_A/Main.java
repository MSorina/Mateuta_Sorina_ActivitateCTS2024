package Problema_2_A;

public class Main {
  public static void main(String[] args) {
      SpitalFactory spitalFactory = new SpitalFactory();
      ISpital spital = null;
      try {
          spital = spitalFactory.createPersonal(ETipPersonal.Asistent);
      } catch (Exception e) {
          e.printStackTrace();
      }
      spital.descrierePersonal();
  }

}
