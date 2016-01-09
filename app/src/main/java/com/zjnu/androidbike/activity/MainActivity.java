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

import com.activeandroid.ActiveAndroid;
import com.activeandroid.rxschedulers.AndroidSchedulers;
import com.zjnu.androidbike.R;
import com.zjnu.androidbike.dao.Dao;
import com.zjnu.androidbike.doamin.PlayGuide;
import com.zjnu.androidbike.doamin.User;
import com.zjnu.androidbike.dto.Page;
import com.zjnu.androidbike.enums.CityEnum;
import com.zjnu.androidbike.service.CallService;
import com.zjnu.androidbike.util.MapUtils;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.Bind;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.Lazy;
import rx.Observer;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

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

    @Inject
    Lazy<User> user;

    @Inject
    @Named("Hangzhou")
    PlayGuide hangzhouPlayGuide;

    @Inject
    @Named("Jinhua")
    Lazy<PlayGuide> jinhuaPlayGuide;

    //测试
    int i = 0;

    @OnClick(R.id.button_login)
    void button_login() {
        //Call<Page<PlayGuide>> call = CallService.service.listPlayGuide(i++, CityEnum.Jinhua);
        PlayGuide playGuide = PlayGuide.builder().city(CityEnum.Hangzhou).build();
        /*Call<Page<PlayGuide>> call = CallService.service.listPlayGuide(i++, MapUtils.getValueMap(playGuide));
        call.enqueue(new Callback<Page<PlayGuide>>() {
                         @Override
                         public void onResponse(Response<Page<PlayGuide>> response, Retrofit retrofit) {
                             Page<PlayGuide> playGuidePage = response.body();
                             for (PlayGuide playGuide : playGuidePage.getContent()) {
                                 Log.d(TAG, playGuide.toString());
                                 *//*DbModel db = new DbModel(playGuide);
                                 Log.d(TAG, db.toString());
                                 db.save();*//*
                                 //new DbModel(playGuide).save();
                                 Dao.save(playGuide);
                                 DbPlayGuide dbPlayGuide = DbPlayGuide.builder().playGuide(playGuide).id(playGuide.getId()).hasLogin(true).testStr("aa").build();
                                 Dao.save(dbPlayGuide);

                             }
                         }

                         @Override
                         public void onFailure(Throwable t) {
                             Log.d(TAG, "onFailure");
                         }
                     }
        );*/

        Log.d(TAG, user == null ? "null" : user.toString());
        Log.d(TAG, hangzhouPlayGuide == null ? "null" : hangzhouPlayGuide.toString());
        Log.d(TAG, jinhuaPlayGuide == null ? "null" : jinhuaPlayGuide.toString());

        CallService.service.listPlayGuideByObservable(i++, MapUtils.getValueMap(playGuide))
                .subscribeOn(Schedulers.io())
                .doOnNext(new Action1<Page<PlayGuide>>() {
                    @Override
                    public void call(Page<PlayGuide> playGuidePage) {
                        int j = 0;
                        for (PlayGuide playGuide : playGuidePage.getContent()) {
                            Log.d(TAG, "playGuide" + j++);
                            //Dao.save(playGuide);
                        }
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Page<PlayGuide>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Page<PlayGuide> playGuidePage) {
                        for (PlayGuide playGuide : playGuidePage.getContent()) {
                            //Log.d(TAG, playGuide.toString());
                        }
                        Dao.saveAll(playGuidePage.getContent());
                    }
                });

        /*User user = User.builder().userName("1").password("2").build();
        user.setPassword("1");*/
        /*Log.d(TAG, user.toString());
        Call<User> call2 = CallService.service.login("1", "1");
        Map<String, Object> options = new HashMap<>();
        options.put("userName", "1");
        options.put("password", "1");
        Call<User> call2 = CallService.service.login(options);*/
        /*Call<User> call2 = CallService.service.login(MapUtils.getValueMap(user));
        call2.enqueue(new Callback<User>() {
                          @Override
                          public void onResponse(Response<User> response, Retrofit retrofit) {
                              User userBack = response.body();
                              Log.d(TAG, userBack.toString());
                          }

                          @Override
                          public void onFailure(Throwable t) {
                              Log.d(TAG, "onFailure");
                          }
                      }
        );*/
    }

    @OnClick(R.id.button_register)
    void button_register() {
        PlayGuide t = Dao.findOne(PlayGuide.class, "567686b2bffc5f10d2fc6b66");
        Dao.delete(t);
        List<PlayGuide> playGuides = Dao.findAll(PlayGuide.class);
        Log.d(TAG, "" + playGuides.size());
        for (PlayGuide playGuide : playGuides) {
            Log.d(TAG, playGuide.toString());
        }
        Dao.cleanAll(PlayGuide.class);
        List<PlayGuide> playGuides2 = Dao.findAll(PlayGuide.class);
        Log.d(TAG, "" + playGuides2.size());
        /*List<DbModel> dbs = new Select()
                .from(DbModel.class)
                .where("obj = ?", PlayGuide.class.getSimpleName())
                //.and("key = ?", key)
                //.where("obj = ? and key = ?", objClass.getClass().getSimpleName(), key)
                .limit(1)
                .execute();
        Log.d(TAG, "" + dbs.size());*/
        //Log.d(TAG, t.toString());

        //PlayGuide playGuide = new DbModel<PlayGuide>().findOne(PlayGuide.class, "567686b2bffc5f10d2fc6b62");
        /*User u = new User();
        u.setUserName("1");
        u.setPassword("1");
        Log.d(TAG, u.toString());

        PlayGuide p = new PlayGuide("1",null,null,null,new Date(),null,null,null,null);
        Log.d(TAG, p.toString());*/

        /*SqlBrite sqlBrite = SqlBrite.create();
        BriteDatabase db = sqlBrite.wrapDatabaseHelper();
        Observable<SqlBrite.Query> users = db.createQuery("users", "SELECT * FROM users");
        users.subscribe(new Action1<SqlBrite.Query>() {
            @Override public void call(SqlBrite.Query query) {
                Cursor cursor = query.run();
                // TODO parse data...
            }
        });*/
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
        ActiveAndroid.initialize(this);
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
