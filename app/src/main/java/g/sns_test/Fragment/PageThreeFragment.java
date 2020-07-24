package g.sns_test.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import g.sns_test.Adapter.FirstAdapter;
import g.sns_test.Data.CrewItem;
import g.sns_test.R;

public class PageThreeFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutmanager;
    private FirstAdapter firstAdapter;
    private ArrayList<String> cNames = new ArrayList<>();
    private ArrayList<String> cImageUrls = new ArrayList<>();
    private ArrayList<CrewItem> nItems = new ArrayList<>();

    public static Fragment newInstance() {
        Bundle args = new Bundle();
        PageThreeFragment fragment = new PageThreeFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_page_one, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        layoutmanager = new GridLayoutManager(getContext(), 3);
        recyclerView.setLayoutManager(layoutmanager);
        recyclerView.setHasFixedSize(true);

        firstAdapter = new FirstAdapter(getContext(), cNames, cImageUrls, nItems);
        recyclerView.setAdapter(firstAdapter);


        cImageUrls.add("https://cdn.pixabay.com/photo/2020/05/22/14/04/landscape-5205518_960_720.jpg");
        cNames.add("헤잇");

        cImageUrls.add("https://cdn.pixabay.com/photo/2020/05/22/14/04/landscape-5205518_960_720.jpg");
        cNames.add("하잇");

        cImageUrls.add("https://cdn.pixabay.com/photo/2020/05/22/14/04/landscape-5205518_960_720.jpg");
        cNames.add("호잇");

        cImageUrls.add("https://cdn.pixabay.com/photo/2020/05/22/14/04/landscape-5205518_960_720.jpg");
        cNames.add("히잇");

        return  view;
    }


}
