package com.example.mengdatian.vademo.view.viewholder;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.example.mengdatian.vademo.R;

/**
 * @author mengdatian
 */
public class MusicHolder extends BaseHolder {
    ViewPager viewPager;

    public ViewPager getViewPager() {
        return viewPager;
    }

    public MusicHolder(@NonNull View itemView) {
        super(itemView);
       viewPager = (ViewPager) itemView.findViewById(R.id.music_viewPage);
    }

}
