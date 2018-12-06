package com.example.afonsogabriel.impala.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.afonsogabriel.impala.R;
import com.example.afonsogabriel.impala.activity.ProdutosActivity;

import java.util.List;

public class AdapterProdutos extends RecyclerView.Adapter<AdapterProdutos.ViewHolder> {

    private List<ProdutosActivity> produtos;

    public AdapterProdutos(List<ProdutosActivity> produtos){
        this.produtos = produtos;
    }

    @NonNull
    @Override//Responsavel por criar as visualizações(cardview) na memoria RAM
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                         int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_produto, parent, false);

        return new ViewHolder(view);

    }


    @Override//Responsavel por criar as visualizações(cardview) na tela do celular
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ProdutosActivity postagem = produtos.get(position);

        holder.textTitulo.setText(postagem.getTitulo());
        holder.imagemProduto.setImageResource(postagem.getImagem());

    }


    @Override//Responsavel pelo numero de cards(views) na tela
    public int getItemCount() {

       return produtos.size();
}


        public class ViewHolder extends RecyclerView.ViewHolder {

            private TextView textTitulo;
            private ImageView imagemProduto;

            public ViewHolder(View itemView) {

                super(itemView);

                textTitulo = itemView.findViewById(R.id.textTitulo);
                imagemProduto = itemView.findViewById(R.id.imagemProduto);

            }

        }
    }
