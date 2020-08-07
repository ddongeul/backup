package g.sns_test.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

public class PageFiveFragment extends Fragment {

    public static Fragment newInstance() {
        Bundle args = new Bundle();
        PageFiveFragment fragment = new PageFiveFragment();
        fragment.setArguments(args);
        return fragment;

    }


}
