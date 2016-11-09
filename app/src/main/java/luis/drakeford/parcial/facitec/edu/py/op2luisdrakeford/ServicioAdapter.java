package luis.drakeford.parcial.facitec.edu.py.op2luisdrakeford;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by LUIS on 09/11/2016.
 */
public class ServicioAdapter extends BaseAdapter{
    private List<Model> modelo;
    private Context context;

    public ServicioAdapter(List<Model> modelo, Context context){
        this.modelo = modelo;
        this.context = context;
    }


    @Override
    public int getCount() {
        return modelo.size();}



    @Override
    public Object getItem(int position) {
        return modelo.get(position);}


    @Override
    public long getItemId(int position) {
        return  modelo.get(position).getId();}

    @Override
    public View getView(int position, View convetView, ViewGroup parent) {
        View view = convetView;
        if(convetView==null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_layout_servicio,null);
        }
        Model m = this.modelo.get(position);

        TextView TextViewNombre = (TextView) view.findViewById(R.id.textViewNombre);
        TextView TextViewtexto = (TextView) view.findViewById(R.id.textViewTexto);
        ImageView FotoImageView = (ImageView) view.findViewById(R.id.imageViewFoto);


        TextViewNombre.setText(m.getUsername());
        TextViewtexto.setText(m.getText());

        Picasso.with(this.context).load(m.getFoto()).into(FotoImageView);



        return  view;
    }
}
