package luzdelmundoapp.madridoficialapp.Principal;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import luzdelmundoapp.madridoficialapp.R;
import luzdelmundoapp.madridoficialapp.Adapter.SlideAdapter;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private SlideAdapter myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        myadapter = new SlideAdapter(this);
        viewPager.setAdapter(myadapter);
    }
}
