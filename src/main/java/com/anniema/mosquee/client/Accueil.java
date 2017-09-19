package com.anniema.mosquee.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.UIObject;

import gwt.material.design.addins.client.waterfall.MaterialWaterfall;
import gwt.material.design.client.ui.MaterialNavBar;
import gwt.material.design.client.ui.MaterialNavBrand;
import gwt.material.design.client.ui.MaterialPanel;

public class Accueil extends Composite {
	private static AccueilUiBinder uiBinder = GWT.create(AccueilUiBinder.class);

	interface AccueilUiBinder extends UiBinder<HTMLPanel, Accueil> {
	}


	@UiField MaterialWaterfall waterfall;
	@UiField MaterialPanel panel;
	@UiField MaterialNavBrand navBrand;
//	@UiField MaterialNavBar navBar;
	public Accueil() {
		initWidget(uiBinder.createAndBindUi(this));
		waterfall.setCallbacks(() ->{
			panel.setOpacity(1);
			navBrand.setOpacity(0);
		}, () ->{
			panel.setOpacity(0);
			navBrand.setOpacity(1);
			
		});
	}

}
