package g.sns_test.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

public class PageFourFragment extends Fragment {

    public static Fragment newInstance() {
        Bundle args = new Bundle();
        PageFourFragment fragment = new PageFourFragment();
        fragment.setArguments(args);
        return fragment;

    }


}
