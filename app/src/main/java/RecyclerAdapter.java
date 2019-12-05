import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apicalling.R;
import com.example.apicalling.contact;

import java.util.List;
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewholder> {
    private List<contact> contacts;
    public RecyclerAdapter(List<contact> contacts)
    {
        this.contacts=contacts;
    }





    @Override
    public MyViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);

        return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder( MyViewholder holder, int position) {
holder.Name.setText(contacts.get(position).getName());
        holder.Email.setText(contacts.get(position).getEmail());

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }
    public class MyViewholder extends RecyclerView.ViewHolder {
        TextView Name,Email;
        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            Name=(TextView)itemView.findViewById(R.id.name);
            Email=(TextView)itemView.findViewById(R.id.email);
        }
    }
}

