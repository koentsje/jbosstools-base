/*******************************************************************************
 * Copyright (c) 2010 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.usage.util.collectionfilter;

/**
 * @authro Andre Dietisheim
 */
public interface ICollectionFilter<E> {

	/**
	 * Returns <code>true</code> if the given entry matches the criteria in this filter.
	 * 
	 * @param bundle
	 *            the bundle
	 * @return true, if successful
	 */
	public boolean matches(E entry);
}