package org.yetiz.utils.exception;

/**
 * Created by yeti on 16/3/25.
 */
public class YException extends RuntimeException {
	public YException() {
	}

	public YException(String message) {
		super(message);
	}

	public YException(Throwable cause) {
		super(cause);
	}
}
