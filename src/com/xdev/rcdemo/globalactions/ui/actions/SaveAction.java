package com.xdev.rcdemo.globalactions.ui.actions;

import com.vaadin.server.FontAwesome;
import com.xdev.ui.action.ContextSensitiveAction;
import com.xdev.ui.action.Shortcut;
import com.xdev.ui.event.ActionEvent;

public class SaveAction extends ContextSensitiveAction<SaveHandler> {

	public SaveAction() {
		setCaption("Save");
		setIcon(FontAwesome.SAVE);
		setShortcut(new Shortcut(Shortcut.S, Shortcut.CTRL));
	}

	@Override
	protected void update(final SaveHandler handler) {
		setEnabled(handler != null && handler.isSaveEnabled());
	}

	@Override
	public void actionPerformed(final ActionEvent e) {
		getHandler().save();
	}
}
