package cn.pytester.bbs;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import cn.pytester.bbs.activities.BaseItemsActivity;
import cn.pytester.bbs.activities.ListViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startElementActBt = findViewById(R.id.start_element_practices);
        startElementActBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("pyTester", "User Clicked the start element practices activity button");
                Intent intent = new Intent(MainActivity.this, BaseItemsActivity.class);
                startActivity(intent);
            }
        });

        Button startListViewBt = findViewById(R.id.start_list_view_activity);
        startListViewBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("pyTester", "User Clicked the start ListView practices activity button");
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });


    }

}
