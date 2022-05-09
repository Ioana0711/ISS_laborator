package bugs;

import java.io.Serializable;
import java.util.List;

public class User implements HasId<Integer>, Serializable {
    Integer id;
    String email;
    String parola;
    String tip;
    List<Integer> id_bug;

    public User(String email, String parola, String tip) {
        this.tip = tip;
        this.email = email;
        this.parola = parola;
    }

    @Override
    public Integer getId() { return id; }

    @Override
    public void setId(Integer id) { this.id = id; }

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
                "email='" + email + '\'' +
                ", parola='" + parola + '\'' +
                ", tip='" + tip + '\'' +
                '}';
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
