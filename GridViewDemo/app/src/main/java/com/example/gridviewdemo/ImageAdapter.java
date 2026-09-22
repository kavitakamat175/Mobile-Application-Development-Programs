package com.example.gridviewdemo;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    int[] images={R.drawable.apple,R.drawable.coconut,R.drawable.pear,R.drawable.mausambi,R.drawable.pomogranate,R.drawable.orange,
    R.drawable.strawberry, R.drawable.pineapple, R.drawable.watermelon};

    Context context;
    ImageAdapter(Context context)
    {
        this.context=context;
    }
    @Override
    public int getCount() {
        return images.length;
    }
    @Override
    public Object getItem(int i) {
        return images[i];
    }
    @Override
    public long getItemId(int i) {
        return i;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView=new ImageView(context);
        imageView.setLayoutParams(
                new GridView.LayoutParams(
                        GridView.LayoutParams.MATCH_PARENT,
                        300
                )
        );
        imageView.setImageResource(images[i]);
        return imageView;
    }
}
