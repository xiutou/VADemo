package com.example.mengdatian.vademo.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mengdatian.vademo.R;
import com.example.mengdatian.vademo.model.JavaBean;
import com.example.mengdatian.vademo.view.viewholder.BaseHolder;
import com.example.mengdatian.vademo.view.viewholder.LeftDialogHolder;
import com.example.mengdatian.vademo.view.viewholder.MusicHolder;
import com.example.mengdatian.vademo.view.viewholder.RightDialogHolder;
import com.example.mengdatian.vademo.view.viewholder.WeatherHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mengdatian
 */
public class DialogAdapter extends RecyclerView.Adapter<BaseHolder> {

    List<JavaBean> dialoglist = new ArrayList<>();
    private Context mContext;
    public DialogAdapter(Context context,List <JavaBean> list) {
      this.mContext = context;
      this.dialoglist = list;
    }
    @NonNull
    @Override
    public BaseHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewtype) {
        Log.d("DialogAdapter", "onCreateViewHolder" + viewtype);
        View view;
        BaseHolder baseHolder;
            switch (viewtype) {
                case 0:
                    view = LayoutInflater.from(mContext).inflate(R.layout.left_dialog_layout,viewGroup,false);
                    baseHolder = new LeftDialogHolder(view);
                    return baseHolder;
                case 1:
                    view = LayoutInflater.from(mContext).inflate(R.layout.right_dialog_layout,viewGroup,false);
                    baseHolder = new RightDialogHolder(view);
                    return baseHolder;
                case 2:
                    view = LayoutInflater.from(mContext).inflate(R.layout.weather_layout,viewGroup,false);
                    baseHolder = new WeatherHolder(view);
                    return baseHolder ;
                case 3:
                    view = LayoutInflater.from(mContext).inflate(R.layout.music_layout,viewGroup,false);
                    baseHolder = new MusicHolder(view);
                    return baseHolder;
                default:break;
            }

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BaseHolder baseHolder, int i) {
        Log.d("DialogAdapter", "onBindViewHolder" + i);
       if(baseHolder instanceof LeftDialogHolder){
           LeftDialogHolder leftDialogHolder = (LeftDialogHolder) baseHolder;
           leftDialogHolder.getDialog().setText(dialoglist.get(i).getContent());
       }
       if(baseHolder instanceof RightDialogHolder){
           RightDialogHolder rightDialogHolder = (RightDialogHolder) baseHolder;
           rightDialogHolder.getDialog().setText(dialoglist.get(i).getContent());
       }
       if(baseHolder instanceof WeatherHolder){
           WeatherHolder weatherHolder = (WeatherHolder) baseHolder;
           weatherHolder.getTextView().setText(dialoglist.get(i).getContent());
       }
       if(baseHolder instanceof MusicHolder){
           MusicHolder musicHolder = (MusicHolder) baseHolder;
           ArrayList<JavaBean>arrayList = new ArrayList<>();
           for(int j =0;j<arrayList.size();j++){
               arrayList.add(new JavaBean("",0,""));
           }
           musicHolder.getViewPager().setAdapter(new MusicPageAdapter(mContext,arrayList));
          // musicHolder.getTextView().setText(dialoglist.get(i).getContent());
       }
    }

    @Override
    public int getItemViewType(int position) {
        return dialoglist.get(position).getTag();
    }

    @Override
    public int getItemCount() {
        Log.d("DialogAdapter", "dialoglist.size():" + dialoglist.size());
        return dialoglist.size();
    }
}
