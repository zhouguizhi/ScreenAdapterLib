package com.test;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import com.adapter.util.AdapterUtil;
/**
 * Created by zhouguizhijxhz on 2017/12/7.
 */
public class CommonActivity extends AppCompatActivity {
    private Button button;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);
        button = (Button) findViewById(R.id.button);
        AdapterUtil.setMargin(button,1060,120,10,90,10,0);
    }
}
