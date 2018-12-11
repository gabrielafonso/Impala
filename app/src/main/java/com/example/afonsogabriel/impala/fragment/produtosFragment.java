package com.example.afonsogabriel.impala.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.afonsogabriel.impala.Adapter.AdapterProdutos;
import com.example.afonsogabriel.impala.Base.Produto;
import com.example.afonsogabriel.impala.R;

import java.util.ArrayList;

public class produtosFragment extends Fragment {
    ArrayList<Produto> produtos = new ArrayList<>();

    public produtosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_produto, container, false);

        //pegando o recycler
        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewFragmentProdutos);
        //melhorar desempenho

        recyclerView.setHasFixedSize(true);

        //configura o layout manager

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //dados para o recycler

        criarProdutos();

        AdapterProdutos produtosAdapter = new AdapterProdutos(container.getContext(), produtos);

        recyclerView.setAdapter(produtosAdapter);

        return view;
    }

    public void criarProdutos(){
        produtos.add(new Produto("Prove nossos deliciosos bolos e tortas", R.drawable.torta_morango));
        produtos.add(new Produto("Os mais váriados tipos e sabores de café", R.drawable.capuccino));
        produtos.add(new Produto("Os doces que vão te dá água na boca", R.drawable.sonho));
        produtos.add(new Produto("Croissants, quentinho.", R.drawable.croissants));
        produtos.add(new Produto("Sucos naturais direto da fruta", R.drawable.suco));
    }

}

