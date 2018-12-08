package mpip.finki.ukim.mk.lab2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class NinaViewHolder extends RecyclerView.ViewHolder {

    public TextView getTextView() {
        return textView;
    }

    public void setTextView(TextView textView) {
        this.textView = textView;
    }

    private TextView textView;

    public NinaViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = (TextView) itemView;
    }


}
