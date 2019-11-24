package com.t_map_app;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.Toast;

import com.skt.Tmap.TMapTapi;
import com.facebook.react.bridge.ReadableArray;

public class BtnTmap extends Button  {
    Context ctx;
    public BtnTmap(Context context) {
        super(context);
        ctx = context;
        TMapTapi tmaptapi = new TMapTapi(context);
        tmaptapi.setSKTMapAuthentication ("88bebbd6-8f99-4144-a656-46abd418bba8");
        
        //tmaptapi.invokeRoute("T타워", 126.984098f, 37.566385f);

        boolean isTmapApp = tmaptapi.isTmapApplicationInstalled();

        this.setTextColor(Color.BLUE);
        if( isTmapApp ) {
            this.setText("Hello");
        } else { 
            this.setText("Fuck");  
        }
        
    }

    public BtnTmap(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BtnTmap(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void runTmap(ReadableArray coordinate)
    {
        Toast.makeText(ctx, "Hello", Toast.LENGTH_SHORT).show();
    }
}
