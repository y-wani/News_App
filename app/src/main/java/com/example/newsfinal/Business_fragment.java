package com.example.newsfinal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Business_fragment extends Fragment {

    String key = "dfb52f565b824f62bca2f183ce81f672";
    ArrayList<Modelclass> modelclassArrayList;
    Adapter adapter;
    String country = "us";
    private RecyclerView recyclerViewofbusiness;
    private String category = "business";

    View v;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.business_fragement, null);
        recyclerViewofbusiness = v.findViewById(R.id.businessrecycler);
        modelclassArrayList = new ArrayList<>();
        recyclerViewofbusiness.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(getContext(), modelclassArrayList);
        recyclerViewofbusiness.setAdapter(adapter);

        findNews();

        return v;
    }

    private void findNews() {

        ApiUtil.getApiInterface().getCategoryNews(country,category,100,key).enqueue(new Callback<mainNews>() {
            @Override
            public void onResponse(Call<mainNews> call, Response<mainNews> response) {
                if (response.isSuccessful())
                {
                    modelclassArrayList.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<mainNews> call, Throwable t) {

            }
        });


    }
}
