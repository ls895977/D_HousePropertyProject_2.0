package com.lykj.aextreme.afinal.utils;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.lykj.aextreme.R;


public class MyToast {

    public static void show(Context context, String msg) {
        Toast toast = new Toast(context);
        View v = LayoutInflater.from(context).inflate(R.layout.toast, null);
        TextView txtMsg = (TextView) v.findViewById(R.id.txtMsg);
        txtMsg.setText(msg == null ? "错误" : msg);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(v);
        toast.show();
    }

    public static void show(Context context, View v) {
        Toast toast = new Toast(context);
        toast.setView(v);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(v);
        toast.show();
    }
}