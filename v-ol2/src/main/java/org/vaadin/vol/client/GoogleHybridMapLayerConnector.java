package org.vaadin.vol.client;

import com.google.gwt.core.client.GWT;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;

import org.vaadin.vol.GoogleHybridMapLayer;
import org.vaadin.vol.client.ui.VGoogleHybridMapLayer;

@Connect(GoogleHybridMapLayer.class)
public class GoogleHybridMapLayerConnector extends AbstractComponentConnector {

    @Override
    public VGoogleHybridMapLayer createWidget() {
        return GWT.create(VGoogleHybridMapLayer.class);
    }

    @Override
    public VGoogleHybridMapLayer getWidget() {
        return (VGoogleHybridMapLayer)super.getWidget();
    }

    @Override
    public GoogleMapLayerState getState() {
        return (GoogleMapLayerState)super.getState();
    }
}
