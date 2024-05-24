package com.mapbox.services.android.navigation.ui.v5.camera;

import org.maplibre.android.camera.CameraUpdate;
import org.maplibre.android.maps.MapLibreMap;

class CameraOverviewCancelableCallback implements MapLibreMap.CancelableCallback {

  private static final int OVERVIEW_UPDATE_DURATION_IN_MILLIS = 750;

  private CameraUpdate overviewUpdate;
  private MapLibreMap mapboxMap;

  CameraOverviewCancelableCallback(CameraUpdate overviewUpdate, MapLibreMap mapboxMap) {
    this.overviewUpdate = overviewUpdate;
    this.mapboxMap = mapboxMap;
  }

  @Override
  public void onCancel() {
    // No-op
  }

  @Override
  public void onFinish() {
    mapboxMap.animateCamera(overviewUpdate, OVERVIEW_UPDATE_DURATION_IN_MILLIS);
  }
}
