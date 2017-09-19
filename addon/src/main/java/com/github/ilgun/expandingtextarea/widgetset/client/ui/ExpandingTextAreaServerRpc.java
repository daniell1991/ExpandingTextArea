package com.github.ilgun.expandingtextarea.widgetset.client.ui;

import com.vaadin.shared.communication.ServerRpc;

public interface ExpandingTextAreaServerRpc extends ServerRpc {
	
	void setRows(int rows);

}
