package cn.pytester.bbs.activities;

import android.os.Bundle;
import android.util.Log;

import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import cn.pytester.bbs.R;

public class BaseItemsActivity extends AppCompatActivity {

    private RadioGroup rb_group;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_items);

        rb_group = findViewById(R.id.baseItemsRadioGroup);
        rb_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Log.d("pyTester", ""+i);
                for(int j = 0; j < rb_group.getChildCount(); j++) {
                    RadioButton rb = (RadioButton) rb_group.getChildAt(j);
                    if (rb.isChecked()) {
                        Log.d("pyTester", "RadioButton " + rb.getText() + " selected");
                    }
                }
            }
        });


    }
}
