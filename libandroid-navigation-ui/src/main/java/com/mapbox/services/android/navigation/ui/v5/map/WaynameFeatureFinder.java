package com.mapbox.services.android.navigation.ui.v5.map;

import android.graphics.PointF;

import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.geojson.Feature;

import java.util.List;

class WaynameFeatureFinder {

  private MapLibreMap mapboxMap;

  WaynameFeatureFinder(MapLibreMap mapboxMap) {
    this.mapboxMap = mapboxMap;
  }

  List<Feature> queryRenderedFeatures(PointF point, String[] layerIds) {
    return mapboxMap.queryRenderedFeatures(point, layerIds);
  }
}
