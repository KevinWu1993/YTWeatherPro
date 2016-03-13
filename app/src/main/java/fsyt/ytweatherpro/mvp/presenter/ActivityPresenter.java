package fsyt.ytweatherpro.mvp.presenter;

import android.app.Activity;
import android.support.v7.widget.Toolbar;

/**
 * Created by KevinWu on 16-2-25.
 */
public interface ActivityPresenter {

    void buildToolbar(Activity activity, Toolbar toolbar);

    void buildMenu();

}
