package com.example.lenovo.android_test_02.V;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.lenovo.android_test_02.M.FoodBean;
import com.example.lenovo.android_test_02.M.MolderRetrofit;
import com.example.lenovo.android_test_02.P.MainP;
import com.example.lenovo.android_test_02.R;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements ViewInterface{

    private RecyclerView rv;
    MyAdapter adapter;
    MainP mainP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        rv = (RecyclerView) findViewById(R.id.rv);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(manager);
        rv.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        adapter = new MyAdapter();

        mainP = new MainP(this);
        mainP.HandlerStart();

    }

    @Override
    public void viewSuccess(List<FoodBean.DataBean> list) {
        adapter.setList(list);
        rv.setAdapter(adapter);
    }
}
