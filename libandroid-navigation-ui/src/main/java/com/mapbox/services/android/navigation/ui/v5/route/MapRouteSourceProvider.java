package com.mapbox.services.android.navigation.ui.v5.route;

import org.maplibre.android.style.sources.GeoJsonOptions;
import org.maplibre.android.style.sources.GeoJsonSource;
import org.maplibre.geojson.FeatureCollection;

class MapRouteSourceProvider {

  GeoJsonSource build(String id, FeatureCollection featureCollection, GeoJsonOptions options) {
    return new GeoJsonSource(id, featureCollection, options);
  }
}
