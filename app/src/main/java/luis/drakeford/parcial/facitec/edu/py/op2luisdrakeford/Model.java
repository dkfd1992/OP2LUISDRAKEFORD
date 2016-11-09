package luis.drakeford.parcial.facitec.edu.py.op2luisdrakeford;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by LUIS on 09/11/2016.
 */
public class Model {

    //auto generar el id y tambien crear la colummna id en la tabla
    @DatabaseField(generatedId = true)
    private  int id;


    //crear la columna nombre en la tabla
    @DatabaseField
    private String foto;

    //crear la columna email en la tabla
    @DatabaseField
    private String username;

    @DatabaseField
    private String text;

    @DatabaseField
    private String abatar;


    @DatabaseField
    private boolean faborite;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getUsername() {return username;}


    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAbatar() {
        return abatar;
    }

    public void setAbatar(String abatar) {
        this.abatar = abatar;
    }

    public boolean isFaborite() {
        return faborite;
    }

    public void setFaborite(boolean faborite) {
        this.faborite = faborite;
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", username='" + username + '\'' +
                ", abatar='" + abatar + '\'' +
                ", foto='" + foto + '\'' +
                ", faborite=" + faborite +
                '}';
    }
}
