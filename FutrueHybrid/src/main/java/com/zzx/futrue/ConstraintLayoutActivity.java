package com.zzx.futrue;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

/**
 * Created by jasonzhang on 18/3/26.
 */

public class ConstraintLayoutActivity extends Activity implements View.OnClickListener{
    TextView tv2,tv3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        tv3 = findViewById(R.id.textView3);
        tv2 = findViewById(R.id.textView2);
        tv2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.textView2){
            tv2.setVisibility(View.GONE);
        }else if (v.getId() == R.id.textView3){

        }
    }
}
