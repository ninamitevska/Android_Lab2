package mpip.finki.ukim.mk.lab2;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MoviesActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        recyclerView = (RecyclerView) findViewById(R.id.ninaAdapter);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        adapter = new NinaAdapter(this, getData());
        recyclerView.setAdapter(adapter);
    }
    private List<String> getData(){
        List<String> ninaList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            ninaList.add(new String(i+1 + ". Ova e tekst."));
        }
        return ninaList;
    }
}
