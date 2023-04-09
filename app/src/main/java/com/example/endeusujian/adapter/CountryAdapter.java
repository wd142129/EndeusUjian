package com.example.endeusujian.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//import com.bumptech.glide.Glide;
//import com.bumptech.glide.request.RequestOptions;
import com.example.endeusujian.MainActivity;
import com.example.endeusujian.R;
import com.example.endeusujian.model.Country;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CustomViewHolder> {
    private List<Country> dataCountry;
    private Context context;
//    private String pathImage ="https://kurio-img.kurioapps.com/20/07/25/8ac66327-ec90-47ca-a35b-d09b4eb439e2.jpg";
    public CountryAdapter(List<Country> dataCountry, Context context) {
        this.dataCountry = dataCountry;
        this.context = context;
    }

//    Membuat Tampilan Awal (create from parent)
    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_item, parent, false);
        return new CustomViewHolder(view);
    }

//    Mengakses Komponen Layout
    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.txtnama.setText(dataCountry.get(position).getNama());
//        Glide.with(holder.itemView.getContext())
//                .load(pathImage)
//                .apply(new RequestOptions().fitCenter())
//                .into(holder.iv_icon);

    }

//    Mendapatkan Jumlah Array / List
    @Override
    public int getItemCount() {
        return 0;
    }

//    Melakukan Proses Binding Terhadap Komponen Layout
    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public final View mview;
    public ImageView iv_icon;

    TextView txtnama;

        CustomViewHolder(View itemView){
            super(itemView);
            mview = itemView;

            txtnama = mview.findViewById(R.id.txt_title);
//            iv_icon =mview.findViewById(R.id.iv_icon);

        }
    }
}
