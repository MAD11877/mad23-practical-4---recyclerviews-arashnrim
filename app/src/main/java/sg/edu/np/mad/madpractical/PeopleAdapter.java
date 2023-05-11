package sg.edu.np.mad.madpractical;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.PersonViewHolder> {

    ArrayList<User> data;

    public PeopleAdapter(ArrayList<User> input) {
        data = input;
    }

    // This method is called by the adapter to create a view holder.
    // The adapter will inflate the item layout and pass it to the view holder.
    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.people_list_item, parent, false);
        return new PersonViewHolder(item);
    }

    // This method is called by the adapter to bind the data to the view holder.
    // The adapter will iterate through the data array and call this method for each item.
    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        holder.nameTextView.setText(data.get(position).name);
        holder.descriptionTextView.setText(data.get(position).description);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView descriptionTextView;
        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.listNameTextView);
            descriptionTextView = itemView.findViewById(R.id.listDescriptionTextView);
        }
    }
}
