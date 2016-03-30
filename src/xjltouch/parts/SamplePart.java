/*******************************************************************************
 * Copyright (c) 2010 - 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Lars Vogel <lars.Vogel@gmail.com> - Bug 419770
 *******************************************************************************/
package xjltouch.parts;


import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.TouchEvent;
import org.eclipse.swt.events.TouchListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class SamplePart {
	

	@Inject
	private MDirtyable dirty;

	@PostConstruct
	public void createComposite(Composite parent) {
		parent.setLayout(new GridLayout(2, false));
		Button paihao = new Button(parent, SWT.BORDER);
		paihao.setText("�ź�");
		paihao.addTouchListener(new TouchListener() {
			@Override
			public void touch(TouchEvent arg0) {
				paihao.setText("100��");
			}
		});
		paihao.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseUp(MouseEvent arg0) {
				
			}
			
			@Override
			public void mouseDown(MouseEvent arg0) {
				paihao.setText("101��");
			}
			
			@Override
			public void mouseDoubleClick(MouseEvent arg0) {
				paihao.setText("�ź�");
				
			}
		});
		Button baobiao = new Button(parent, SWT.BORDER);
		baobiao.setText("����");
		Button zhengjian = new Button(parent, SWT.BORDER);
		zhengjian.setText("֤��");
		Button ��֤ = new Button(parent, SWT.BORDER);
		��֤.setText("��֤");
		Button shenbao = new Button(parent, SWT.BORDER);
		shenbao.setText("�걨");
		Button ��ѯ = new Button(parent, SWT.BORDER);
		��ѯ.setText("��ѯ");
		Button ���� = new Button(parent, SWT.BORDER);
		����.setText("����");
	}

	@Focus
	public void setFocus() {
		
	}

	@Persist
	public void save() {
		dirty.setDirty(false);
	}
}