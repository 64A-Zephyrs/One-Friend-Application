package activity_login.onefriend;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Barry on 27/4/17.
 */
// android:src = "@drawable/ic_launcher_round"
public class lvWithButtonExt extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exmple_main);

        // 关联Layout中的ListView
        ListView vncListView = (ListView)findViewById(android.R.id.list);

        // 生成动态数组，加入数据
        ArrayList<HashMap<String, Object>> remoteWindowItem = new ArrayList<HashMap<String, Object>>();
        int[] dataCell = new int[] {R.id.ItemImage,R.id.ItemWinName,R.id.ItemWinName2,R.id.ItemWinName3,R.id.ItemCloseWin};
        for(int i=0;i<15;i++)
        {
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("ItemImage", R.drawable.ic_account_circle_black_24dp);//图像资源的ID
            map.put("ItemWinName", "Window ID "+i);
            map.put("ItemWinName2", "Window ID "+i);
            map.put("ItemWinName3", "Window ID "+i);
            map.put("ItemCloseWin", android.R.drawable.ic_menu_close_clear_cancel);
            remoteWindowItem.add(map);
        }

        // 生成适配器的Item和动态数组对应的元素
        lvButtonAdapter listItemAdapter = new lvButtonAdapter(
                this,
                remoteWindowItem,//数据源
                R.layout.example,//ListItem的XML实现

                //动态数组与ImageItem对应的子项
                new String[] {"ItemImage","ItemWinName","ItemWinName2","ItemWinName3","ItemCloseWin"},
                //ImageItem的XML文件里的一个ImageVi面ew,两个TextView ID
                new int[] {R.id.ItemImage,R.id.ItemWinName,R.id.ItemWinName2,R.id.ItemWinName3,R.id.ItemCloseWin}
        );

        vncListView.setAdapter(listItemAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        // TODO Auto-generated method stub
        super.onListItemClick(l, v, position, id);
        l.getItemAtPosition(position);

        new AlertDialog.Builder(this).setTitle("我的listview").setMessage("介绍...")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }}).show();
    }
}