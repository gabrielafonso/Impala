package com.example.afonsogabriel.impala.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
//import android.support.v7.widget.CardView;
//import android.support.v7.widget.CardView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.afonsogabriel.impala.Base.Produto;
import com.example.afonsogabriel.impala.R;

import java.util.List;

public class AdapterProdutos extends RecyclerView.Adapter<AdapterProdutos.ViewHolder> {
    private Context context;
    private List<Produto> produtos;

    public AdapterProdutos( Context context, List<Produto> produtos){
        this.context =context;
        this.produtos = produtos;
    }

    @NonNull
    @Override//Responsavel por criar as visualizações(cardview) na memoria RAM
    public AdapterProdutos.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                         int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.produto_cardview ,
                parent, false);

        return new ViewHolder(view);

    }


    @Override//Responsavel por criar as visualizações(cardview) na tela do celular
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

       Produto produto = produtos.get(position);
       holder.titulo.setText(produto.getTitulo());
       holder.imagem.setImageDrawable(context.getResources().getDrawable(produto.getImagem()));

    }


    @Override//Responsavel pelo numero de cards(views) na tela
    public int getItemCount() {

       return produtos.size();
}


        public class ViewHolder extends RecyclerView.ViewHolder {

           TextView titulo;
           ImageView imagem;
           CardView cardView;

            public ViewHolder(@NonNull View itemView) {

                super(itemView);

                titulo = itemView.findViewById(R.id.textTitulo);
                imagem = itemView.findViewById(R.id.imagem);
                cardView = itemView.findViewById(R.id.cardview_id);

            }

        }
    }
