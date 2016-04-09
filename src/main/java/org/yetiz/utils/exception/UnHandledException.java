package org.yetiz.utils.exception;

/**
 * Created by yeti on 16/4/1.
 */
public class UnHandledException extends YException {
	public UnHandledException() {
	}

	public UnHandledException(String message) {
		super(message);
	}

	public UnHandledException(Throwable cause) {
		super(cause);
	}
}
