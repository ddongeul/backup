package g.sns_test.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

public class PageSixFragment extends Fragment {

    public static Fragment newInstance() {
        Bundle args = new Bundle();
        PageSixFragment fragment = new PageSixFragment();
        fragment.setArguments(args);
        return fragment;

    }


}
