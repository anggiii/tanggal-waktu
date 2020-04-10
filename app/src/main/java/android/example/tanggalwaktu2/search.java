package android.example.tanggalwaktu2;

/*import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class search extends AppCompatActivity {
    private List<model> ihramModel;
    private AdapterSearch adapterSearch;
    TextView apakek;
    SearchView searchView;
    RecyclerView mrecyclerView;
    ListView lv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_search);
        super.onCreate(savedInstanceState);
        apakek = findViewById(R.id.test);

        RecyclerView mrecyclerView = findViewById(R.id.list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mrecyclerView.setLayoutManager(layoutManager);
        mrecyclerView.setHasFixedSize(true);

        adapterSearch = new AdapterSearch(ihramModel);
        mrecyclerView.setAdapter(adapterSearch);
        ihramModel = getMyList();




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        searchView = findViewById(R.id.searchView);
        MenuItem searchItem = menu.findItem(R.id.search);
        getMenuInflater().inflate(R.menu.menu2, menu);

        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String s) {
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
            adapterSearch.getFilter().filter(newText);
            return false;
            }
        });
        return true;
    }
        private ArrayList<model> getMyList() {
            ArrayList<model> models = new ArrayList<>();

            model model = new model();
            model.setTitle("persiapan haji");
            models.add(model);

            model = new model();
            model.setTitle("Fiqih Umrah ");
            models.add(model);

            model = new model();
            model.setTitle("Fiqih Haji");
            models.add(model);

            model = new model();
            model.setTitle("Dzikir Doa");
            models.add(model);

            model = new model();
            model.setTitle("Tata Cara Umroh");
            models.add(model);

            model = new model();
            model.setTitle("Tata Cara Haji");
            models.add(model);

            model = new model();
            model.setTitle("Peta Jarak");
            models.add(model);

            model = new model();
            model.setTitle("Lokasi Ziarah");
            models.add(model);

            model = new model();
            model.setTitle("Tanya Jawab");
            models.add(model);

            return models;
        }
}

 */
