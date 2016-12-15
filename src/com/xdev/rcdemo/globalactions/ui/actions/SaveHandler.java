package com.xdev.rcdemo.globalactions.ui.actions;

import com.xdev.ui.action.ContextSensitiveHandler;

public interface SaveHandler extends ContextSensitiveHandler {

	public void save();

	public default boolean isSaveEnabled() {
		return true;
	}
}
