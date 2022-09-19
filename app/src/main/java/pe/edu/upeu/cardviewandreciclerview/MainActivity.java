package pe.edu.upeu.cardviewandreciclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){
    elements = new ArrayList<>();
    elements.add(new ListElement("#7895465","Carlos", "España","activo"));
    elements.add(new ListElement("#7897865","Juan", "Peru","activo"));
    elements.add(new ListElement("#7878465","Josefo", "Chile","activo"));
    elements.add(new ListElement("#7812355","Maria", "Rusia","activo"));
    elements.add(new ListElement("#7897894","Morena", "Japon","inactivo"));

    ListAdapter listAdapter = new ListAdapter(elements, this);
    RecyclerView recyclerView = findViewById(R.id.rv_list);
    recyclerView.setHasFixedSize(true);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    recyclerView.setAdapter(listAdapter);

    }
}