package com.talaria.common;

import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;


/**
 * XSSFilterRequestWrapper.java
 * @author    : park hak shin
 * @date    : 2015. 4. 1.
 * @brief   :   XSSFilter 관련 필터링 처리
 * @description  : XSSFilter 관련 패턴 설정
 *
 */
public class XSSFilterRequestWrapper extends HttpServletRequestWrapper {


//	private static String[] tagChar = {"<", ">", "#", "'", "\"", "(", ")", "{", "}", "!", "$", "%", "^", "*"}; // 잡아서 변환할 태그 목록
//
//	private static String[] convertChar = {"&lt;", "&gt;", "&#35;", "&#39;", "&quot;", "&#40;", "&#41;", "&#123;", "&#125;", "&#33;", "&#36;", "&#37;", "&#94;", "&#42;"}; // 변환될 태그의 asc 코드


	/**  <code>patterns</code> :. */
	private static Pattern[] patterns = new Pattern[] {
		// Script fragments
		Pattern.compile("<script>(.*?)</script>", Pattern.CASE_INSENSITIVE),

		// src='...'
		Pattern.compile("src[\r\n]*=[\r\n]*\\\'(.*?)\\\'", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL),
		Pattern.compile("src[\r\n]*=[\r\n]*\\\"(.*?)\\\"", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL),
		// lonely script tags
		//Pattern.compile("</script>", Pattern.CASE_INSENSITIVE),
		//Pattern.compile("<script(.*?)>", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL),
		// eval(...)
		Pattern.compile("eval\\((.*?)\\)", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL),
		// expression(...)
		Pattern.compile("expression\\((.*?)\\)", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL),
		// javascript:...
		Pattern.compile("javascript:", Pattern.CASE_INSENSITIVE),
		// vbscript:...
		Pattern.compile("vbscript:", Pattern.CASE_INSENSITIVE),
		// onload(...)=...
		Pattern.compile("onload(.*?)=", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL),

		//Pattern.compile("alert", Pattern.CASE_INSENSITIVE),
	};


	//20150611 보안점검조치
	/** The tag char. */
	private static String[] tagChar = {"<", ">"}; // 잡아서 변환할 태그 목록

	/** The convert char. */
	private static String[] convertChar = {"&lt;", "&gt;"}; // 변환될 태그의 asc 코드

	/**
	 * Gets the tag char.
	 *
	 * @return the tag char
	 */
	public String[] getTagChar(){
		return this.tagChar;
	}

	/**
	 * Gets the convert char.
	 *
	 * @return the convert char
	 */
	public String[] getConvertChar(){
		return this.convertChar;
	}



	/**
	 * Instantiates a new XSS filter request wrapper.
	 *
	 * @param request the request
	 * @brief 생성자
	 */
	public XSSFilterRequestWrapper(HttpServletRequest request) {
		super(request);
	}




	/* (non-Javadoc)
	 * @see javax.servlet.ServletRequestWrapper#getParameter(java.lang.String)
	 */
	@Override
	public String getParameter(String name) {
		String value = super.getParameter(name);

		if(value == null)
			return null;

		return filter(value);
	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletRequestWrapper#getParameterValues(java.lang.String)
	 */
	@Override
	public String[] getParameterValues(String name) {
		String[] values = super.getParameterValues(name);

		if(values == null)
			return null;

		String[] encodedValues = new String[values.length];

		for(int i=0; i<values.length; i++) {
			encodedValues[i] = filter(values[i]);
		}

		return encodedValues;
	}

	/**
	 * Filter.
	 *
	 * @param value the value
	 * @return the string
	 */
	private String filter( String value ) {
		if(value == null)
			return null;

		for(int i=0; i<tagChar.length; i++) {
			value = value.replace(tagChar[i], convertChar[i]);
		}

		for(Pattern scriptPattern : patterns) {
			value = scriptPattern.matcher(value).replaceAll("");
		}

		return value;
	}

}
