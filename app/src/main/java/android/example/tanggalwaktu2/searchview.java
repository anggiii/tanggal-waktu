package android.example.tanggalwaktu2;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class searchview extends AppCompatActivity {

    private searchviewAdapter adapter;
    private RecyclerView rv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rv = findViewById(R.id.listitem);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setItemAnimator(new DefaultItemAnimator());

        adapter = new searchviewAdapter(this, getMyList());
        rv.setAdapter(adapter);


    }

    private ArrayList<model> getMyList() {
        ArrayList<model> exampleList = new ArrayList<>();

        model modelku = new model();
        modelku.setTitle("persiapan haji");
        exampleList.add(modelku);

        modelku = new model();
        modelku.setTitle("fiqih haji");
        exampleList.add(modelku);

        modelku = new model();
        modelku.setTitle("fiqih umroh");
        exampleList.add(modelku);

        modelku = new model();
        modelku.setTitle("Dzikir Doa");
        exampleList.add(modelku);

        modelku = new model();
        modelku.setTitle("tata cara haji");
        exampleList.add(modelku);

        modelku = new model();
        modelku.setTitle("tata cara umroh");
        exampleList.add(modelku);

        modelku = new model();
        modelku.setTitle("peta jarak");
        exampleList.add(modelku);

        modelku = new model();
        modelku.setTitle("lokasi ziarah");
        exampleList.add(modelku);

        modelku = new model();
        modelku.setTitle("tanya jawab");
        exampleList.add(modelku);

        return exampleList;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /*getMenuInflater().inflate( R.menu.optionmenu, menu);
        MenuItem searchItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) searchItem.getActionView();*/
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);

        // Associate searchable configuration with the SearchView
        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView =
                (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                adapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return true;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}


