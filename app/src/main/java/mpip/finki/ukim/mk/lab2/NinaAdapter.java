package mpip.finki.ukim.mk.lab2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class NinaAdapter extends RecyclerView.Adapter<NinaViewHolder> {
    private Context context;
    private List<String> data;

    public NinaAdapter(Context context, List<String> data) {
        this.context = context;
        this.data = data;
    }


    @NonNull
    @Override
    public NinaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        NinaViewHolder textViewHolder = new NinaViewHolder(view);
        return textViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NinaViewHolder viewHolder, int i) {
        String dataToShow = data.get(i);
        viewHolder.getTextView().setText(dataToShow);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
