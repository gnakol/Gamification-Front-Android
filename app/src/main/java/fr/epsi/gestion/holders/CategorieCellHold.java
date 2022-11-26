package fr.epsi.gestion.holders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import fr.epsi.gestion.R;


public class CategorieCellHold extends RecyclerView.ViewHolder {

    public TextView nom_categorie_textView;

    public TextView description_categorie_textView;

    public CategorieCellHold(@NonNull View itemView) {
        super(itemView);

        this.nom_categorie_textView = itemView.findViewById(R.id.categorieNomIdTextView);
        this.description_categorie_textView = itemView.findViewById(R.id.categorieDescriptionIdTextView);
    }
}
