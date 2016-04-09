package org.yetiz.utils.exception;

/**
 * Created by yeti on 16/4/9.
 */
public class InvalidOperationException extends YException {
	public InvalidOperationException() {
	}

	public InvalidOperationException(String message) {
		super(message);
	}

	public InvalidOperationException(Throwable cause) {
		super(cause);
	}
}
