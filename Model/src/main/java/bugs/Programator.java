package bugs;

import java.io.Serializable;
import java.util.List;

public class Programator implements HasId<Integer>, Serializable {
    Integer id;
    String nume;
    String email;
    String parola;
    List<Integer> id_bug;

    public Programator(String nume, String email, String parola) {
        this.nume = nume;
        this.email = email;
        this.parola = parola;
    }

    @Override
    public Integer getId() { return id; }

    @Override
    public void setId(Integer id) { this.id = id; }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    @Override
    public String toString() {
        return "Programator{" +
                "nume='" + nume + '\'' +
                ", email='" + email + '\'' +
                ", parola='" + parola + '\'' +
                '}';
    }
}
