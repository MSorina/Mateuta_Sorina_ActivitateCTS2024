package Problema_8_A;

public abstract class ANod {
    public abstract String getNume();


    public String getInfo(){
        return this.getNume() + " ";
    }


    public void adaugaNod(ANod elemStructura){
        throw new UnsupportedOperationException();
    }

    public void eliminaNod(ANod elemStructura){
        throw new UnsupportedOperationException();
    }

    public ANod getNod (int i){
        throw new UnsupportedOperationException();}
}
