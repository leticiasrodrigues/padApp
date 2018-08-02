package com.example.ltc.pad.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ltc.pad.Models.Pad;
import com.example.ltc.pad.R;

import java.util.List;

/**
 * Created by leticiarodrigues on 24/07/2018.
 */

public class PadsAdapter extends RecyclerView.Adapter<PadsAdapter.PadViewHolder> {

    private List<Pad> padsList;

    public class PadViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public PadViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
        }
    }

    public PadsAdapter(List<Pad> moviesList) {
        this.padsList = moviesList;
    }

    @Override
    public PadViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pad_list_row, parent, false);

        return new PadViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PadViewHolder holder, int position) {
        Pad pad = padsList.get(position);
        holder.title.setText(pad.getName());
    }

    @Override
    public int getItemCount() {
        return padsList.size();
    }
}
