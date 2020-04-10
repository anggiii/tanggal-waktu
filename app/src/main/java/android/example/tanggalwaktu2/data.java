package android.example.tanggalwaktu2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class data extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
}

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.crdpersiapan:
                startActivity(new Intent(this, persiapanhaji2.class));
                break;
            case R.id.crdfiqihumroh:
                startActivity(new Intent(this, FiqihUmrah.class));
                break;
            case R.id.crdfqhhj:
                startActivity(new Intent(this , fiqihhaji.class));
                break;
            case R.id.crddoa:
                startActivity(new Intent(this , DzikirDoa.class));
                break;
            case R.id.crdtatacara:
                startActivity(new Intent(this , tatacaraumroh.class));
                break;
            case R.id.crdtatacarahaji:
                startActivity(new Intent(this , tatacarahaji.class));
                break;
            case R.id.crdpetajarak:
                startActivity(new Intent(this , petajarak.class));
                break;
            case R.id.crdlokasi:
                startActivity(new Intent(this , lokasiZiarah.class));
                break;
            case R.id.crdtanya:
                startActivity(new Intent(this , tanyajawab.class));
                break;
            default:
                break;
        }
    }
}
