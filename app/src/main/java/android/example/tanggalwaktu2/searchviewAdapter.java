package android.example.tanggalwaktu2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class searchviewAdapter extends RecyclerView.Adapter<ViewHolder> implements Filterable {
    List<model> exampleList;
    private List<model> filterList;
    private Context context;
    CustomFilter filter;

    public searchviewAdapter(Context context, List<model> exampleList) {
        this.context = context;
        this.exampleList = exampleList;
        this.filterList = exampleList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        model currentItem = exampleList.get(position);
        holder.mtitle.setText(currentItem.getTitle());
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View view, int pos) {
                if (exampleList.get(pos).getTitle().equals("persiapan haji")) {
                    Intent i = new Intent(context, persiapanhaji2.class);
                    context.startActivity(i);
                } else if (exampleList.get(pos).getTitle().equals("fiqih haji")) {
                    Intent i = new Intent(context, fiqihhaji.class);
                    context.startActivity(i);
                } else if (exampleList.get(pos).getTitle().equals("fiqih umroh")) {
                    Intent i = new Intent(context, FiqihUmrah.class);
                    context.startActivity(i);
                } else if (exampleList.get(pos).getTitle().equals("Dzikir doa")) {
                    Intent i = new Intent(context, DzikirDoa.class);
                    context.startActivity(i);
                } else if (exampleList.get(pos).getTitle().equals("tata cara haji")) {
                    Intent i = new Intent(context, tatacarahaji.class);
                    context.startActivity(i);
                } else if (exampleList.get(pos).getTitle().equals("tata cara umroh")) {
                    Intent i = new Intent(context, tatacaraumroh.class);
                    context.startActivity(i);
                } else if (exampleList.get(pos).getTitle().equals("peta jarak")) {
                    Intent i = new Intent(context, petajarak.class);
                    context.startActivity(i);
                } else if (exampleList.get(pos).getTitle().equals("lokasi ziarah")) {
                    Intent i = new Intent(context, lokasiZiarah.class);
                    context.startActivity(i);
                } else if (exampleList.get(pos).getTitle().equals("tanya jawab")) {
                    Intent i = new Intent(context, tanyajawab.class);
                    context.startActivity(i);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return exampleList.size();
    }

    public CustomFilter getFilter() {
        if (filter == null) {
            filter = new CustomFilter(filterList, this);
        }
        return filter;
    }

}
