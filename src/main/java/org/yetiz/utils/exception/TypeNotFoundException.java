package org.yetiz.utils.exception;

/**
 * Created by yeti on 2016/4/8.
 */
public class TypeNotFoundException extends YException {
	public TypeNotFoundException() {
	}

	public TypeNotFoundException(String message) {
		super(message);
	}

	public TypeNotFoundException(Throwable cause) {
		super(cause);
	}
}
