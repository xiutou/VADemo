package com.example.mengdatian.vademo.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.example.mengdatian.vademo.R;
import com.example.mengdatian.vademo.model.JavaBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mengdatian
 */
public class MusicPageAdapter extends PagerAdapter {
    private Context mContext;
    private List<JavaBean>list = new ArrayList<>();

    public MusicPageAdapter(Context context , ArrayList<JavaBean> list){
        mContext = context;
        list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = View.inflate(mContext, R.layout.music_layout,null);
        container.addView(view);
        return view;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }
}
