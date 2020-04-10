package android.example.tanggalwaktu2;

/*public class AdapterSearch extends RecyclerView.Adapter<AdapterSearch.holder> implements Filterable {


    Context context;
    private List<model> ihramModel;


    static class holder extends RecyclerView.ViewHolder {
        TextView textView;

        holder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_penjelas);
        }

    }

    AdapterSearch(List<model> ihramModel) {
        this.ihramModel = ihramModel;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        model model2 = ihramModel.get(position);
        holder.textView.setText(model2.getTitle());
        holder.setOnClickListner(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {
                if (ihramModel.get(position).getTitle().equals("persiapan haji")) {
                    Intent in = new Intent(context, persiapanhaji2.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Fiqih Umrah")) {
                    Intent in = new Intent(context, FiqihUmrah.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Fiqih Haji")) {
                    Intent in = new Intent(context, fiqihhaji.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Dzikir Doa  ")) {
                    Intent in = new Intent(context, DzikirDoa.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Tata Cara Umroh ")) {
                    Intent in = new Intent(context, tatacaraumroh.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Tata Cara Haji")) {
                    Intent in = new Intent(context, tatacarahaji.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Peta Jarak")) {
                    Intent in = new Intent(context, petajarak.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Lokasi Ziarah")) {
                    Intent in = new Intent(context, lokasiZiarah.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Tanya Jawab")) {
                    Intent in = new Intent(context, tanyajawab.class);
                    context.startActivity(in);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return ihramModel.size();
    }

    public Filter getFilter() {
        return exampleFilter;
    }

    private Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<model> filteredList = new ArrayList<>();
            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(ihramModel);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();
                for (model item : ihramModel) {
                    if (item.getTitle().toLowerCase().contains(filterPattern)) {
                        filteredList.add(item);
                    }
                }
            }
            FilterResults results = new FilterResults();
            results.values = filteredList;
            return results;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults results) {
            ihramModel.clear();
            ihramModel.addAll((List) results.values);
            notifyDataSetChanged();
        }
        };
    }

     */


