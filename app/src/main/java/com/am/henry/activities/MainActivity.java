package com.am.henry.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.am.henry.HistoryActivity;
import com.am.henry.R;
import com.am.henry.adapters.RunAdapter;
import com.am.henry.model.RunItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView RunRecycleView;
    RunAdapter runAdapter;
    List<RunItem> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciando os cards
        imageCard = (CardView) findViewById(R.id.image_card);
        audioCard = (CardView) findViewById(R.id.audio_card);
        notebookCard = (CardView) findViewById(R.id.notebook_card);

        //Adicionando o listener nos cards
        imageCard.setOnClickListener(this);
        audioCard.setOnClickListener(this);
        notebookCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            //@TODO - CRIAR CLASSES E AJUSTAR O SWITCH - AJUSTAR O CICLO DE VIDA DA ACTIVITY
            case R.id.image_card: i = new Intent(this, CameraActivity.class); startActivity(i); break;
            case R.id.audio_card: i = new Intent(this, HistoryActivity.class); startActivity(i); break;
            default: break;
        }
    }
}
