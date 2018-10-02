package com.a_liutarovich.gifsearcher.ui;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.a_liutarovich.gifsearcher.Adapters.GifAdapter;
import com.a_liutarovich.gifsearcher.Models.Gifs;
import com.a_liutarovich.gifsearcher.R;
import com.a_liutarovich.gifsearcher.API.Response;

public class FragmentMain extends Fragment {

    private static final String TAG = FragmentMain.class.getSimpleName();
    public static final String API_KEY = "Scgi7vOYPdL1ANOx4SeqAfKhSYY8K1ku";
    private RecyclerView mRecyclerView;
    private GifAdapter mGifAdapter;
    Response mResponse = new Response();
    private Gifs gifs;
    private EditText mEtSearch;


    public static FragmentMain createInstance(FragmentManager fragmentManager) {
        FragmentMain myFragment = (FragmentMain) fragmentManager.findFragmentByTag(FragmentMain.TAG);
        if (myFragment == null) {
            myFragment = new FragmentMain();
        }
        return myFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        mEtSearch = (EditText) view.findViewById(R.id.et_search);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(), 3);
        mRecyclerView.setLayoutManager(layoutManager);

        initView();

        mEtSearch.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
                gifs = mResponse.callSearchGif(getActivity(),mEtSearch.getText().toString(), API_KEY);
                if (gifs != null && gifs.getData().size() > 0){
                    mGifAdapter = new GifAdapter(getContext(), gifs);
                    mRecyclerView.setAdapter(mGifAdapter);
                }
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });
        return view;
    }

    public void initView () {

        gifs = mResponse.callTrendingGif(getActivity(), API_KEY);
        if (gifs != null){
            mGifAdapter = new GifAdapter(getContext(), gifs);
            mRecyclerView.setAdapter(mGifAdapter);
        }

    }
}