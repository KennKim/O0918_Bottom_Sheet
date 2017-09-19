package com.project.tk.o0918_bottom_sheet;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.project.tk.o0918_bottom_sheet.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding b;
    private BottomSheetBehavior bottomSheetBehavior;
    private BottomSheetDialogFragment bSDF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        b = DataBindingUtil.setContentView(this, R.layout.activity_main);
        b.setActivity(this);

        bottomSheetBehavior = BottomSheetBehavior.from(b.bottomSheet);

        bSDF = new MyBottomSheetDialog();
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                break;
            case R.id.btn2:
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                break;
            case R.id.btn3:
                bSDF.show(getSupportFragmentManager(), bSDF.getTag());
                break;
            case R.id.btn4:
                bSDF.dismiss();
                break;
            case R.id.tv1:
                Toast.makeText(MainActivity.this,"text1111",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv2:
                Toast.makeText(MainActivity.this,"text2222",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv3:
                Toast.makeText(MainActivity.this,"text3333",Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
