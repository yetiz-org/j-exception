package org.yetiz.utils.exception;

/**
 * Created by yeti on 16/4/1.
 */
public class DuplicateException extends YException {
	public DuplicateException() {
	}

	public DuplicateException(String message) {
		super(message);
	}

	public DuplicateException(Throwable cause) {
		super(cause);
	}
}
