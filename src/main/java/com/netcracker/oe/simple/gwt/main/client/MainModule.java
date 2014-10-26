package com.netcracker.oe.simple.gwt.main.client;

import com.gwtplatform.mvp.client.annotations.DefaultPlace;
import com.gwtplatform.mvp.client.annotations.ErrorPlace;
import com.gwtplatform.mvp.client.annotations.UnauthorizedPlace;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.gwtplatform.mvp.client.proxy.DefaultPlaceManager;
import com.netcracker.oe.simple.gwt.component.application.client.ApplicationModule;

public class MainModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule.Builder().placeManager(DefaultPlaceManager.class).build());
		install(new ApplicationModule());
		
        // DefaultPlaceManager Places
        bindConstant().annotatedWith(DefaultPlace.class).to("");
        bindConstant().annotatedWith(ErrorPlace.class).to("");
        bindConstant().annotatedWith(UnauthorizedPlace.class).to("");
	}

}
