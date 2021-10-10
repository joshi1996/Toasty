package com.learning.toasty;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ToastJoshi {
    public static void awesomeToast(Context context, String msg){

        final View toastLayout = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.activity_toast, null);
        final LinearLayout toastRoot = toastLayout.findViewById(R.id.toastLayout);
        final TextView toastTextView = toastLayout.findViewById(R.id.toast);

        toastTextView.setText(msg);
        Toast toast = new Toast(context);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastRoot);
        toast.show();
    }
}
