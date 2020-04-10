package android.example.tanggalwaktu2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Navigation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation);

        loadFragment(new MainActivity());
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomnav_main);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frame_layout, fragment)
                    .commit();
            return true;
        }

        return false;
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.home :
                fragment = new MainActivity();
                break;
            case R.id.sholat :
                fragment = new SholatFragment();
                break;
            case R.id.kiblat :
                fragment = new KiblatFragment();
                break;
            case R.id.kesehatan :
                fragment = new KesehatanFragment();
                break;
            case R.id.author :
                fragment = new AuthorFragment();
                break;
        }
        return loadFragment(fragment);
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu, menu);
        super.onCreateOptionsMenu(menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()== R.id.daftar){
            startActivity(new Intent(this, DaftarIsi.class));
        } else if (item.getItemId() == R.id.rate){
            startActivity(new Intent(this, Rate.class));
        }else if (item.getItemId() == R.id.tentang){
            startActivity(new Intent(this,Tentang.class));
        }else if (item.getItemId() == R.id.search){
            startActivity(new Intent(this, searchview.class));
        }
        return true;
    }
}
