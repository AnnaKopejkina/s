package com.example.spravochnik;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PopugAdapter extends RecyclerView {

@NonNull
@Override

    private final LayoutInflater inflater;
    private final List<Popug> popugs;

    public PopugAdapter(Context context, List<Popug> popugs){
        this.inflater = LayoutInflater.from(context);
        this.popugs = popugs;
    }

    @NonNull
    @Override

    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int postion){
        View view = inflater.inflate(R.layout.list, parent, false);
        return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int postion){
        Popug popug = popugs.get(postion);
        holder.popugeView.setImageResource(popug.setResource();)
            holder.nameView.setText(animal.getName());
            holder.popugeDescriptionView.setText(popug.getOpisanie());
            holder.osobenostySizeView.setText(popuge.getOsoennost);
    }
@Override
public  int getItemCount(){
        return 0;
}

    public PopugAdapter(@NonNull Context context) {
        super(context);
    }
}
