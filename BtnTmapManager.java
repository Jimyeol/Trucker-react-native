package com.t_map_app;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class BtnTmapManager extends SimpleViewManager<BtnTmap> {

    @Override
    public String getName() {
        return "BtnTmap";
    }

    @Override
    protected BtnTmap createViewInstance(ThemedReactContext reactContext) {
        BtnTmap btnTmap = new BtnTmap(reactContext);
        return btnTmap;
    }

    /* 지도 센터 설정 */
    @ReactProp(name="moveTmap")
    public void setCenter(BtnTmap btnTmap, ReadableArray coordinate) {
        btnTmap.runTmap(coordinate);
    }
}