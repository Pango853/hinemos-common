/*

Copyright (C) 2006 NTT DATA Corporation

This program is free software; you can redistribute it and/or
Modify it under the terms of the GNU General Public License
as published by the Free Software Foundation, version 2.

This program is distributed in the hope that it will be
useful, but WITHOUT ANY WARRANTY; without even the implied
warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
PURPOSE.  See the GNU General Public License for more details.

 */

package com.clustercontrol.util;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * リソース取得クラス<BR>
 * 
 * @version 1.0.0
 * @since 1.0.0
 */
public class Messages {
	private static final String RESOURCE_BUNDLE = "com.clustercontrol.util.messages";

	private static ResourceBundle m_bundle = ResourceBundle
			.getBundle(RESOURCE_BUNDLE);

	private Messages() {

	}

	/**
	 * リソースバンドルを返します。
	 * 
	 * @return リソースバンドル
	 */
	public static ResourceBundle getBundle() {
		return m_bundle;
	}

	/**
	 * Returns the formatted message for the given key in the resource bundle.
	 * 
	 * @param key
	 *            the resource name
	 * @param args
	 *            the message arguments
	 * @return the string
	 */
	public static String getString(String key, Object[] args) {
		MessageFormat messageFormat = new MessageFormat(getString(key));
		return messageFormat.format(args);
	}

	/**
	 * Returns the resource object with the given key in the resource bundle. If
	 * there isn't any value under the given key, the key is returned.
	 * 
	 * @param key
	 *            the resource name
	 * @return the string
	 */
	public static String getString(String key) {
		try {
			return m_bundle.getString(key);
		} catch (MissingResourceException e) {
			return key;
		}
	}

	/**
	 * Returns the resource object with the given key in the resource bundle. If
	 * there isn't any value under the given key, the default value is returned.
	 * 
	 * @param key
	 *            the resource name
	 * @param def
	 *            the default value
	 * @return the string
	 */
	public static String getString(String key, String def) {
		try {
			return m_bundle.getString(key);
		} catch (MissingResourceException e) {
			return def;
		}
	}

	/**
	 * Returns the formatted message for the given key in the resource bundle.
	 * 
	 * @param key
	 *            the resource name
	 * @param args
	 *            the message arguments
	 * @param locale
	 * @return the string
	 */
	public static String getString(String key, Object[] args, Locale locale) {
		MessageFormat messageFormat = new MessageFormat(getString(key, locale));
		return messageFormat.format(args);
	}

	/**
	 * Returns the resource object with the given key in the resource bundle. If
	 * there isn't any value under the given key, the key is returned.
	 * 
	 * @param key
	 *            the resource name
	 * @param locale
	 * @return the string
	 */
	public static String getString(String key, Locale locale) {
		ResourceBundle bundle = ResourceBundle.getBundle(RESOURCE_BUNDLE,
				locale);
		try {
			return bundle.getString(key);
		} catch (MissingResourceException e) {
			return key;
		}
	}

	/**
	 * Returns the resource object with the given key in the resource bundle. If
	 * there isn't any value under the given key, the default value is returned.
	 * 
	 * @param key
	 *            the resource name
	 * @param def
	 *            the default value
	 * @param locale
	 * @return the string
	 */
	public static String getString(String key, String def, Locale locale) {
		ResourceBundle bundle = ResourceBundle.getBundle(RESOURCE_BUNDLE,
				locale);
		try {
			return bundle.getString(key);
		} catch (MissingResourceException e) {
			return def;
		}
	}

}