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

public class PageTwoFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutmanager;
    private FirstAdapter firstAdapter;
    private ArrayList<String> cNames = new ArrayList<>();
    private ArrayList<String> cImageUrls = new ArrayList<>();
    private ArrayList<CrewItem> nItems;

    public static PageTwoFragment newInstance() {
        Bundle args = new Bundle();
        PageTwoFragment fragment = new PageTwoFragment();
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

        cImageUrls.add("https://cdn.pixabay.com/photo/2020/05/23/11/01/pond-5209108_960_720.jpg");
        cNames.add("Hi");

        cImageUrls.add("https://cdn.pixabay.com/photo/2020/05/23/11/01/pond-5209108_960_720.jpg");
        cNames.add("Hello");

        cImageUrls.add("https://cdn.pixabay.com/photo/2020/05/23/11/01/pond-5209108_960_720.jpg");
        cNames.add("goodevening");

        cImageUrls.add("https://cdn.pixabay.com/photo/2020/05/23/11/01/pond-5209108_960_720.jpg");
        cNames.add("goodafternoon");

        return  view;
    }

}


