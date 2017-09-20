package com.zephyrs.android.onefriend;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

/**
 * Created by Barry on 17/9/17.
 */

public class WebviewMeditation extends AppCompatActivity {
    private WebView webView;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview_meditation);
        // 获取控件对象
        webView = (WebView) findViewById(R.id.webView1);
        back = (Button) findViewById(R.id.back_button);
        webView.loadUrl("http://www.monash.edu/health/mindfulness/programs/lunch-time-meditation");
        WebSettings websettings = webView.getSettings();
// 设置支持javascript代码
        websettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // 打开地址
                view.loadUrl(url);
                // 返回的是true，代表在webView控件中打开，否则在系统的浏览器中打开
                return true;
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && webView.canGoBack()) {
            webView.goBack();
            return true;
        } else {
            return super.onKeyDown(keyCode, event);
        }
    }

    @Override
    public void onBackPressed() {
        // 判断是否能够回退
        if (webView.canGoBack()) {
            webView.goBack();// 返回
        } else {
            super.onBackPressed();
        }
    }
}

