package android.example.tanggalwaktu2;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView mtitle;
    private ItemClickListener itemClickListener;

    public ViewHolder( View itemView) {
        super(itemView);
        this.mtitle = itemView.findViewById(R.id.text_penjelas);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.itemClickListener.onItemClick(view, getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic) {
        this.itemClickListener = ic;
    }
}
