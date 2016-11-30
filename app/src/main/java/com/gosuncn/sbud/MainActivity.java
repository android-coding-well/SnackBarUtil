package com.gosuncn.sbud;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.gosuncn.sbud.databinding.ActivityMainBinding;
import com.junmeng.snackbar.ColorSnackbar;

import static android.support.design.widget.Snackbar.make;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
    }

    public void onClickShow(View view) {
        ColorSnackbar.alert(Snackbar.make(binding.llRoot,"alert",Snackbar.LENGTH_SHORT));

    }

    public void onClickShow2(View view) {
        ColorSnackbar.warning(make(binding.llRoot,"warning",Snackbar.LENGTH_SHORT));
    }

    public void onClickShow3(View view) {
        ColorSnackbar.error(make(binding.llRoot,"error",Snackbar.LENGTH_SHORT));
    }

    public void onClickShow4(View view) {
        ColorSnackbar.alert(make(binding.llRoot,"alert",Snackbar.LENGTH_SHORT),R.mipmap.ic_launcher);
    }
}
