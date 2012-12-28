/*
 * Copyright 2009 IT Mill Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package info.colleoni.basketstats;

import info.colleoni.basketstats.helpers.MenuHelper;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.Application;
import com.vaadin.terminal.Sizeable;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Window;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class BSApplication extends Application {
	private Window window;

	@Autowired
	private MenuHelper menuHelper;

	@Override
	public void init() {
		initLayout();
	}

	private void initLayout() {
		HorizontalSplitPanel hsplit = new HorizontalSplitPanel();
		hsplit.setSplitPosition(20, Sizeable.UNITS_PERCENTAGE);
		
		Panel menuPanel = menuHelper.getMainMenu();
		Panel contentPanel = new Panel();
		contentPanel.setSizeFull();

		menuHelper.setDestinationContainer(contentPanel);
		hsplit.setFirstComponent(menuPanel);
		hsplit.setSecondComponent(contentPanel);
		
		window = new Window("Basket Stats", hsplit);
		setMainWindow(window);	
	}

}
