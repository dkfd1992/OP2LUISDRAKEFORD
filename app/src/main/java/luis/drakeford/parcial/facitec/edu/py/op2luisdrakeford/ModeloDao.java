package luis.drakeford.parcial.facitec.edu.py.op2luisdrakeford;

import android.content.Context;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by LUIS on 09/11/2016.
 */
public class ModeloDao {

    public ModeloDao(Context context){
        DBA.init(context);

    }
    public void crear( Model m){
        try {
            DBA.getDao().create(m);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Model seleccionar(int id){
        try {
            return DBA.getDao().queryForId(id);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;

        }

    }

    public List<Model> seleccionarTodo(){
        try {
            return DBA.getDao().queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;

        }
    }

    public void eliminar(int id){
        try {
            DBA.getDao().deleteById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizar(Model m){
        try {
            DBA.getDao().update(m);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
