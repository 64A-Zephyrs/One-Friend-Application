package activity_login.onefriend;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Barry on 21/4/17.
 */

public class MainFragment extends Fragment {
    View vMain4;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        vMain4 = inflater.inflate(R.layout.fragment_main, container, false);
        return vMain4;
    }
}
