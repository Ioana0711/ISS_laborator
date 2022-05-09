package bugs;

import java.io.Serializable;

public class Bug implements HasId<Integer>, Serializable {
    Integer id;
    String denumire;
    String descriere;

    public Bug(String denumire, String descriere) {
        this.denumire = denumire;
        this.descriere = descriere;
    }

    @Override
    public Integer getId() { return id; }

    @Override
    public void setId(Integer id) { this.id = id; }

    public String getDenumire() { return denumire; }

    public void setDenumire(String denumire) { this.denumire = denumire; }

    public String getDescriere() { return descriere; }

    public void setDescriere(String descriere) { this.descriere = descriere; }

    @Override
    public String toString() {
        return "Bug{" +
                "denumire='" + denumire + '\'' +
                ", descriere='" + descriere + '\'' +
                '}';
    }
}
