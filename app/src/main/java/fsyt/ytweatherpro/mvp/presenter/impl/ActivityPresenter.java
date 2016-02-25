package fsyt.ytweatherpro.mvp.presenter.impl;

import android.os.Bundle;

/**
 * Created by KevinWu on 16-2-25.
 */
public interface ActivityPresenter {

    void onCreate(Bundle savedInstanceState);

    void onResume();

    void onStart();

    void onPause();

    void onStop();

    void onDestroy();

}
