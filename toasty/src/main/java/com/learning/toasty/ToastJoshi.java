package com.learning.toasty;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class ToastJoshi {
    public static void awesomeToast(Context context,String msg){
        Toast toast = Toast.makeText(context,
                msg,
                Toast.LENGTH_SHORT);

        View toastView = toast.getView();
        toastView.setBackgroundResource(R.color.design_default_color_primary_dark);
        toast.show();
    }
}
