package android.example.tanggalwaktu2;

import android.widget.Filter;

import java.util.ArrayList;
import java.util.List;

class CustomFilter extends Filter {
    searchviewAdapter adapter;
    List<model> filterList;

    public CustomFilter(List<model> filterList, searchviewAdapter adapterku){
        this.adapter = adapterku;
        this.filterList = filterList;
    }

    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults results = new FilterResults();
        if(constraint != null && constraint.length() > 0)
        {
            constraint = constraint.toString().toUpperCase();
            ArrayList<model> filteredTitle=new ArrayList<>();
            for (int i=0;i<filterList.size();i++)
            {
                if(filterList.get(i).getTitle().toUpperCase().contains(constraint))
                {
                    filteredTitle.add(filterList.get(i));
                }
            }
            results.count=filteredTitle.size();
            results.values=filteredTitle;
        }else
        {
            results.count=filterList.size();
            results.values=filterList;
        }
        return results;
    }

    @Override
    protected void publishResults(CharSequence charSequence, FilterResults results) {
        adapter.exampleList= (ArrayList<model>) results.values;
        adapter.notifyDataSetChanged();
    }
}
