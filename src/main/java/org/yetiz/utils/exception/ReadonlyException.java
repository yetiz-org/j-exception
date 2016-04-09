package org.yetiz.utils.exception;

/**
 * Created by yeti on 16/4/8.
 */
public class ReadonlyException extends YException {
	public ReadonlyException() {
	}

	public ReadonlyException(String message) {
		super(message);
	}

	public ReadonlyException(Throwable cause) {
		super(cause);
	}
}
