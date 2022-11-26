package fr.epsi.gestion.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import fr.epsi.gestion.R;
import fr.epsi.gestion.beans.Categorie;
import fr.epsi.gestion.holders.CategorieCellHold;

public class CategorieAdapter extends RecyclerView.Adapter<CategorieCellHold> {

    private Categorie[] tab_categorie;

    public CategorieAdapter(Categorie[] tab_categorie) {
        this.tab_categorie = tab_categorie;
    }

    @NonNull
    @Override
    public CategorieCellHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categorie_cell, parent, false);

        CategorieCellHold categorieCellHold = new CategorieCellHold(view);

        return categorieCellHold;
    }

    @Override
    public void onBindViewHolder(@NonNull CategorieCellHold holder, int position) {

        holder.nom_categorie_textView.setText(tab_categorie[position].getNom());

        holder.description_categorie_textView.setText(tab_categorie[position].getDescription());
    }

    @Override
    public int getItemCount() {
        return this.tab_categorie.length;
    }
}
