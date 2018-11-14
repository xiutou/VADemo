package com.example.mengdatian.vademo.view.viewholder;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import com.example.mengdatian.vademo.R;
/**
 * @author mengdatian
 */
public class LeftDialogHolder extends BaseHolder {
    TextView dialog;

    public TextView getDialog() {
        return dialog;
    }

    public LeftDialogHolder(@NonNull View itemView) {
        super(itemView);
        dialog = itemView.findViewById(R.id.lefttext);

    }
}
