package com.example.mengdatian.vademo.view.viewholder;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import com.example.mengdatian.vademo.R;

/**
 * @author mengdatian
 */
public class WeatherHolder extends BaseHolder {


    TextView textView;
    public WeatherHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.location);
    }

    public TextView getTextView() {
        return textView;
    }
}
