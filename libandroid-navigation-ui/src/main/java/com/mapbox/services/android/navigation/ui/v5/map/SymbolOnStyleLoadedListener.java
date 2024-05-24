package com.mapbox.services.android.navigation.ui.v5.map;

import android.graphics.Bitmap;

import static com.mapbox.services.android.navigation.ui.v5.map.NavigationSymbolManager.MAPBOX_NAVIGATION_MARKER_NAME;

import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.MapView;

class SymbolOnStyleLoadedListener implements MapView.OnDidFinishLoadingStyleListener {

  private final MapLibreMap mapboxMap;
  private final Bitmap markerBitmap;

  SymbolOnStyleLoadedListener(MapLibreMap mapboxMap, Bitmap markerBitmap) {
    this.mapboxMap = mapboxMap;
    this.markerBitmap = markerBitmap;
  }

  @Override
  public void onDidFinishLoadingStyle() {
    mapboxMap.getStyle().addImage(MAPBOX_NAVIGATION_MARKER_NAME, markerBitmap);
  }
}
