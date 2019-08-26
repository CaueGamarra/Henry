package com.am.henry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.am.henry.adapters.RunAdapter;
import com.am.henry.model.RunItem;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    RecyclerView RunRecycleView;
    RunAdapter runAdapter;
    List<RunItem> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        RunRecycleView = findViewById(R.id.run_rc);
        mData = new ArrayList<>();
        // PREENCHER A LISTA COM OS DADOS JSON

        mData.add(new RunItem("Corrida - Ford Focus", "Fera do Asfalto", "22/08/2019",90));
        mData.add(new RunItem("Corrida - Ford Ka", "SO SO", "20/08/2019",50));
        mData.add(new RunItem("Corrida - Ford Ka", "Direção Perfeita", "19/08/2019",100));
        mData.add(new RunItem("Corrida - Ford Ka", "SO SO", "22/08/2019",50));

        runAdapter = new RunAdapter(this, mData);
        RunRecycleView.setAdapter(runAdapter);
        RunRecycleView.setLayoutManager(new LinearLayoutManager(this));

    }
}
