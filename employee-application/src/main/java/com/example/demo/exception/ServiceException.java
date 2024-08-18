package com.example.demo.exception;

/**
 * @author omidp
 *
 */
public class ServiceException extends RuntimeException
{

    int code;
    private String serverDate = "N/A";
    private String refId = "N/A";

    public ServiceException()
    {
        super();
    }

    public ServiceException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public ServiceException(String message)
    {
        super(message);
    }

    public ServiceException(String message, int code)
    {
        super(message);
        this.code = code;
    }

    public ServiceException(String message, int code, String serverDate, String refId)
    {
        super(message);
        this.code = code;
        this.serverDate = serverDate;
        this.refId = refId;
    }

    public ServiceException(Throwable cause)
    {
        super(cause);
    }

    public int getCode()
    {
        return code;
    }

    public String getServerDate()
    {
        return serverDate;
    }

    public String getRefId()
    {
        return refId;
    }

}
