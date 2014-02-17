package ustc.sse.apollo.util;

public class BusinessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 645144594184414682L;

	public BusinessException() {
		super();
	}

	public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Exception ex) {
        super(message, ex);
    }

    public BusinessException(Exception ex) {
        super(ex);
    }

}
