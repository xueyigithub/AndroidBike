package com.zjnu.androidbike.activity;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.zjnu.androidbike.R;
import com.zjnu.androidbike.doamin.PlayGuide;
import com.zjnu.androidbike.dto.Page;
import com.zjnu.androidbike.enums.CityEnum;
import com.zjnu.androidbike.service.CallService;

import butterknife.Bind;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Bind(R.id.text_username)
    EditText username;

    @Bind(R.id.text_password)
    EditText password;

    @BindString(R.string.login_error)
    String loginErrorMessage;

    @Bind(R.id.toolbar)
    Toolbar toolbar;

    //测试
    int i = 0;

    @OnClick(R.id.button_login)
    void button_login() {
        Call<Page<PlayGuide>> call = CallService.service.listPlayGuide(i++, CityEnum.Jinhua);
        call.enqueue(new Callback<Page<PlayGuide>>() {
                         @Override
                         public void onResponse(Response<Page<PlayGuide>> response, Retrofit retrofit) {
                             Page<PlayGuide> playGuidePage = response.body();
                             //Log.d(TAG, response.body().getTotalPages().toString());
                             for (PlayGuide playGuide : playGuidePage.getContent()) {
                                 Log.d(TAG, playGuide.toString());
                             }
                         }

                         @Override
                         public void onFailure(Throwable t) {
                             Log.d(TAG, "onFailure");
                         }
                     }
        );
    }

    @OnClick(R.id.fab)
    void fab_settings(View view) {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
