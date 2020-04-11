package android.example.tanggalwaktu2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends Fragment implements View.OnClickListener {
    Button button;
    CardView crd1, crd2, crd3, crd4, crd5, crd6, crd7, crd8, crd9;
    private Toolbar toolbar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, container, false);

        /*toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);*/
        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(calendar.getTime());
        TextView textViewDate = view.findViewById(R.id.textdate);
        textViewDate.setText(currentDate);

        Calendar calendar1 = Calendar.getInstance();
        String jamskrg = DateFormat.getTimeInstance(DateFormat.SHORT).format(calendar1.getTime());
        TextView textView = view.findViewById(R.id.jam);
        textView.setText(jamskrg);

        crd1 = view.findViewById(R.id.crdpersiapan);
        crd2 = view.findViewById(R.id.crddoa);
        crd3 = view.findViewById(R.id.crdfiqihumroh);
        crd4 = view.findViewById(R.id.crdfqhhj);
        crd5 = view.findViewById(R.id.crdtatacara);
        crd6 = view.findViewById(R.id.crdtatacarahaji);
        crd7 = view.findViewById(R.id.crdpetajarak);
        crd8 = view.findViewById(R.id.crdlokasi);
        crd9 = view.findViewById(R.id.crdtanya);


        crd1.setOnClickListener(this);
        crd2.setOnClickListener(this);
        crd3.setOnClickListener(this);
        crd4.setOnClickListener(this);
        crd5.setOnClickListener(this);
        crd6.setOnClickListener(this);
        crd7.setOnClickListener(this);
        crd8.setOnClickListener(this);
        crd9.setOnClickListener(this);


        button = view.findViewById(R.id.buton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), Maps.class);
                startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.optionmenu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()== R.id.daftar){
            startActivity(new Intent(getActivity(), DaftarIsi.class));
        } else if (item.getItemId() == R.id.rate){
            startActivity(new Intent(getActivity(), Rate.class));
        }else if (item.getItemId() == R.id.tentang){
            startActivity(new Intent(getActivity(),Tentang.class));
        }
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.crdpersiapan:
                startActivity(new Intent(getActivity(), persiapanhaji2.class));
                break;
            case R.id.crdfiqihumroh:
                startActivity(new Intent(getActivity(), FiqihUmrah.class));
                break;
            case R.id.crdfqhhj:
                startActivity(new Intent(getActivity() , fiqihhaji.class));
                break;
            case R.id.crddoa:
                startActivity(new Intent(getActivity() , DzikirDoa.class));
                break;
            case R.id.crdtatacara:
                startActivity(new Intent(getActivity() , tatacaraumroh.class));
                break;
            case R.id.crdtatacarahaji:
                startActivity(new Intent(getActivity() , tatacarahaji.class));
                break;
            case R.id.crdpetajarak:
                startActivity(new Intent(getActivity() , petajarak.class));
                break;
            case R.id.crdlokasi:
                startActivity(new Intent(getActivity() , lokasiZiarah.class));
                break;
            case R.id.crdtanya:
                startActivity(new Intent(getActivity() , tanyajawab.class));
                break;
            default:
               break;
        }
    }
}
