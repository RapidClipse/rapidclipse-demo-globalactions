package com.xdev.rcdemo.globalactions.ui;

import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.CustomComponent;
import com.xdev.ui.XdevGridLayout;
import com.xdev.ui.XdevLabel;
import com.xdev.ui.XdevView;

public class View3 extends XdevView {

	/**
	 *
	 */
	public View3() {
		super();
		this.initUI();
	}

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent event) {
		super.enter(event);
	
	}

	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated by
	 * the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.gridLayout = new XdevGridLayout();
		this.label = new XdevLabel();

		this.label.setValue("No save handler");

		this.gridLayout.setColumns(2);
		this.gridLayout.setRows(2);
		this.label.setSizeUndefined();
		this.gridLayout.addComponent(this.label, 0, 0);
		final CustomComponent gridLayout_hSpacer = new CustomComponent();
		gridLayout_hSpacer.setSizeFull();
		this.gridLayout.addComponent(gridLayout_hSpacer, 1, 0, 1, 0);
		this.gridLayout.setColumnExpandRatio(1, 1.0F);
		final CustomComponent gridLayout_vSpacer = new CustomComponent();
		gridLayout_vSpacer.setSizeFull();
		this.gridLayout.addComponent(gridLayout_vSpacer, 0, 1, 0, 1);
		this.gridLayout.setRowExpandRatio(1, 1.0F);
		this.gridLayout.setSizeFull();
		this.setContent(this.gridLayout);
		this.setSizeFull();
	} // </generated-code>

	// <generated-code name="variables">
	private XdevLabel label;
	private XdevGridLayout gridLayout;
	// </generated-code>

}
