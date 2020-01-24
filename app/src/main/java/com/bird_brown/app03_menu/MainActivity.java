package com.bird_brown.app03_menu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // メニューを膨らませます。これにより、アクションバーが存在する場合、アクションバーに項目が追加されます。
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // ここでアクションバー項目のクリックを処理します。AndroidMainfest.xmlで親アクティビティを指定する限り、
        // アクションバーはホーム/アップボタンのクリックを自動的に処理します。
        // int id = item.getItemId();
        // if (id == R.id.action_settings) {
        //    return true;
        // }
        int itemId = item.getItemId();
        String moji = "";

        switch (itemId) {
            case R.id.item1 : moji = "メニュー１が選択されました。"; break;
            case R.id.item2 : moji = "メニュー２が選択されました。"; break;
            case R.id.item3 : moji = "メニュー３が選択されました。"; break;
            case R.id.item4 : moji = "サブメニュー１が選択されました。"; break;
            case R.id.item5 : moji = "サブメニュー２が選択されました。"; break;
        }
        Toast t = Toast.makeText(this, moji, Toast.LENGTH_SHORT);
        t.show();

        return super.onOptionsItemSelected(item);
    }
}
