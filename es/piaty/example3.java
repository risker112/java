package es.piaty;

public class example3 {

    private int id;
    private String meno;
    public int getId() {
        return id;
    }
    public void setId(int id) //mutator method
    {
        this.id = id;
    }
    public String getMeno()
    {
        return meno;
    }
    public void setMeno(String meno)
    {
        this.meno = meno;
    }
    public void zobraz()
    {
        System.out.println("id: "+id);
        System.out.println("Meno študenta: "+meno);
    }

}
