package cn.pytester.bbs.activities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.pytester.bbs.R;

public class ListViewActivity extends AppCompatActivity {

    private String[] names = new String[]{"井野", "小樱", "雏田"};
    private String[] says = new String[]{"无形被黑，最为致命", "大神好厉害~", "我将带头日狗~"};
    private int[] avatarIds = new int[] {R.mipmap.avatar_1, R.mipmap.avatar_2, R.mipmap.avatar_3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        List<Map<String, Object>> listitem = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < names.length; i++) {
            Map<String, Object> showItem = new HashMap<String, Object>();
            showItem.put("avatar", avatarIds[i]);
            showItem.put("name", names[i]);
            showItem.put("says", says[i]);
            listitem.add(showItem);
        }

        SimpleAdapter myAdapter = new SimpleAdapter(getApplicationContext(),
                                                    listitem,
                                                    R.layout.my_list_item,
                                                    new String[]{"avatar", "name", "says"},
                                                    new int[]{R.id.avatar, R.id.name, R.id.says});

        ListView listView = (ListView) findViewById(R.id.list_view_list);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String result = adapterView.getItemAtPosition(i).toString();
                Log.d("pyTester", result);
            }
        });
    }
}
