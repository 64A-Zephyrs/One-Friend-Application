package activity_login.onefriend;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import static android.content.Context.BIND_AUTO_CREATE;

/**
 * Created by Barry on 16/8/17.
 */

public class TabMusic extends ListFragment  {
    MyServiceConn conn;
    Intent intent;
    MusicInterface mi;

    //用于设置音乐播放器的播放进度
    private static SeekBar sb;

    private static TextView tv_progress;
    private static TextView tv_total;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.exmple_main, container, false);
        ListView vncListView = (ListView)rootView.findViewById(android.R.id.list);
        Button play=(Button)rootView.findViewById(R.id.bplay);
        Button pauseplay=(Button)rootView.findViewById(R.id.bpauseplay);
        Button continueplay=(Button)rootView.findViewById(R.id.bcontinueplay);

        // 生成动态数组，加入数据
        ArrayList<HashMap<String, Object>> remoteWindowItem = new ArrayList<HashMap<String, Object>>();
        int[] dataCell = new int[] {R.id.ItemImage,R.id.ItemWinName,R.id.ItemWinName2,R.id.ItemWinName3,R.id.ItemCloseWin};
        for(int i=0;i<6;i++)
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
                this.getActivity(),
                remoteWindowItem,//数据源
                R.layout.example,//ListItem的XML实现

                //动态数组与ImageItem对应的子项
                new String[] {"ItemImage","ItemWinName","ItemWinName2","ItemWinName3","ItemCloseWin"},
                //ImageItem的XML文件里的一个ImageVi面ew,两个TextView ID
                new int[] {R.id.ItemImage,R.id.ItemWinName,R.id.ItemWinName2,R.id.ItemWinName3,R.id.ItemCloseWin}
        );


        tv_progress = (TextView) rootView.findViewById(R.id.tv_progress);
        tv_total = (TextView) rootView.findViewById(R.id.tv_total);

        //创建意图对象
        intent = new Intent(this.getActivity(), MusicService.class);

        //启动服务
        this.getActivity().startService(intent);

        //创建服务连接对象
        conn = new TabMusic.MyServiceConn();

        //绑定服务
        this.getActivity().bindService(intent, conn, BIND_AUTO_CREATE);

        //获得布局文件上的滑动条
        sb = (SeekBar) rootView.findViewById(R.id.sb);

        //为滑动条添加事件监听
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            //当滑动条中的进度改变后,此方法被调用
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            //滑动条刚开始滑动,此方法被调用
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            //当滑动条停止滑动,此方法被调用
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                //根据拖动的进度改变音乐播放进度
                int progress = seekBar.getProgress();

                //改变播放进度
                mi.seekTo(progress);
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mi.play();
            }
            });

        pauseplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mi.pausePlay();;
            }
        });

        continueplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mi.continuePlay();;
            }
        });


        vncListView.setAdapter(listItemAdapter);
        return rootView;
    }

    public static Handler handler = new Handler(){

        //在主线程中处理从子线程发送过来的消息
        @Override
        public void handleMessage(Message msg) {

            //获取从子线程发送过来的音乐播放的进度
            Bundle bundle = msg.getData();

            //歌曲的总时长(毫秒)
            int duration = bundle.getInt("duration");

            //歌曲的当前进度(毫秒)
            int currentPostition = bundle.getInt("currentPosition");

            //刷新滑块的进度
            sb.setMax(duration);
            sb.setProgress(currentPostition);

            //歌曲的总时长
            int minute = duration / 1000 / 60;
            int second = duration / 1000 % 60;

            String strMinute = null;
            String strSecond = null;

            //如果歌曲的时间中的分钟小于10
            if(minute < 10) {

                //在分钟的前面加一个0
                strMinute = "0" + minute;
            } else {

                strMinute = minute + "";
            }

            //如果歌曲的时间中的秒钟小于10
            if(second < 10)
            {
                //在秒钟前面加一个0
                strSecond = "0" + second;
            } else {

                strSecond = second + "";
            }

            tv_total.setText(strMinute + ":" + strSecond);

            //歌曲当前播放时长
            minute = currentPostition / 1000 / 60;
            second = currentPostition / 1000 % 60;

            //如果歌曲的时间中的分钟小于10
            if(minute < 10) {

                //在分钟的前面加一个0
                strMinute = "0" + minute;
            } else {

                strMinute = minute + "";
            }

            //如果歌曲的时间中的秒钟小于10
            if(second < 10) {

                //在秒钟前面加一个0
                strSecond = "0" + second;
            } else {

                strSecond = second + "";
            }

            tv_progress.setText(strMinute + ":" + strSecond);
        }
    };


//    //播放音乐按钮响应函数
//    public void play (View view) {
//        //播放音乐
//        mi.play();
//    }
//
//    //暂停播放音乐按钮响应函数
//    public void pausePlay(View view) {
//
//        //暂停播放音乐
//        mi.pausePlay();
//    }
//
//    //继续播放音乐按钮响应函数
//    public void continuePlay (View view) {
//
//        //继续播放音乐
//        mi.continuePlay();
//    }

    //退出音乐播放按钮响应函数
    public void exit(View view) {

        //解绑服务
        this.getActivity().unbindService(conn);

        //停止服务
        this.getActivity().stopService(intent);

        //结束这个activity
        getActivity().finish();
    }

    //实现服务器连接接口
    class MyServiceConn implements ServiceConnection {

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {

            //获得中间人对象
            mi = (MusicInterface) service;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    }





    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // TODO Auto-generated method stub
        super.onListItemClick(l, v, position, id);
        l.getItemAtPosition(position);
//        Intent testintent = new Intent(this.getActivity(),MusicPlay.class);
//        startActivity(testintent);

//
//        new AlertDialog.Builder(this.getActivity()).setTitle("我的listview").setMessage("介绍...")
//                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                    }}).show();
    }





}
