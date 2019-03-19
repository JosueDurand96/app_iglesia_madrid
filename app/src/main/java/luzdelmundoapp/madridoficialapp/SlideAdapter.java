package luzdelmundoapp.madridoficialapp;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    // list of images
    public int[] lst_images = {
            R.drawable.calendario,
            R.drawable.agenda,
            R.drawable.musica,
           // R.drawable.image_4,

    };
    // list of titles
    public String[] lst_title = {
            "Calendario",
            "Agenda Semanal",
            "Música"

    }   ;
    // list of descriptions
    public String[] lst_description = {
            "Contarás con un calendario que te notificará sobre las fiestas bíblicas a celebrar.",
            "Recibirás la agenda semanal donde se detallarán los privilegios y actividades.",
            "Aqui se encontrarán los cancioneros y la música de los días domingos.",

    };
    // list of background colors
    public int[]  lst_backgroundcolor = {
            Color.rgb(255,235,90),
            Color.rgb(200,55,55),
            Color.rgb(0,100,0),
           // Color.rgb(1,188,212)
    };


    public SlideAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return lst_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(final ViewGroup container, int position) {


        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container,false);
        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide = (ImageView)  view.findViewById(R.id.slideimg);
        TextView txttitle= (TextView) view.findViewById(R.id.txttitle);
        TextView description = (TextView) view.findViewById(R.id.txtdescription);
        layoutslide.setBackgroundColor(lst_backgroundcolor[position]);
        imgslide.setImageResource(lst_images[position]);
        txttitle.setText(lst_title[position]);
        description.setText(lst_description[position]);
        container.addView(view);
        imgslide.setOnClickListener(new View.OnClickListener() {
            public Class<LoginActivity> LoginActivity;

            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,LoginActivity.class);
                context.startActivity(i);
            }
        });
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
