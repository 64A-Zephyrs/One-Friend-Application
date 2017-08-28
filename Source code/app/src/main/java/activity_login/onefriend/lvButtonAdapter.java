package activity_login.onefriend;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Barry on 27/4/17.
 */

public class lvButtonAdapter extends BaseAdapter {
    private class buttonViewHolder {
        ImageView appIcon;
        TextView appName2;
        TextView appName3;
        TextView appName;
        ImageButton buttonClose;
    }

    private ArrayList<HashMap<String, Object>> mAppList;
    private LayoutInflater mInflater;
    private Context mContext;
    private String[] keyString;
    private int[] valueViewID;
    private buttonViewHolder holder;

    public lvButtonAdapter(Context c, ArrayList<HashMap<String, Object>> appList, int resource,
                           String[] from, int[] to) {
        mAppList = appList;
        mContext = c;
        mInflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        keyString = new String[from.length];
        valueViewID = new int[to.length];
        System.arraycopy(from, 0, keyString, 0, from.length);
        System.arraycopy(to, 0, valueViewID, 0, to.length);
    }

    @Override
    public int getCount() {
        return mAppList.size();
    }

    @Override
    public Object getItem(int position) {
        return mAppList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void removeItem(int position){
        mAppList.remove(position);
        this.notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView != null) {
            holder = (buttonViewHolder) convertView.getTag();
        } else {
            convertView = mInflater.inflate(R.layout.example, null);
            holder = new buttonViewHolder();
            holder.appIcon = (ImageView)convertView.findViewById(valueViewID[0]);
            holder.appName = (TextView)convertView.findViewById(valueViewID[1]);
            holder.appName2 = (TextView)convertView.findViewById(valueViewID[2]);
            holder.appName3 = (TextView)convertView.findViewById(valueViewID[3]);
            holder.buttonClose = (ImageButton)convertView.findViewById(valueViewID[4]);
            convertView.setTag(holder);
        }

        HashMap<String, Object> appInfo = mAppList.get(position);
        if (appInfo != null) {
            String aname = (String) appInfo.get(keyString[1]);
            String aname2 = (String) appInfo.get(keyString[2]);
            String aname3 = (String) appInfo.get(keyString[3]);
            int mid = (Integer)appInfo.get(keyString[0]);
            int bid = (Integer)appInfo.get(keyString[4]);
            holder.appName.setText(aname);
            holder.appName2.setText(aname2);
            holder.appName3.setText(aname3);
            holder.appIcon.setImageDrawable(holder.appIcon.getResources().getDrawable(mid));
            holder.buttonClose.setImageDrawable(holder.buttonClose.getResources().getDrawable(bid));
            holder.buttonClose.setOnClickListener(new lvButtonListener(position));
        }
        return convertView;
    }

    class lvButtonListener implements View.OnClickListener {
        private int position;

        lvButtonListener(int pos) {
            position = pos;
        }

        @Override
        public void onClick(View v) {
            int vid=v.getId();
            if (vid == holder.buttonClose.getId())
                removeItem(position);
        }
    }
}